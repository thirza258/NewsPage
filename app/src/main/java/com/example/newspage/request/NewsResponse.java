package com.example.newspage.request;

import com.example.newspage.class_content.News;

import java.util.List;

public class NewsResponse {
    private int status;
    private String message;
    private List<News> data;

    public List<News> getData() {
        return data;
    }

    // Getters and setters
}
