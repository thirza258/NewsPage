package com.example.newspage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newspage.MainActivity;
import com.example.newspage.R;
import com.example.newspage.class_content.NewNews;

import java.util.List;

public class NewNewsAdapter extends RecyclerView.Adapter<NewNewsAdapter.ViewHolder> {

    private final List<NewNews> new_data;
    private MainActivity mainActivity;

    public NewNewsAdapter(List<NewNews> new_data) {
        this.new_data = new_data;
    }

    @NonNull
    @Override
    public NewNewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_news_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewNewsAdapter.ViewHolder holder, int position) {
        NewNews item = new_data.get(position);
        holder.textTitle.setText(item.getTitle());
        holder.contentText.setText(item.getContent());
    }

    @Override
    public int getItemCount() {
        return new_data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle, contentText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.new_news_title);
            contentText = itemView.findViewById(R.id.new_news_content);

        }
    }
}
