package com.doongsil.button.button;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<RecyclerItem> items = new ArrayList<RecyclerItem>();

    public RecyclerAdapter(Context context) {
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
        View itemView = inflater.inflate(R.layout.menu2_recycler_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerItem item = items.get(position);
        holder.setItem(item);
    }

    public void addItem(RecyclerItem item) {
        items.add(item);
    }

    public void addItems(ArrayList<RecyclerItem> items) {
        this.items = items;
    }

    public RecyclerItem getItem(int position) {
        return items.get(position);
    }


    //뷰홀더 정의
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.recycler_item_name);
        }

        public void setItem(RecyclerItem item) {
            textView.setText(item.getName());
        }
    }


}