package test.com.ljd.ratelimiter;

import static main.com.ljd.ratelimiter.RateLimiterBeansFactory.BEANS_CONTEXT;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.com.ljd.ratelimiter.algorithm.RateLimitAlg;
import main.com.ljd.ratelimiter.rule.ApiLimit;
import main.com.ljd.ratelimiter.rule.RuleConfig;
import main.com.ljd.ratelimiter.rule.RuleConfig.AppRuleConfig;
import main.com.ljd.ratelimiter.rule.datasource.FileRuleConfigSource;

public class UrlRateLimiterTest {
    private static final Logger log = LoggerFactory.getLogger(UrlRateLimiterTest.class);
    public static void main(String[] args) throws Exception {
        
        RateLimitAlg limiter = BEANS_CONTEXT.obtainLimiter("app-1", "/v1/user");
        for(int i = 1; i <= 200; i++) {
            Thread.sleep(10);
            log.info(String.valueOf(limiter.tryAcquire())+i);
        }
        
    }
}
