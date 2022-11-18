package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
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
                // display the vending machine slots
            } else if (option.equals("P")) {
                secondMenuOption();
            } else if (option.equals("E")) {
                // good bye
                break;
            }
        }
    }
    private static List<Item> items = new ArrayList<>();

    public void loadFile() {
        File catering = new File("catering.csv");

//        //I want to say, "IF File == catering, then run File catering
        try {
            Scanner scanner = new Scanner(catering);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] lineArr = line.split("\\,");
                String itemLocation = lineArr[0];
                String name = lineArr[1];
                double price = Double.parseDouble(lineArr [2]);
                String type = lineArr[3];
                int quantity = 6;
                Item item = new Item(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]),lineArr[3]);
                items.add(item);
            }
        }catch(FileNotFoundException e){
            System.out.println("Problem with file");
        }
            File catering1 = new File("catering1.csv");
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





//        public void loadFile2(){
//        File catering1 = new File("catering1.csv");
//
//        }  /just in case ?

    }

