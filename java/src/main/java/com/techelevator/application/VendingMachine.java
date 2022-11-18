package com.techelevator.application;

import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine implements Item1{

    private static List<Item> items = new ArrayList<>();

    public void loadFile() {

        File catering = new File("catering.csv");

        try {

            Scanner scanner = new Scanner(catering);

            while(scanner.hasNext()) {

                String line = scanner.nextLine();
                String [] lineArr = line.split("\\,");

                String itemLocation = lineArr[0];  //Map method identify and give value to each slot, Map<String, Integer>
                String name = lineArr[1];
                double price = Double.parseDouble(lineArr[2]);
                String type = lineArr[3];

                Item food = new Item(itemLocation, name, price, type);
                items.add(food);
            }

        }catch(FileNotFoundException e){
            System.out.println("Problem with file");
        }

    }

    public void run(){
        loadFile();
        while (true) {
            UserOutput.displayHomeScreen();
            UserOutput.displayLevel1Options();
            String option = UserInput.getHomeScreenOption();

            if (option.equals("D")) {
                System.out.println("Display Vending Items");
                for(Item item: items){
                    System.out.println(item);
                }

            } else if (option.equals("P")) {
                secondMenuOption();
            } else if (option.equals("E")) {

                break;
            }
        }
    }


    public static void secondMenuOption(){
        boolean stay = true;
        while(stay){
            UserOutput.displayLevel2Options();
            String choice = UserInput.getSecondMenuOption();

            if(choice.equals("Feed Money")){
                System.out.println("Insert money; $1, $5, $10, or $20");

            } else if (choice.equals("Select Item")) {

            } else if (choice.equals("Finish Transaction")) {

            } UserInput.getCurrentMoneyProvided();
        }
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public Map<String, Integer> getInventory() {
        return null;
    }


//        public void loadFile2(){
//        File catering1 = new File("catering1.csv");
//
//        }  /just in case ?

    }

