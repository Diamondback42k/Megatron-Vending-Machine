package com.techelevator.application;

//import com.sun.tools.javac.jvm.Items;
import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;

import static com.techelevator.ui.UserInput.getSecondMenuOption;
import static com.techelevator.ui.UserInput.getSelectItem;
import static com.techelevator.ui.UserOutput.*;

public class VendingMachine {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static double totalBalance = 0.00;
    private static List<Item> items = new ArrayList<>();
    File file = new File("catering.csv");

    public static void loadFile() {
        File file = new File("catering.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineArr = line.split("\\,");
                String itemLocation = lineArr[0];  //Map method identify and give value to each slot, Map<String, Integer>
                String name = lineArr[1];
                double price = Double.parseDouble(lineArr[2]);
                String type = lineArr[3];
                int quantity = 6;
                if (type.equals("Candy")) {
                    Item candy = new Candy(itemLocation, name, price, type, quantity);
                    items.add(candy);
                } else if (type.equals("Drink")) {
                    Item drinks = new Drinks(itemLocation, name, price, type, quantity);
                    items.add(drinks);
                } else if (type.equals("Gum")) {
                    Item gum = new Gum(itemLocation, name, price, type, quantity);
                    items.add(gum);
                } else if (type.equals("Munchy")) {
                    Item munchy = new Munchy(itemLocation, name, price, type, quantity);
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
        boolean stay = true;
        while (stay) {
            UserOutput.displayLevel2Options(totalBalance);
            String choice = UserInput.getSecondMenuOption();
            if (choice.equals("Feed Money")) {
                feedingMoney();
            } else if (choice.equals("Select Item")) {
                itemSelection();
            } else if (choice.equals("Finish Transaction")) {
                break;
            }
        }
    }

    public static Item findItem(String slotLocationInput) {
        Item itemFound = null;
        for (Item item : items) {
            String slotLocation = item.getLocation();
            if (slotLocation.equals(slotLocationInput)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }


    public static void feedingMoney() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert money; $1.00, $5.00, $10.00, or $20.00");
        String moneyInput = userInput.nextLine();
        double total = Double.parseDouble(moneyInput);
        totalBalance += total;
    }

    public static void itemSelection() {
        displayInventory(items);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please make your selection by entering the slot number: ");
        String slotInput = scanner.nextLine();
        Item findItem = findItem(slotInput);
        if (slotInput. {

        }
    }
}








