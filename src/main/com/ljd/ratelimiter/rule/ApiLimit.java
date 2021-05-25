package main.com.ljd.ratelimiter.rule;

public class ApiLimit {
    private static final int DEFAULT_TIME_UNIT = 1; //1s
    private String api;
    private int limit;
    private int unit = DEFAULT_TIME_UNIT;
    
    public ApiLimit() {}
    
    public ApiLimit(String api, int limit) {
        this.api = api;
        this.limit = limit;
    }
    
    public ApiLimit(String api, int limit, int unit) {
        this.api = api;
        this.limit = limit;
        this.unit = unit;
    }
    
    public String getApi() { return this.api; }
    
    public void setApi(String api) { this.api = api; }
    
    public int getLimit() { return this.limit; }
    
    public void setLimit(int limit) { this.limit = limit; }
    
    public int getUnit() { return this.unit; }
    
    public void setUnit(int unit) { this.unit = unit; }
    
}
