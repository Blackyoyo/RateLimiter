package main.com.ljd.ratelimiter.rule;

import java.util.List;

public class RuleConfig {
    private List<AppRuleConfig> configs;
    
    public List<AppRuleConfig> getConfigs() { return this.configs; }
    
    public void setConfigs(List<AppRuleConfig> configs) { this.configs = configs; }
    
    public static class AppRuleConfig {
        private String appId;
        private List<ApiLimit> limits;
        
        public AppRuleConfig() {}
        
        public AppRuleConfig(String appId, List<ApiLimit> limits) {
            this.appId = appId;
            this.limits = limits;
        }
        
        public String getAppId() { return this.appId; }
        
        public void setAppId(String appId) { this.appId = appId; }
        
        public List<ApiLimit> getLimits() { return this.limits; }
        
        public void setLimits(List<ApiLimit> limits) { this.limits = limits; }
        
    }
}