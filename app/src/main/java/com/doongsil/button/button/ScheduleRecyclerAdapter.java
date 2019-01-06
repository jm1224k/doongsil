package com.doongsil.button.button;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class ScheduleRecyclerAdapter extends RecyclerView.Adapter<ScheduleRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<ScheduleItem> items = new ArrayList<ScheduleItem>();

    public ScheduleRecyclerAdapter(Context context) {
        this.context = context;
    }

    // 해야할 3가지 메소드
    @NonNull
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.schedule_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ScheduleItem item = items.get(position);
        holder.setItem(item);
    }

    public void addItem(ScheduleItem item) {
        items.add(item);
    }

    public void addItems(ArrayList<ScheduleItem> items) {
        this.items = items;
    }

    public ScheduleItem getItem(int position) {
        return items.get(position);
    }


    //뷰홀더 정의
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.schedule_item_title);
            textView2 = (TextView) itemView.findViewById(R.id.schedule_item_date);
        }

        public void setItem(ScheduleItem item) {
            textView.setText(item.getTitle());
            textView2.setText(item.getDate());
        }
    }


}
