package com.doongsil.button.button;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewManager;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Menu2 extends Fragment {
    View view;

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.menu2, container, false);

        //리사이클러뷰
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(getContext());
        adapter.addItem(new RecyclerItem("test 1"));
        adapter.addItem(new RecyclerItem("test 2"));
        adapter.addItem(new RecyclerItem("test 3"));
        adapter.addItem(new RecyclerItem("test 4"));
        adapter.addItem(new RecyclerItem("test 5"));
        adapter.addItem(new RecyclerItem("test 6"));
        adapter.addItem(new RecyclerItem("test 7"));
        adapter.addItem(new RecyclerItem("test 8"));
        adapter.addItem(new RecyclerItem("test 9"));
        adapter.addItem(new RecyclerItem("test 10"));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
