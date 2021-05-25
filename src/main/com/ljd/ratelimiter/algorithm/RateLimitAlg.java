package main.com.ljd.ratelimiter.algorithm;

import main.com.ljd.ratelimiter.exception.InternalErrorException;

public interface RateLimitAlg {
    
    boolean tryAcquire() throws InternalErrorException;
    
}
