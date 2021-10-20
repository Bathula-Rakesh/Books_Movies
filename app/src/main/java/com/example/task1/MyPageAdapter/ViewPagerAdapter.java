package com.example.task1.MyPageAdapter;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.task1.ui.Books;
import com.example.task1.ui.Movies;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int tabcount;
    public ViewPagerAdapter(@NonNull @NotNull FragmentManager fm,int behaviour) {
        super(fm,behaviour);
        tabcount=behaviour;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new Books();
            case 1 : return  new Movies();
            default: return  null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }


}
