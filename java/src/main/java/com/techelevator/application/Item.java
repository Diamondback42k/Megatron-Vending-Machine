package com.techelevator.application;

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
}
