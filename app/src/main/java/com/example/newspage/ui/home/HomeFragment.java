package com.example.newspage.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        new_data.add(new NewNews( "News 1", "This is news 1"));
        new_data.add(new NewNews( "News 2", "This is news 2"));
        new_data.add(new NewNews( "News 3", "This is news 3"));

        data.add(new News("https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FImage&psig=AOvVaw0D9N4fsc0Fl9ouddmUwBZQ&ust=1704861032555000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCyhbS8z4MDFQAAAAAdAAAAABAD"
               , "News 1", "This is news 1", 1));
        data.add(new News("https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FImage&psig=AOvVaw0D9N4fsc0Fl9ouddmUwBZQ&ust=1704861032555000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCyhbS8z4MDFQAAAAAdAAAAABAD"
                , "News 2", "This is news 2", 2));
        data.add(new News("https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FImage&psig=AOvVaw0D9N4fsc0Fl9ouddmUwBZQ&ust=1704861032555000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCyhbS8z4MDFQAAAAAdAAAAABAD"
                , "News 3", "This is news 3", 3));

        NewNewsAdapter newNewsAdapter = new NewNewsAdapter(new_data);
        newRecyclerView.setHasFixedSize(true);
        newRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        newRecyclerView.setAdapter(newNewsAdapter);

        NewsAdapter newsAdapter = new NewsAdapter(data);
        newsRecyclerView.setHasFixedSize(true);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        newsRecyclerView.setAdapter(newsAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}