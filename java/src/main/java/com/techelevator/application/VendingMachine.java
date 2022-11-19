package com.techelevator.application;

//import com.sun.tools.javac.jvm.Items;
import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;

import static com.techelevator.ui.UserOutput.displayLevel2Options;
import static com.techelevator.ui.UserOutput.subLevel2Options;

public class VendingMachine {

    private static List<Item> items = new ArrayList<>();

    public static void loadFile() {
        File file = new File("catering1.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineArr = line.split("\\,");
                String itemLocation = lineArr[0];  //Map method identify and give value to each slot, Map<String, Integer>
                String name = lineArr[1];
                double price = Double.parseDouble(lineArr[2]);
                String type = lineArr[3];
                Map<String, Integer> quantity = new HashMap<>();
                if (type.equals("Candy")) {
                    Item candy = new Candy (itemLocation, name, price, type, quantity) ;
                    items.add(candy);
                } else if (type.equals("Drink")) {
                    Item drinks = new Drinks (itemLocation, name, price, type, quantity);
                    items.add(drinks);
                } else if (type.equals("Gum")) {
                    Item gum = new Gum (itemLocation, name, price, type, quantity);
                    items.add(gum);
                }else if (type.equals("Munchy")) {
                    Item munchy = new Munchy (itemLocation, name, price, type, quantity);
                    items.add(munchy);
                }
//                Item food = new Item(itemLocation, name, price, type);
//                items.add(food);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Problem with file");
        }
    }

    public void run() {
        loadFile();
        while (true) {
            UserOutput.displayHomeScreen();
            UserOutput.displayLevel1Options();
            String choice = UserInput.getHomeScreenOption();

            if (choice.equals("display")) {
                System.out.println("display vending items");
                for (Item item : items) {
                    System.out.println(item);
                }

            } else if (choice.equals("purchase")) {
               secondMenuOption();

            } else if (choice.equals("exit")) {
                break;
            }
        }
    }

    public static void secondMenuOption() {
        subLevel2Options();

//
            }
        }






