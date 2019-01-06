package com.doongsil.button.button;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Menu1 extends Fragment {
    View view;

    private RecyclerView recyclerView;
    private ScheduleRecyclerAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.menu1, container, false);

        //리사이클러뷰
        recyclerView = (RecyclerView) view.findViewById(R.id.menu1_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ScheduleRecyclerAdapter(getContext());
        adapter.addItem(new ScheduleItem("title 1", "01"));
        adapter.addItem(new ScheduleItem("title 2", "02"));
        adapter.addItem(new ScheduleItem("title 3", "03"));
        adapter.addItem(new ScheduleItem("title 4", "04"));
        adapter.addItem(new ScheduleItem("title 5", "05"));
        adapter.addItem(new ScheduleItem("title 6", "06"));
        adapter.addItem(new ScheduleItem("title 7", "07"));
        adapter.addItem(new ScheduleItem("title 8", "08"));
        adapter.addItem(new ScheduleItem("title 9", "09"));
        adapter.addItem(new ScheduleItem("title 10", "10"));
        adapter.addItem(new ScheduleItem("title 11", "11"));
        adapter.addItem(new ScheduleItem("title 12", "12"));
        adapter.addItem(new ScheduleItem("title 13", "13"));
        adapter.addItem(new ScheduleItem("title 14", "14"));
        adapter.addItem(new ScheduleItem("title 15", "15"));
        adapter.addItem(new ScheduleItem("title 16", "16"));
        adapter.addItem(new ScheduleItem("title 17", "17"));
        adapter.addItem(new ScheduleItem("title 18", "18"));
        adapter.addItem(new ScheduleItem("title 19", "19"));
        adapter.addItem(new ScheduleItem("title 20", "20"));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
