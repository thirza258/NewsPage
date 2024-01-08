package com.example.newspage.class_content;

import android.net.Uri;

public class News {
    private String URLImage, title, content;
    private int id;

    public News(String URLImage, String title, String content, int id) {
        this.URLImage = URLImage;
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public News() {
    }

    public Uri getURLImage() {
        return Uri.parse(URLImage);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }


}
