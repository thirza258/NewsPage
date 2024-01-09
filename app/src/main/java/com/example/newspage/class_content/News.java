package com.example.newspage.class_content;

import android.net.Uri;

public class News {
    private int id;
    private String title;
    private String content;
    private String url_image;
    private String created_at;
    private String deleted_at;

    public News(String url_image, String title, String content, int id) {
        this.url_image = url_image;
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public News() {
    }

    public String getImageURL() {
        return url_image;
    }

    public Uri getURLImage() {
        return Uri.parse(url_image);
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
