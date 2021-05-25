package main.com.ljd.ratelimiter.rule.Parser;

import java.io.InputStream;

import main.com.ljd.ratelimiter.rule.RuleConfig;
import main.com.ljd.ratelimiter.utils.JsonUtils;

public class JsonRuleConfigParser implements RuleConfigParser {

    @Override
    public RuleConfig parse(String configurationText) {
      return JsonUtils.json2Object(configurationText, RuleConfig.class);
    }

    @Override
    public RuleConfig parse(InputStream in) {
      return JsonUtils.stream2Object(in, RuleConfig.class);
    }
}
