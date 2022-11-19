package com.techelevator.application;

import com.techelevator.models.Item;

import java.util.Map;

public class Gum extends Item {

    public Gum(String location, String name, double price, String type, Map<String, Integer> quantity) {
        super(location, name, price, type, quantity);
    }
}
