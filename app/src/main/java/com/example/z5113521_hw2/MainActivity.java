package com.example.z5113521_hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<Menu> mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = MenuDatabase.getAllMenu();
        mRecyclerView = (RecyclerView) findViewById(R.id.menuList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter adapter = new mAdapter(this, mMenu);
        mRecyclerView.setAdapter(adapter);

        Button vieworder = findViewById(R.id.OrderButton);

        vieworder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Order.class);
                Bundle a = new Bundle();
                a.putString("itemname","0");
                a.putString("itemprice", "0");
                a.putString("itemtotal","0");
                i.putExtras(a);
                startActivity(i);
            }
        });



    }
}
