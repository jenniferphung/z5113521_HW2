package com.example.z5113521_hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Menu getMenuByID(int articleID) {
        return menu.get(articleID);
    }

    public static ArrayList<Menu> getAllMenu() {
        return new ArrayList<Menu>((List) Arrays.asList(menu.values().toArray()));
    }

    private static final HashMap<Integer, Menu> menu = new HashMap<>();

    static {
        menu.put(1, new Menu(
                1,
                "Item1",
                "Description1",
                "20.00"
                ));
        menu.put(2, new Menu(
                2,
                "Item2",
                "Description2",
                "4.00"
        ));
        menu.put(3, new Menu(
                3,
                "Item3",
                "Description3",
                "00.00"
        ));
        menu.put(4, new Menu(
                4,
                "Item4",
                "Description4",
                "00.00"
        ));
        menu.put(5, new Menu(
                5,
                "Item5",
                "Description5",
                "00.00"
        ));
        menu.put(6, new Menu(
                6,
                "Item6",
                "Description6",
                "00.00"
        ));
        menu.put(7, new Menu(
                7,
                "Item7",
                "Description7",
                "00.00"
        ));
        menu.put(8, new Menu(
                8,
                "Item8",
                "Description8",
                "00.00"
        ));
        menu.put(9, new Menu(
                9,
                "Item9",
                "Description9",
                "00.00"
        ));
        menu.put(10, new Menu(
                10,
                "Item10",
                "Description10",
                "00.00"
        ));
        menu.put(11, new Menu(
                11,
                "Item11",
                "Description11",
                "00.00"
        ));
        menu.put(12, new Menu(
                12,
                "Item12",
                "Description12",
                "00.00"
        ));
        menu.put(13, new Menu(
                13,
                "Item13",
                "Description13",
                "00.00"
        ));
        menu.put(14, new Menu(
                14,
                "Item14",
                "Description14",
                "00.00"
        ));
        menu.put(15, new Menu(
                15,
                "Item15",
                "Description15",
                "00.00"
        ));
    }
}

