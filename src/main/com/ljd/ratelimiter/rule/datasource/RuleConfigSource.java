package main.com.ljd.ratelimiter.rule.datasource;

import main.com.ljd.ratelimiter.rule.RuleConfig;

public interface RuleConfigSource {

    RuleConfig load();
    
}
