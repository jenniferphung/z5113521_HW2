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
                "Impossible Whopper",
                "Our Impossible™ WHOPPER® Sandwich features a savory flame-grilled patty made from plants topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun. 100% WHOPPER®, 0% Beef.",
                "15.00"
                ));
        menu.put(2, new Menu(
                2,
                "Single Pretzel Bacon King",
                "Our Single PRETZEL BACON KING™ Sandwich features one ¼ lb.* of savory flame-grilled 100% beef patties, topped with smoky bacon, melted American cheese, tangy mustard and creamy mayonnaise all on a toasted pretzel bun.",
                "8.00"
        ));
        menu.put(3, new Menu(
                3,
                "Quarter Pound KING",
                "Our Quarter Pound KING™ Sandwich has over ¼ lb.* of flame-grilled 100% beef, topped with all of our classic favorites: American cheese, freshly sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame seed bun.",
                "9.50"
        ));
        menu.put(4, new Menu(
                4,
                "Crispy Taco",
                "Introducing the Crispy Taco featuring a crispy, crunchy tortilla, filled with delicious, seasoned beef, shredded cheddar cheese and lettuce, all topped with just the right amount of our savory taco sauce.",
                "4.00"
        ));
        menu.put(5, new Menu(
                5,
                "Spicy Crispy Chicken",
                "Introducing the Spicy Crispy Chicken Sandwich made with juicy, tender and crispy 100% white meat chicken, seasoned and breaded with bold flavors and just the right amount of heat; topped with fresh lettuce, a ripe tomato, and creamy mayonnaise all on a potato bun.",
                "8.50"
        ));
        menu.put(6, new Menu(
                6,
                "Big Fish",
                "Our premium Big Fish Sandwich is 100% White Alaskan Pollock, breaded with crispy panko breading and topped with sweet tartar sauce, tangy pickles, all on top of a toasted brioche-style bun.",
                "6.00"
        ));
        menu.put(7, new Menu(
                7,
                "Ham, Egg & Cheese Maple Waffle Sandwich",
                "Wake up with our Ham, Egg & Cheese Maple Waffle sandwich. Thin sliced sweet black forest ham, fluffy eggs, and creamy American cheese are layered carefully between two savory and sweet waffle slices.",
                "5.50"
        ));
        menu.put(8, new Menu(
                8,
                "Garden Side Salad",
                "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. Nutrition Information does not reflect home-style croutons or KEN’S salad dressing.",
                "6.50"
        ));
        menu.put(9, new Menu(
                9,
                "Cheeseburger",
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                "3.00"
        ));
        menu.put(10, new Menu(
                10,
                "Whopper Jr.",
                "Our WHOPPER JR.® Sandwich features one savory flame-grilled beef patty topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.\n" +
                        "\n" +
                        "Served with a small side of piping hot, thick cut french fries or golden onion rings and a small fountain drink of your choice to make it a meal.",
                "5.00"
        ));
        menu.put(11, new Menu(
                11,
                "Cheesy Tots",
                "Melted cheese potato bites covered in a crunchy bread crumb coating. Served hot and crispy with your order.",
                "4.00"
        ));
        menu.put(12, new Menu(
                12,
                "Chicken Nuggets",
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                "7.50"
        ));
        menu.put(13, new Menu(
                13,
                "French Fries",
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                "3.00"
        ));
        menu.put(14, new Menu(
                14,
                "Triple STACKER KING",
                "Our Triple STACKER KING™ Sandwich features more than ¾ lb.* of savory flame-grilled 100% beef, topped with smoky bacon, melted American cheese and our special Stacker sauce all on a toasted sesame bun.",
                "12.00"
        ));
        menu.put(15, new Menu(
                15,
                "Onion Rings",
                "Served hot and crispy, our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces.",
                "3.00"
        ));
    }
}

