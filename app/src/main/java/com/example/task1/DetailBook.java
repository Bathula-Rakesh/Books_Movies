package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBook extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    String imageStr,nameStr;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);
        imageView = findViewById(R.id.profile_image);
        textView = findViewById(R.id.profile_name);

        imageStr = getIntent().getStringExtra("img");
        nameStr = getIntent().getStringExtra("name");
        bundle = getIntent().getExtras();
        if(bundle != null){
            int imageStr = bundle.getInt("img");
            imageView.setImageResource(imageStr);
        }

        textView.setText(nameStr);
    }
}