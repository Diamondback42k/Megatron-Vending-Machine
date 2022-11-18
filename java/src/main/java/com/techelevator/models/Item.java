package com.techelevator.models;

import com.techelevator.application.ItemInterface;

import java.util.Map;

public class Item implements ItemInterface {

    private String location;
    private String name;
    private double price;
    private String type;
//    took out the deposit, will explain later
//    might have to add quantity, considering 
    //Create our variables for our items

    public Item (String location, String name, double price, String type) {

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

    @Override
    public Map<String, Integer> getInventory() {
        return null;
    }

    //    private String name;
//    private int wins;
//    private int losses;
//
//    public Team(String name, int wins, int losses) {
//        this.name = name;
//        this.wins = wins;
//        this.losses = losses;
//    }
//
//    public int getWins() {
//        return wins;
//    }
//
//    public int getLosses() {
//        return losses;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String toString() {
//        double wlRatio;
//        if(losses == 0) {
//            wlRatio = wins;
//        } else {
//            wlRatio = (double)wins / (double)losses;
//        }
    public String toString() {

        return location + "," + name + "," + price + "," + type;

//        return "Name: " + name + " Wins: " + wins + " Loss: " + losses + " Win Loss Ratio: " + wlRatio;
    }

//    public void setWins(int wins) {
//        this.wins = wins;
//    }
//
//    public void setLosses(int losses) {
//        this.losses = losses;
//    }
}
