package main.com.ljd.ratelimiter.rule.Parser;

import java.io.InputStream;

import main.com.ljd.ratelimiter.rule.RuleConfig;

public interface RuleConfigParser {
    
    RuleConfig parse(String configText);
    
    RuleConfig parse(InputStream in);
    
}
