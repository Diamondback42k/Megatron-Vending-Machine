package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim();

        if (option.equals("D")) {
            return "display";
        } else if (option.equals("P")) {
            return "purchase";
        } else if (option.equals("E")) {
            return "exit";
        } else {
            return "";
        }
    }

    public static String getSecondMenuOption() {
        String choice = scanner.nextLine();

        if (choice.equals("M")) {
            return "Feed Money";
        } else if (choice.equals("S")) {
            return "Select Item";
        } else if (choice.equals("F")) {
            return "Finish Transaction";
        } else {
            return "";
        }
    }

    public static String getCurrentMoneyProvided() {
        String currentMoney = scanner.nextLine();
        double currentBalance = 0.00;

            return Double.toString(currentBalance);

        }

    }


    

