package com.techelevator.ui;

import com.techelevator.application.*;
import com.techelevator.models.Item;
//import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput extends VendingMachine {

    public static void main(String[] args) {


        VendingMachine vendingMachine = new VendingMachine();


    }


    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static List<Item> items = new ArrayList<>();
    File inventoryFile = new File("catering1.csv");
    Scanner scanner = new Scanner(inventoryFile);
    static double totalBalance = 0.00;


    public UserOutput(List<Item> items) throws FileNotFoundException {
        this.items = items;
    }

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

    public static void displayLevel2Options() {
        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Item");
        System.out.println("(F) Finish Transaction");
        System.out.println();
        System.out.println("Current Money Provided: " + "$" + df.format(totalBalance));
    }

    public static void subLevel2Options() {

        boolean stay = true;

        while(stay) {

            displayLevel2Options();
            String choice = UserInput.getSecondMenuOption();
            Scanner userInput = new Scanner(System.in);

            if (choice.equals("Feed Money")) {

                    System.out.println("Insert money; $1.00, $5.00, $10.00, or $20.00");
                    String moneyInput = userInput.nextLine();
                    double total = Double.parseDouble(moneyInput);
                    totalBalance += total;

            } else if (choice.equals("Select Item")) {

                System.out.println("Display vending items");

                File file = new File("catering1.csv");
                String[] lineArr = new String[0];
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        int quantity = 6;
                        String line = scanner.nextLine();
                        lineArr = line.split("\\,");
                        System.out.println(Arrays.toString(lineArr) + " QTY: " + quantity);

                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Problem with file");
                }
                Scanner slotInput = new Scanner(System.in);
                System.out.println("Please make your selection by entering the slot number: ");
                String slot = slotInput.nextLine();
                for (String word : lineArr) {

                    if (word.equals(lineArr[0])) {

                        int quantity = 6;

                        Scanner input = new Scanner(System.in);
                        System.out.println("QTY: ");

                        String qty = input.nextLine();
                        int newQty = Integer.parseInt(qty);
                        double price = Integer.parseInt(lineArr[2]);
                        double calculatedPrice = price * newQty;

                        if (newQty <= quantity && totalBalance >= calculatedPrice) {
                            quantity -= newQty;


                        }


                        System.out.println(input.nextLine());
                        System.out.println();


                    }
                }

            }else if (choice.equals("Finish Transaction")) {
                stay = false;
            }
            }
            }
        }



