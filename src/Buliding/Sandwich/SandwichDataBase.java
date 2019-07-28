package Buliding.Sandwich;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sarah Alyahyaei
 * @date 5 Dec 2018
 * Aim: this class is for storing sandwich types.
 */

public class SandwichDataBase extends Food {

    Map<String, Double> sandwich = new HashMap<>();

    public double storeDate(String name) {
        /**
         * This method is to return the cost of the sandwich
         */
        //First Sandwich
        SandwichDataBase sandwich1 = new SandwichDataBase();
        sandwich1.setName("Chicken Tikka");
        sandwich1.setCost(3.25);
        sandwich.put(sandwich1.getName(), sandwich1.getCost());

        //2
        SandwichDataBase itlianB = new SandwichDataBase();
        itlianB.setName("Itlian B.M.T");
        itlianB.setCost(3.25);
        sandwich.put(itlianB.getName(), itlianB.getCost());

        //3
        SandwichDataBase tuna = new SandwichDataBase();
        tuna.setName("Tuna");
        tuna.setCost(3.25);
        sandwich.put(tuna.getName(), tuna.getCost());

        //4
        SandwichDataBase ham = new SandwichDataBase();
        ham.setName("Ham");
        ham.setCost(3.10);
        sandwich.put(ham.getName(), ham.getCost());

        //5
        SandwichDataBase veggiePatty = new SandwichDataBase();
        veggiePatty.setName("Veggie Patty");
        veggiePatty.setCost(2.60);
        sandwich.put(veggiePatty.getName(),veggiePatty.getCost());


        //6
        SandwichDataBase steakAndCheese = new SandwichDataBase();
        steakAndCheese.setName("Steak and Cheese");
        steakAndCheese.setCost(4.60);
        sandwich.put(steakAndCheese.getName(), steakAndCheese.getCost());

        //7
        SandwichDataBase meltBall = new SandwichDataBase();
        meltBall.setName("Meltball Marinara");
        meltBall.setCost(4.20);
        sandwich.put(meltBall.getName(), meltBall.getCost());

        //8
        SandwichDataBase spicyItalian = new SandwichDataBase();
        spicyItalian.setName("Spicy Italian");
        spicyItalian.setCost(3.25);
        sandwich.put(spicyItalian.getName(), spicyItalian.getCost());

        //9
        SandwichDataBase turkeyBreastAndBacon = new SandwichDataBase();
        turkeyBreastAndBacon.setName("Turkey Breast and Ham");
        turkeyBreastAndBacon.setCost(3.10);
        sandwich.put(turkeyBreastAndBacon.getName(), turkeyBreastAndBacon.getCost());

        //10
        SandwichDataBase chickenAndBaconRanchMelt = new SandwichDataBase();
        chickenAndBaconRanchMelt.setName("Chicken and Bacon Ranch");
        chickenAndBaconRanchMelt.setCost(4.60);
        sandwich.put(chickenAndBaconRanchMelt.getName(), chickenAndBaconRanchMelt.getCost());

        //11
        SandwichDataBase chickenTeriyaki = new SandwichDataBase();
        chickenTeriyaki.setName("Chicken Teriyaki");
        chickenTeriyaki.setCost(4.50);
        sandwich.put(chickenTeriyaki.getName(), chickenTeriyaki.getCost());

        //12
        SandwichDataBase chickenBreast = new SandwichDataBase();
        chickenBreast.setName("Chicken Breast");
        chickenBreast.setCost(3.75);
        sandwich.put(chickenBreast.getName(), chickenBreast.getCost());

        //13
        SandwichDataBase turkeyBreast = new SandwichDataBase();
        turkeyBreast.setName("Turkey Breast");
        turkeyBreast.setCost(3.10);
        sandwich.put(turkeyBreast.getName(), turkeyBreast.getCost());

        //14
        SandwichDataBase veggieDelite = new SandwichDataBase();
        veggieDelite.setName("Veggie Delite");
        veggieDelite.setCost(2.60);
        sandwich.put(veggieDelite.getName(), veggieDelite.getCost());

        //15
        SandwichDataBase subwayMelt = new SandwichDataBase();
        subwayMelt.setName("Subway Melt");
        subwayMelt.setCost(4.50);
        sandwich.put(subwayMelt.getName(), subwayMelt.getCost());

        //16
        SandwichDataBase chickenPizzola = new SandwichDataBase();
        chickenPizzola.setName("Chicken Pizziola");
        chickenPizzola.setCost(4.60);
        sandwich.put(chickenPizzola.getName(), chickenPizzola.getCost());

        //17
        SandwichDataBase bigBeefMelt = new SandwichDataBase();
        bigBeefMelt.setName("Big Beef Melt");
        bigBeefMelt.setCost(3.90);
        sandwich.put(bigBeefMelt.getName(), bigBeefMelt.getCost());

        //18
        SandwichDataBase chipotleChickenMelt = new SandwichDataBase();
        chipotleChickenMelt.setName("Chipotle Chicken Melt");
        chipotleChickenMelt.setCost(3.75);
        sandwich.put(chipotleChickenMelt.getName(), chipotleChickenMelt.getCost());

        return sandwich.get(name);
    }


    public void meun() {
        Map<String, Double> sandwich = new HashMap<>();
        //First Sandwich
        SandwichDataBase sandwich1 = new SandwichDataBase();
        sandwich1.setName("Chicken Tikka");
        sandwich1.setCost(3.25);
        sandwich.put(sandwich1.getName(), sandwich1.getCost());

        //2
        SandwichDataBase itlianB = new SandwichDataBase();
        itlianB.setName("Itlian B.M.T");
        itlianB.setCost(3.25);
        sandwich.put(itlianB.getName(), itlianB.getCost());

        //3
        SandwichDataBase tuna = new SandwichDataBase();
        tuna.setName("Tuna");
        tuna.setCost(3.25);
        sandwich.put(tuna.getName(), tuna.getCost());

        //4
        SandwichDataBase ham = new SandwichDataBase();
        ham.setName("Ham");
        ham.setCost(3.10);
        sandwich.put(ham.getName(), ham.getCost());

        //5
        SandwichDataBase veggiePatty = new SandwichDataBase();
        veggiePatty.setName("Veggie Patty");
        veggiePatty.setCost(2.60);
        sandwich.put(veggiePatty.getName(),veggiePatty.getCost());

        //6
        SandwichDataBase steakAndCheese = new SandwichDataBase();
        steakAndCheese.setName("Steak and Cheese");
        steakAndCheese.setCost(4.60);
        sandwich.put(steakAndCheese.getName(), steakAndCheese.getCost());

        //7
        SandwichDataBase meltBall = new SandwichDataBase();
        meltBall.setName("Meltball Marinara");
        meltBall.setCost(4.20);
        sandwich.put(meltBall.getName(), meltBall.getCost());

        //8
        SandwichDataBase spicyItalian = new SandwichDataBase();
        spicyItalian.setName("Spicy Italian");
        spicyItalian.setCost(3.25);
        sandwich.put(spicyItalian.getName(), spicyItalian.getCost());

        //9
        SandwichDataBase turkeyBreastAndBacon = new SandwichDataBase();
        turkeyBreastAndBacon.setName("Turkey Breast and Ham");
        turkeyBreastAndBacon.setCost(3.10);
        sandwich.put(turkeyBreastAndBacon.getName(), turkeyBreastAndBacon.getCost());

        //10
        SandwichDataBase chickenAndBaconRanchMelt = new SandwichDataBase();
        chickenAndBaconRanchMelt.setName("Chicken and Bacon Ranch");
        chickenAndBaconRanchMelt.setCost(4.60);
        sandwich.put(chickenAndBaconRanchMelt.getName(), chickenAndBaconRanchMelt.getCost());

        //11
        SandwichDataBase chickenTeriyaki = new SandwichDataBase();
        chickenTeriyaki.setName("Chicken Teriyaki");
        chickenTeriyaki.setCost(4.50);
        sandwich.put(chickenTeriyaki.getName(), chickenTeriyaki.getCost());

        //12
        SandwichDataBase chickenBreast = new SandwichDataBase();
        chickenBreast.setName("Chicken Breast");
        chickenBreast.setCost(3.75);
        sandwich.put(chickenBreast.getName(), chickenBreast.getCost());

        //13
        SandwichDataBase turkeyBreast = new SandwichDataBase();
        turkeyBreast.setName("Turkey Breast");
        turkeyBreast.setCost(3.10);
        sandwich.put(turkeyBreast.getName(), turkeyBreast.getCost());

        //14
        SandwichDataBase veggieDelite = new SandwichDataBase();
        veggieDelite.setName("Veggie Delite");
        veggieDelite.setCost(2.60);
        sandwich.put(veggieDelite.getName(), veggieDelite.getCost());

        //15
        SandwichDataBase subwayMelt = new SandwichDataBase();
        subwayMelt.setName("Subway Melt");
        subwayMelt.setCost(4.50);
        sandwich.put(subwayMelt.getName(), subwayMelt.getCost());

        //16
        SandwichDataBase chickenPizzola = new SandwichDataBase();
        chickenPizzola.setName("Chicken Pizziola");
        chickenPizzola.setCost(4.60);
        sandwich.put(chickenPizzola.getName(), chickenPizzola.getCost());

        //17
        SandwichDataBase bigBeefMelt = new SandwichDataBase();
        bigBeefMelt.setName("Big Beef Melt");
        bigBeefMelt.setCost(3.90);
        sandwich.put(bigBeefMelt.getName(), bigBeefMelt.getCost());

        //18
        SandwichDataBase chipotleChickenMelt = new SandwichDataBase();
        chipotleChickenMelt.setName("Chipotle Chicken Melt");
        chipotleChickenMelt.setCost(3.75);
        sandwich.put(chipotleChickenMelt.getName(), chipotleChickenMelt.getCost());

        for (String key : sandwich.keySet()) {

            System.out.println(key);
        }

    }

    /**
     * @param sandw
     * @return if sandwich is vegetarian then its a veg sandwich
     * else it will be nut free
     */
    public String isSandwichVegg(String sandw) {

        String sandwichVeg = "Veggie Delite";
        String sandwichVeg2 = "Veggie Patty";

        String ss =null;
        if (sandw == sandwichVeg) {
             ss = String.format("%s%n", "Your sandwich is vegetarian");
        } else if (sandw == sandwichVeg2) {
             ss = String.format("%s%n", "Your sandwich is vegetarian");
        }else {

            ss = String.format("%s%n", "Your sandwich is nut free");
        }
        return ss;
    }

}



