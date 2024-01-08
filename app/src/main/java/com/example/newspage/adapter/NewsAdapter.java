package com.example.newspage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newspage.R;
import com.example.newspage.class_content.News;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    List<News> data;

    public NewsAdapter(List<News> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        News item = data.get(position);
        holder.textTitle.setText(item.getTitle());
        holder.contentText.setText(item.getContent());
        holder.imageView.setImageURI(item.getURLImage());
        holder.indexs.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textTitle, contentText, indexs;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.new_news_image);
            textTitle = itemView.findViewById(R.id.new_news_title);
            contentText = itemView.findViewById(R.id.new_news_content);
            indexs = itemView.findViewById(R.id.indexs);
        }
    }
}
