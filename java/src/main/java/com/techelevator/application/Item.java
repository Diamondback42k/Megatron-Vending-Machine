package com.techelevator.application;

public abstract class Item {

    private String name;
    private double price;
    private String location;
    private String type;      //Create our variables for our items

    public Item( String name, double price) {

        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) { //do we need these??

        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;             //Private or public?
    }



}
