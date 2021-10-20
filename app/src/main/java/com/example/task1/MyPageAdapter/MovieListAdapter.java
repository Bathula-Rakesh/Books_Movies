package com.example.task1.MyPageAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task1.CustomMovieModel;
import com.example.task1.DetailMovies;
import com.example.task1.R;

import java.util.ArrayList;
import java.util.List;

public class MovieListAdapter  extends BaseAdapter {
    Context context;
    List<CustomMovieModel> custommoviemoadel = new ArrayList<>();
    LayoutInflater inflater;

    public MovieListAdapter(Context context, List<CustomMovieModel> custommoviemoadel, LayoutInflater inflater) {
        this.context = context;
        this.custommoviemoadel = custommoviemoadel;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return custommoviemoadel.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =inflater.inflate(R.layout.custom_movies,null);
        ImageView imageView=view.findViewById(R.id.movie_icon_iv);
        TextView textView = view.findViewById(R.id.movie_tv);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMovies.class);
                intent.putExtra("mimg",custommoviemoadel.get(position).getImage());
                intent.putExtra("mname",custommoviemoadel.get(position).getName());
                context.startActivity(intent);
            }
        });
        return view;
    }
}
