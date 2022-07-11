package com.example.muzick.payloads.ApiResponse;

import java.util.Map;

public class NewsApi {
    private String status;
    private Integer totalResults;
    private String[] articles;

    public NewsApi(){

    }

    public NewsApi(String status, Integer totalResults) {
        this.status = status;
        this.totalResults = totalResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
    

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public Map<Object, Object> getArticles() {
    }
}
