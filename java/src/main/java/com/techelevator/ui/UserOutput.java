package com.techelevator.ui;

import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput {

    public static void displayMessage(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayLevel1Options() {
        System.out.println("(D) Display Vending Items");
        System.out.println("(P) Purchase");
        System.out.println("(E) Exit");
    }

        public static void displayLevel2Options () {


            System.out.println("(M) Feed Money");
            System.out.println("(S) Select Item");
            System.out.println("(F) Finish Transaction");
<<<<<<< HEAD
            System.out.println("Current Money Provided: " );
=======
            System.out.println();
            System.out.println("Current Money Provided: 0.00 ");
>>>>>>> 4224dda5d6f95d46936b91281c3ee5d708168f22
        }







}

