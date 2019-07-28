package GUI;

import Buliding.Sandwich.*;

/**
 * @author Sarah Al Yahyaei
 * @date 11 Dec 2018
 * Aim : This class is to print a menu to the user
 */

public class SandwichMenu {

    /**
     * Test for the menus
     * @param args
     */

    // A test
    public static void main(String[] args) {
        System.out.println("Sandwich Menu");
        menu();
        menuBread();
        filingsMenu();
        cheeseMenu();
        saucesMenu();
    }

    //Sandwich menu
    public static void menu() {
        SandwichDataBase sandwichM = new SandwichDataBase();
        System.out.println("Choose a sandwich");
        sandwichM.meun();
    }

    //bread menu
    public static void menuBread() {
        Bread breadMenu = new Bread();
        breadMenu.breadMenu();
    }

    //Filings
    public static void filingsMenu() {
        Filings f = new Filings();
        System.out.println(f.meun());

    }

    //Cheese

    public static void cheeseMenu() {
        Cheese c = new Cheese();
        System.out.println(c.meun());
    }

    //Sauces

    public static void saucesMenu() {
        Sauces s = new Sauces();
       s.meun();

    }

    public static void extraToppingMenu(){
        ExtraToppings e = new ExtraToppings();
        System.out.println(e.meun());
    }
}


