package com.example.z5113521_hw2;

import java.util.ArrayList;

public class DataHolder {
    final ArrayList<OrderItem> orders = new ArrayList<>();
    final double counter = 0.00;

    private DataHolder() {}

    static DataHolder getInstance() {
        if( instance == null ) {
            instance = new DataHolder();
        }
        return instance;
    }

    private static DataHolder instance;
}
