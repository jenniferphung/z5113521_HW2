package com.example.z5113521_hw2;

public class OrderItem {

    private String name;
    private String total;

    private String price;

    public OrderItem(String name, String total, String price){
        this.total = total;
        this.name = name;
        this.price= price;
    }

    public OrderItem(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
