package com.example.task1.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.task1.CustomMovieModel;
import com.example.task1.MyPageAdapter.MovieListAdapter;
import com.example.task1.R;

import java.util.ArrayList;
import java.util.List;


public class Movies extends Fragment {

    ListView listView;
    ListAdapter listAdapter;
    List<CustomMovieModel> custommoviemoadel = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_movies, container, false);
        listView =view.findViewById(R.id.list_items_movies);
        getdata();
        listAdapter = new MovieListAdapter(getContext(),custommoviemoadel,inflater);
        listView.setAdapter(listAdapter);

      return view;




    }

    private  List<CustomMovieModel> getdata() {
        custommoviemoadel = new ArrayList<>();
        custommoviemoadel.add(new CustomMovieModel(R.drawable.ic_launcher_background,"Vera"));
        custommoviemoadel.add(new CustomMovieModel(R.drawable.ic_launcher_background,"Rabasa"));
        custommoviemoadel.add(new CustomMovieModel(R.drawable.ic_launcher_background,"Billa"));
        custommoviemoadel.add(new CustomMovieModel(R.drawable.ic_launcher_background,"Thulasi"));
        custommoviemoadel.add(new CustomMovieModel(R.drawable.ic_launcher_background,"RRR"));
        return custommoviemoadel;
    }
}