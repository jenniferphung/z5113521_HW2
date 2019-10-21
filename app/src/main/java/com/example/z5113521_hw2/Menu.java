package com.example.z5113521_hw2;

public class Menu {

    private int menuID;
    private String name;
    private String desc;
    private String price;

    public Menu(int menuID, String name, String desc, String price){
        this.menuID = menuID;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
