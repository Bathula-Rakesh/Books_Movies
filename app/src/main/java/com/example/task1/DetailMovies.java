package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovies extends AppCompatActivity {

    ImageView mimageView;
    TextView mtextView;
    String imagestr,namestr;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movies);
        mimageView = findViewById(R.id.movie_image);
        mtextView = findViewById(R.id.movie_name);

        imagestr = getIntent().getStringExtra("mimg");
        namestr = getIntent().getStringExtra("mname");
        bundle = getIntent().getExtras();
        if(bundle != null){
            int imagestr = bundle.getInt("mimg");
            mimageView.setImageResource(imagestr);
        }

        mtextView.setText(namestr);
    }
}