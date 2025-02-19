package com.mukeshapps.android_mvvm_retrofit_recyclerview.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mukeshapps.android_mvvm_retrofit_recyclerview.model.Article;
import java.util.List;

/**
 * Model class to keep the objects of all the response
 * Converts Json to POJO objects using Gson.
 */
public class ArticleResponse {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalResults")
    @Expose
    private Integer totalResults;
    @SerializedName("articles")
    @Expose
    private List<Article> articles = null;

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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
