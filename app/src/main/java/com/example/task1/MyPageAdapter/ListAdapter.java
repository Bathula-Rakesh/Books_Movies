package com.example.task1.MyPageAdapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.ViewPager;

import com.example.task1.CustomModel;
import com.example.task1.DetailBook;
import com.example.task1.MainActivity;
import com.example.task1.R;
import com.example.task1.ui.Books;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    Context context;
    List<CustomModel> list = new ArrayList<>();
    LayoutInflater inflater ;
//    Dialog dialog;5

    public ListAdapter(Context context, List<CustomModel> list, LayoutInflater inflater) {
        this.context = context;
        this.list = list;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return list.size();
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

        View view = inflater.inflate(R.layout.custom_design,null);
        ImageView imageView = view.findViewById(R.id.image_icon_iv);
        TextView textView = view.findViewById(R.id.book_tv);


//        view.setOnClickListener(new View.OnClickListener()
//
//        {
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void onClick(View v) {
//
//                AlertDialog.Builder alert=new AlertDialog.Builder(context);
//                View view1 = inflater.inflate(R.layout.activity_detail_book,null);
//                alert.setView(view1);
//                 alert.show();
//
////
////                Intent i
////                ntent = new Intent(context,DetailBook.class);
////                intent.putExtra("img",list.get(position).getImage());
////                intent.putExtra("name",list.get(position).getNametext());
////                context.startActivity(intent);
////                Toast.makeText(context, "this is book", Toast.LENGTH_SHORT).show();
//
//            }
//        });
        return view;
    }
}
