package com.example.z5113521_hw2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mAdapter extends RecyclerView.Adapter<mAdapter.ViewHolder> {

    private ArrayList<Menu> mMenu;
    private Context mContext;

    public mAdapter(Context context, ArrayList<Menu> menu) {
        mMenu = menu;
        mContext = context;
    }

    @NonNull
    @Override
    public mAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrow, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull mAdapter.ViewHolder holder, final int position) {
        final Menu menu = mMenu.get(position);
        String itemname = menu.getName();
        holder.Name.setText(itemname);

        holder.Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, MenuItem.class);
                Bundle b = new Bundle();
                final Menu article = mMenu.get(position);
                b.putString("itemname",menu.getName());
                b.putString("itemdesc",menu.getDesc());
                b.putString("itemprice", menu.getPrice());
                i.putExtras(b);
                mContext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Name;

        public ViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.Name);

        }

    }
}
