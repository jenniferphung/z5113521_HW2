package com.example.z5113521_hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Order extends AppCompatActivity {

    RecyclerView oRecyclerView;
    ArrayList<OrderItem> mOrder = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Bundle b = getIntent().getExtras();
        String name = b.getString("itemname");
        String price = b.getString("itemprice");
        String total = b.getString("itemtotal");

        ArrayList<OrderItem> mOrder = DataHolder.getInstance().orders;

        if (name.equals("0")) {
            //Do Nothing
        } else {
            mOrder.add(new OrderItem(name, total, price));
        }

        double defaultTotal = DataHolder.getInstance().counter;

        for (int i = 0; i < mOrder.size(); i++) {
            double mPrice = Double.parseDouble(mOrder.get(i).getPrice());
            double mTotal = Double.parseDouble(mOrder.get(i).getTotal());
            double ItemTotal = mTotal * mPrice;
            defaultTotal += ItemTotal;
        }

        String mItemTotal = Double.toString(defaultTotal);
        TextView TotalPrice = findViewById(R.id.TotalPrice);
        TotalPrice.setText(mItemTotal);

        oRecyclerView = (RecyclerView) findViewById(R.id.orderList);
        oRecyclerView.setHasFixedSize(true);
        oRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        oAdapter adapter = new oAdapter(this, mOrder);
        oRecyclerView.setAdapter(adapter);

    }

}
