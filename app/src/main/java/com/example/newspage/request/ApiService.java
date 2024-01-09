package com.example.newspage.request;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("your_api_endpoint")
    Call<NewsResponse> getNews();
}
