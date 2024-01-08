package com.example.newspage.class_content;

public class NewNews {
    private String title;
    private String content;

    public NewNews(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public NewNews() {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
