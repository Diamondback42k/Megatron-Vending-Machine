package com.techelevator.ui;

import com.techelevator.application.*;
import com.techelevator.models.Item;
//import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
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
    static double totalBalance = 0.00;

//    private static final DecimalFormat df = new DecimalFormat("0.00");
//    private static List<Item> items = new ArrayList<>();
//    File inventoryFile = new File("catering.csv");
//    Scanner scanner = new Scanner(inventoryFile);
//
//
//    public UserOutput(List<Item> items) throws FileNotFoundException {
//        this.items = items;
//    }

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

    public static void displayInventory(List<Item> items){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void displayLevel2Options(double totalBalance) {
        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Item");
        System.out.println("(F) Finish Transaction");
        System.out.println();
        System.out.println("Current Money Provided: " + "$" + df.format(totalBalance));
    }

    public static void moneyAdded() {
        System.out.println("Insert money; $1.00, $5.00, $10.00, or $20.00");
    }

//    public static void currentAmount(){
//        System.out.println("Current Money Provided: $ " + totalBalance); // + df.format(totalBalance));
//
//    }
    public static void totalAmount(){

    }

//    public static void subLevel2Options() {
//
//        boolean stay = true;
//
//        while(stay) {
//
//            displayLevel2Options();
//            String choice = UserInput.getSecondMenuOption();
//            Scanner userInput = new Scanner(System.in);
//            int quantity = 6;
//
//            if (choice.equals("Feed Money")) {
//
//                    System.out.println("Insert money; $1.00, $5.00, $10.00, or $20.00");
//                    String moneyInput = userInput.nextLine();
//                    double total = Double.parseDouble(moneyInput);
//                    totalBalance += total;
//
//            } else if (choice.equals("Select Item")) {
//                System.out.println("Display vending items");
//                File file = new File("catering.csv");
//                String[] lineArr = new String[0];
//                try {
//                    Scanner scanner = new Scanner(file);
//                    while (scanner.hasNext()) {
//                        String line = scanner.nextLine();
//                        lineArr = line.split("\\,");
//                        String itemLocation = lineArr[0];  //Map method identify and give value to each slot, Map<String, Integer>
//                        String name = lineArr[1];
//                        double price = Double.parseDouble(lineArr[2]);
//                        String type = lineArr[3];
//                        if (type.equals("Candy")) {
//                            Item candy = new Candy (itemLocation, name, price, type, quantity) ;
//                            items.add(candy);
//                        } else if (type.equals("Drink")) {
//                            Item drinks = new Drinks (itemLocation, name, price, type, quantity);
//                            items.add(drinks);
//                        } else if (type.equals("Gum")) {
//                            Item gum = new Gum (itemLocation, name, price, type, quantity);
//                            items.add(gum);
//                        }else if (type.equals("Munchy")) {
//                            Item munchy = new Munchy (itemLocation, name, price, type, quantity);
//                            items.add(munchy);
//                        }
//                        System.out.println(Arrays.toString(lineArr) + " QTY: " + quantity);
//                    }
//                } catch (FileNotFoundException e) {
//                    System.out.println("Problem with file");
//                }
//                Scanner slotInput = new Scanner(System.in);
//                System.out.println("Please make your selection by entering the slot number: ");
//                String slot = slotInput.nextLine();
//               try {
//                   for (Item selectedOption : items) {
//                       if (selectedOption.equals(lineArr[0]) && selectedOption.equals(slot)) {
//                           Scanner input = new Scanner(System.in);
//                           System.out.println("QTY: ");
//                           String qty = input.nextLine();
//                           int newQty = Integer.parseInt(qty);
//                           double price = Double.parseDouble(lineArr[2]);
//                           double calculatedPrice = price * newQty;
//                           if (newQty <= quantity && totalBalance >= calculatedPrice) {
//                               quantity -= newQty;
//                               totalBalance -= price;
//                               System.out.println("Dispensing Items");
//                           } else if(totalBalance < calculatedPrice){
//                               System.out.println("Not enough funds");
//                           }
//                       }else if (!selectedOption.equals(lineArr[0]) && !selectedOption.equals(slot)) {
//                           System.out.println(slotInput.nextLine());
//
//                       }
//                   }
//               }catch(NumberFormatException e) {
//                   System.out.println("Invalid Number");
//               }
//
//            }else if (choice.equals("Finish Transaction")) {
//                stay = false;
//            }
//        }
//    }
}



