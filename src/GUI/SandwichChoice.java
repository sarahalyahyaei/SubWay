package GUI;

import Buliding.Sandwich.*;

import java.util.Scanner;

/**
 * @author Sarah AlYahayei
 * @date 9 Dec 2018
 * Aim : This class is a user interface to order three sandwiches
 */
public class SandwichChoice {
    static Bread bread1 = new Bread();
    SandwichDataBase sandwich = new SandwichDataBase();


    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        Filings filing = new Filings();
        ExtraToppings extras = new ExtraToppings();
        SandwichMenu menus = new SandwichMenu();
        BreadSize size = new BreadSize();
        Cheese c = new Cheese();
        Sauces sauce = new Sauces();
        SandwichDataBase sandwich = new SandwichDataBase();



        //Step 1 is to choose a sandwich and that sandwich got a price
        sandwichBulid();
        System.out.println("Your first Sandwich");
        String sandw1 = input.nextLine();
        System.out.println("Your Second Sandwich");
        String sandw2 = input.nextLine();
        System.out.println("Your Third Sandwich");
        String sandw3 = input.nextLine();


        //Step two choose bread type
        System.out.println("Bread Menu");
        menus.menuBread();

        System.out.println("Choose bread for sandwich : " + sandw1);
        String bread = input.nextLine();

        System.out.println("Choose a bread for sandwich : " + sandw2);
        String bread2 = input.nextLine();

        System.out.println("Choose a bread for sandwich : " + sandw3);
        String bread3 = input.nextLine();


        //Step three choose the size of your sandwich
        System.out.println("Sandwiches size");
        String sizes[] = {"Regular Size", "Footing"};
        for (int i = 0; i < sizes.length; i++) {
            System.out.println(sizes[i]);
        }
        System.out.println("Choose a size of your sandwich: " + sandw1);
        String sizeBread = input.nextLine();
        System.out.println("Choose a size of your sandwich: " + sandw2);
        String sizeBread2 = input.nextLine();
        System.out.println("Choose a size of your sandwich: " + sandw3);
        String sizeBread3 = input.nextLine();


        //Step four cheese types
        System.out.println("Cheese menu");
        menus.cheeseMenu();


        System.out.println("Choose cheese for sandwich: " + sandw1);
        String cheese = input.nextLine();
        System.out.println("Choose cheese for sandwich: " + sandw2);
        String cheese2 = input.nextLine();
        System.out.println("Choose cheese for sandwich: " + sandw3);
        String cheese3 = input.nextLine();

        //Step five
        System.out.println("Choose filings you want , if you finish write stop this is for sandwich ");
        menus.filingsMenu();


        //1 Filings for sandwich one :
        System.out.println("Choose filings for sandwich: " + sandw1);
        String filings = input.nextLine();

        System.out.println("Choose filings for sandwich: " + sandw2);
        String filings1 = input.nextLine();

        System.out.println("Choose filings for sandwich: " + sandw2);
        String filing2 = input.nextLine();


        //Step 6
        System.out.println("For Extra topping ");
        menus.extraToppingMenu();

        System.out.println(sandw1);
        String extrass = input.nextLine();

        System.out.println(sandw2);
        String extraas2 = input.nextLine();

        System.out.println(sandw3);
        String extraas3 = input.nextLine();


        //Step 6
        System.out.println("Choose your sauce");
        sauce.meun();

        System.out.println("Choose your sauce for sandwich " + sandw1);
        String sauces = input.nextLine();

        System.out.println("Choose your sauce for sandwich " + sandw2);
        String sauces2 = input.nextLine();

        System.out.println("Choose your sauce for sandwich " + sandw3);
        String sauces3 = input.nextLine();


        // Print the receipt
        System.out.printf("%s%n", "Receipt ");
        PrintReport p = new PrintReport();
        //Sandwich 1 breakdown
        System.out.println("Breakdown");
        p.sandw1Print(sandw1);
        System.out.printf("%s%-5d%n", bread, 0);
        System.out.printf("%s", sizeBread);
        System.out.println(size.storeDate(sizeBread));
        System.out.println("Chesse " + cheese);
        System.out.printf("%s%s%n", "Sauce ", sauces);
        System.out.println("Filings" + filing);
        System.out.printf("%s%s",extrass," Cost £");
        System.out.println(extras.storeDate(extrass));
        System.out.println(sandwich.isSandwichVegg(sandw1));

        //sandwich 2 breakdown
        System.out.println("Breakdown");
        p.sandwPrint2(sandw2);
        System.out.printf("%s%s%-5d%n", bread2, "£", 0);
        System.out.printf("%s", sizeBread2);
        System.out.println(size.storeDate(sizeBread2));
        System.out.println("Cheese :" + cheese2);
        System.out.printf("%s%s%n", "Sauce ", sauces2);
        System.out.printf("%s%s",extraas2," Cost £");
        System.out.println(extras.storeDate(extraas2));
        System.out.println(sandwich.isSandwichVegg(sandw2));

        //sandwich 3 breakdown
        System.out.println("Breakdown");
        p.sandwPrint3(sandw3);
        System.out.printf("%s%-5d%n", bread3, 0);
        System.out.printf("%s", sizeBread3);
        System.out.println(size.storeDate(sizeBread3));
        System.out.println("Cheese :" + cheese3);
        System.out.printf("%s%s%n", "Sauce ", sauces3);
        System.out.println("Extras Filings :");
        System.out.printf("%s%s",extraas3," Cost £");
        System.out.println(extras.storeDate(extraas3));
        System.out.println(sandwich.isSandwichVegg(sandw3));


        //cost calculation
        double cost = p.sandwichCost(sandw1, sandw2, sandw3) + p.sizeBreadCost(sizeBread, sizeBread2, sizeBread3)
                + p.extraFilings(extrass, extraas2, extraas3);

        // To print cost with VAT and without
        System.out.println("Total cost Before : £" + cost);
        System.out.println("Total cost Aftter VAT :£" + (p.costVAT(sandw1, sandw2, sandw3, sizeBread, sizeBread2, sizeBread3
                , extrass, extraas2, extraas3) + cost));


    }


    //User interface for choosing three sandwiches
    public static void sandwichBulid() {
        //Step one choosing sandwich
        SandwichMenu sandwichMenu = new SandwichMenu();
        sandwichMenu.menu();

    }



}



