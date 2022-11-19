package com.techelevator.application;
import java.util.Map;

public interface ItemInterface {
    String getLocation();
    String getName();
    String getType();
    double getPrice();
    Map<String,Integer> getQuantity();
    double getBalance();
}
