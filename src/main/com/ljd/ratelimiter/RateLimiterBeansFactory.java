package main.com.ljd.ratelimiter;

import java.util.concurrent.ConcurrentHashMap;

import main.com.ljd.ratelimiter.algorithm.RateLimitAlg;
import main.com.ljd.ratelimiter.environment.RateLimiterConfig;

public class RateLimiterBeansFactory {
    
    public static final RateLimiterBeansFactory BEANS_CONTEXT = new RateLimiterBeansFactory();
    
    private ConcurrentHashMap<String, RateLimitAlg> counters;
    
    private RateLimiterBeansFactory() {
        RateLimiter rateLimiter = new UrlRateLimiter();
        counters = rateLimiter.limit(RateLimiterConfig.instance().load());
    }
    
    public RateLimitAlg obtainLimiter(String appId, String api) {
        return counters.get(appId + ":" + api);
    }
}
