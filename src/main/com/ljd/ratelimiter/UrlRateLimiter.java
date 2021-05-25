package main.com.ljd.ratelimiter;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.com.ljd.ratelimiter.algorithm.FixedTimeWindowRateLimitAlg;
import main.com.ljd.ratelimiter.algorithm.RateLimitAlg;
import main.com.ljd.ratelimiter.rule.ApiLimit;
import main.com.ljd.ratelimiter.rule.RuleConfig;
import main.com.ljd.ratelimiter.rule.RuleConfig.AppRuleConfig;

public class UrlRateLimiter implements RateLimiter{
    private static final Logger log = LoggerFactory.getLogger(RateLimiter.class);  
    // 为每个api在内存中存储限流计数器  
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<>();
    
    
    @Override
    public ConcurrentHashMap<String, RateLimitAlg> limit(RuleConfig config) {
        
        for(AppRuleConfig entry : config.getConfigs()) {
            
            for(ApiLimit apiLimit : entry.getLimits()) {
                String counterKey = entry.getAppId() + ":" + apiLimit.getApi();
                RateLimitAlg newRateLimitCounter = new FixedTimeWindowRateLimitAlg(apiLimit.getLimit());
                counters.putIfAbsent(counterKey, newRateLimitCounter);
            }
        }
        
        return counters;
    }

}
