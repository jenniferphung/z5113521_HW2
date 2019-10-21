package com.example.z5113521_hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuItem extends AppCompatActivity {

    private Context mContext;
    ArrayList<OrderItem> mOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);

        final Bundle b = getIntent().getExtras();
        final String receivingName = b.getString("itemname");
        String receivingDesc = b.getString("itemdesc");
        String receivingPrice = b.getString("itemprice");

        final String itemname = receivingName;
        String itemdesc = receivingDesc;
        final String itemprice = receivingPrice;

        final TextView DetailName = findViewById(R.id.DetailName);
        DetailName.setText(itemname);

        TextView DetailDesc = findViewById(R.id.DetailDesc);
        DetailDesc.setText(itemdesc);

        TextView DetailPrice = findViewById(R.id.DetailPrice);
        DetailPrice.setText(itemprice);

        final TextView valueinput = findViewById(R.id.Value);

        Button addbutton = findViewById(R.id.AddButton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String itemtotal = valueinput.getText().toString();
                Intent i = new Intent(MenuItem.this, Order.class);
                Bundle a = new Bundle();
                a.putString("itemname",itemname);
                a.putString("itemprice", itemprice);
                a.putString("itemtotal",itemtotal);
                i.putExtras(a);
                startActivity(i);
            }
        });

    }

}
