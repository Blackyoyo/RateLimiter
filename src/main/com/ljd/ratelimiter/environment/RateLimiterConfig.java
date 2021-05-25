package main.com.ljd.ratelimiter.environment;

import main.com.ljd.ratelimiter.rule.RuleConfig;
import main.com.ljd.ratelimiter.rule.datasource.FileRuleConfigSource;
import main.com.ljd.ratelimiter.rule.datasource.RuleConfigSource;

public class RateLimiterConfig {
    
      private static final class RateLimiterConfigHolder {
        public static final RateLimiterConfig INSTANCE = new RateLimiterConfig();
      }

      public static final RateLimiterConfig instance() {
        return RateLimiterConfigHolder.INSTANCE;
      }
      
      private RateLimiterConfig() {
          
      }
      
      public RuleConfig load() {
          RuleConfigSource source = new FileRuleConfigSource();
          return source.load();
      }
      
}
