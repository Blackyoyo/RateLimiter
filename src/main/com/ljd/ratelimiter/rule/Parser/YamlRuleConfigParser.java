package main.com.ljd.ratelimiter.rule.Parser;

import java.io.InputStream;

import main.com.ljd.ratelimiter.rule.RuleConfig;
import main.com.ljd.ratelimiter.utils.YamlUtils;

public class YamlRuleConfigParser implements RuleConfigParser {

    @Override
    public RuleConfig parse(String configurationText) {
      return YamlUtils.parse(configurationText, RuleConfig.class);
    }

    @Override
    public RuleConfig parse(InputStream in) {
      return YamlUtils.parse(in, RuleConfig.class);
    }
}
