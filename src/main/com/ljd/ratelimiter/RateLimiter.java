package main.com.ljd.ratelimiter;

import java.util.concurrent.ConcurrentHashMap;

import main.com.ljd.ratelimiter.algorithm.RateLimitAlg;
import main.com.ljd.ratelimiter.rule.RuleConfig;

public interface RateLimiter {
    
    ConcurrentHashMap<String, RateLimitAlg> limit(RuleConfig config);
    
}
