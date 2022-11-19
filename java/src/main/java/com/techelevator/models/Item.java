package com.techelevator.models;

import com.techelevator.application.ItemInterface;

import java.util.HashMap;
import java.util.Map;

public class Item implements ItemInterface {

    private String location;
    private String name;
    private double price;
    private String type;
    private int quantity;

    private double balance;

    public Item (String location, String name, double price, String type, int quantity) {

        this.location = location;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
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

    @Override
    public int getQuantity() {
        return 0;
    }

//    public Map<String, Integer> getQuantity() {
//        Map<String, Integer> quantity = new HashMap<>();
//        quantity.put("A1",6);
//        quantity.put("A2",6);
//        quantity.put("A3",6);
//        quantity.put("A4",6);
//        quantity.put("B1",6);
//        quantity.put("B2",6);
//        quantity.put("B3",6);
//        quantity.put("B4",6);
//        quantity.put("C1",6);
//        quantity.put("C2",6);
//        quantity.put("C3",6);
//        quantity.put("C4",6);
//        quantity.put("D1",6);
//        quantity.put("D2",6);
//        quantity.put("D3",6);
//        quantity.put("D4",6);
//
//        return quantity;
//    }

    public double getBalance() {
        return balance;
    }


    public String toString() {

        return location + "," + name + "," + price + "," + type;


    }


}
