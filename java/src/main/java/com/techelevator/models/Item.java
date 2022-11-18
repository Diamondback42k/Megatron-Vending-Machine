package com.techelevator.models;

import com.techelevator.application.Item1;

import java.util.HashMap;
import java.util.Map;

public class Item implements Item1 {

//    we'll call this either menu or inventory

    private String location;
    private String name;
    private double price;
    private String type;

    //Create our variables for our items

    public Item(String location, String name, double price, String type) {

        this.location = location;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

//    public void setName(String name) { //do we need these??
//        this.name = name;
//    }

    public String toString() {

        return location + "," + name + "," + price + "," + type;
    }

    public Map<String, Integer> getInventory() {

        Map<String, Integer> quantity = new HashMap<>();

        quantity.put("A1", 6);
        quantity.put("A2", 6);
        quantity.put("A3", 6);
        quantity.put("A4", 6);
        quantity.put("B1", 6);
        quantity.put("B2", 6);
        quantity.put("B3", 6);
        quantity.put("B4", 6);
        quantity.put("C1", 6);
        quantity.put("C2", 6);
        quantity.put("C3", 6);
        quantity.put("C4", 6);
        quantity.put("D1", 6);
        quantity.put("D2", 6);
        quantity.put("D3", 6);
        quantity.put("D4", 6);


        return quantity;
    }

}
