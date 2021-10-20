package com.example.task1.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.Transliterator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.task1.CustomModel;
import com.example.task1.MyPageAdapter.ListAdapter;
import com.example.task1.MyPageAdapter.ViewPagerAdapter;
import com.example.task1.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class Books extends Fragment {
    ListView listView;
    ListAdapter listAdapter;
    List<CustomModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_books, container, false);
        listView = view.findViewById(R.id.list_items_books);

        getdata();

        listAdapter = new ListAdapter(getContext(),list,inflater);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                alertMethod(position);
            }
        });
        return view;
    }

    private void alertMethod(int position) {
        AlertDialog.Builder alert=new AlertDialog.Builder(getActivity());
        alert.setMessage(""+list.get(position).getNametext());
        alert.setTitle("lisstview example");
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog=alert.create();
        alertDialog.show();
    }


    private List<CustomModel>  getdata() {
        list = new ArrayList<>();
        list.add(new CustomModel(R.drawable.ic_launcher_background, "Telugu"));
        list.add(new CustomModel(R.drawable.ic_launcher_background, "Hindhi"));
        list.add(new CustomModel(R.drawable.ic_launcher_background, "English"));
        list.add(new CustomModel(R.drawable.ic_launcher_background, "Maths"));
        list.add(new CustomModel(R.drawable.ic_launcher_background, "Science"));
        list.add(new CustomModel(R.drawable.ic_launcher_background, "Social"));
        return list;
    }
    }
