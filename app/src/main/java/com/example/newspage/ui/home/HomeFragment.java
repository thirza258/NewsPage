package com.example.newspage.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.example.newspage.R;
import com.example.newspage.adapter.NewNewsAdapter;
import com.example.newspage.adapter.NewsAdapter;
import com.example.newspage.class_content.NewNews;
import com.example.newspage.class_content.News;
import com.example.newspage.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

import kotlin.jvm.internal.Lambda;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView newRecyclerView = root.findViewById(R.id.new_news);
        RecyclerView newsRecyclerView = root.findViewById(R.id.news);

        List<NewNews> new_data = new ArrayList<>();
        List<News> data = new ArrayList<>();

        NewNewsAdapter newNewsAdapter = new NewNewsAdapter(new_data);
        newRecyclerView.setAdapter(newNewsAdapter);

        NewsAdapter newsAdapter = new NewsAdapter(data);
        newsRecyclerView.setAdapter(newsAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}