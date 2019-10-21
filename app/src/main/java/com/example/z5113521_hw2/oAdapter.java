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

public class oAdapter extends RecyclerView.Adapter<oAdapter.ViewHolder> {

    private ArrayList<OrderItem> mOrder;
    private Context mContext;

    public oAdapter(Context context, ArrayList<OrderItem> order) {
        mOrder = order;
        mContext = context;
    }

    @NonNull
    @Override
    public oAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderrow, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull oAdapter.ViewHolder holder, int position) {
        final OrderItem order = mOrder.get(position);
        String ordername = order.getName();
        String orderprice = order.getPrice();
        String ordertotal = order.getTotal();
        holder.oName.setText(ordername);
        holder.oPrice.setText("Individual Item Price: $" + orderprice);
        holder.oTotal.setText("Item Count: " + ordertotal);
    }

    @Override
    public int getItemCount() {
        return mOrder.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView oName;
        public TextView oPrice;
        public TextView oTotal;

        public ViewHolder(View itemView) {
            super(itemView);
            oName = (TextView) itemView.findViewById(R.id.OrderName);
            oPrice = (TextView) itemView.findViewById(R.id.OrderPrice);
            oTotal = (TextView) itemView.findViewById(R.id.OrderTotal);

        }

    }
}
