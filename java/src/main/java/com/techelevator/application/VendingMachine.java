package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine implements Item1 {

    private static List<String> items = new ArrayList<>();

    public void loadFile() {

        File catering = new File("catering.csv");

            //I want to say, "IF File == catering, then run File catering
        try {
            Scanner scanner = new Scanner(catering);
            while(Scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] lineArr = line.split("\\,");
                Item1 item = new Item1(lineArr[0], lineArr[1], Double.parseDouble(lineArr[2]), lineArr[3]);

                items.add(item);
                }
            }catch(FileNotFoundException e){
            System.out.println("Problem with file");
            }
//            File catering1 = new File("catering1.csv");
    }


        public void loadFile2(){
        File catering1 = new File("catering1.csv");

        }

        public void run(){
                loadFile();
            while (true) {
                UserOutput.displayHomeScreen();
                UserOutput.displayLevel1Options();
                String choice = UserInput.getHomeScreenOption();

                if (choice.equals("display")) {
                    System.out.println("Display Vending Items");
                    for(Item1 item: items){
                        System.out.println(item);
                    }


                    // display the vending machine slots
                } else if (choice.equals("purchase")) {




                    // make a purchase
                } else if (choice.equals("exit")) {

                    // good bye
                    break;
                }
            }
        }
            public static void level2Menu(){
            boolean stay = true;
            while(stay){
                UserOutput.displayLevel2Options();
                String choice = UserInput.getSecondMenuOption();

                if(choice.equals("Feed Money")){



                }


            }


            }
    }

