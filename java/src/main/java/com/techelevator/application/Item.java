package com.techelevator.application;

public abstract class Item {

    private String name;
    private int price;                 //Create our variables for our items

    public Item( String name, int price) {

        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;

    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) { //do we need these??

        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;             //Private or public?
    }



}
