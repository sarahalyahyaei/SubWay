package Buliding.Sandwich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sarah Alyahyaei
 * @date 7 Dec 2018
 * Aim : This class to store the types of bread.
 */
public class Bread extends Food {

    List<String> breadTypes = new ArrayList<String>();

    /**Store Data
     * @param bread
     * @return bread type
     */

    public String breadTypes(String bread) {


        //1
        setName("9 Grain Wheat Bread");
        breadTypes.add(getName());

        //2

        setName("Flat Bread");
        breadTypes.add(getName());

        //3
        Food heartyItalian = new Food();
        setName("Hearty Italian");
        breadTypes.add(getName());

        //4
        Food honeyOat = new Food();
        setName("Honey Oat");
        breadTypes.add(getName());

        //5
        Food italianHerbsAndCheese = new Food();
        setName("Italian Herbs and Cheese");
        breadTypes.add(getName());

        //6
        Food whiteBread = new Food();
        setName("White Bread");
        breadTypes.add(getName());

        Collections.sort(breadTypes);
        breadTypes = Collections.unmodifiableList(breadTypes);


        return bread;
    }

    /**
     * To print menu
     * 
     */
    public void breadMenu() {
        //1
        setName("9 Grain Wheat Bread");
        breadTypes.add(getName());

        //2

        setName("Flat Bread");
        breadTypes.add(getName());

        //3
        Food heartyItalian = new Food();
        setName("Hearty Italian");
        breadTypes.add(getName());

        //4
        Food honeyOat = new Food();
        setName("Honey Oat");
        breadTypes.add(getName());

        //5
        Food italianHerbsAndCheese = new Food();
        setName("Italian Herbs and Cheese");
        breadTypes.add(getName());

        //6
        Food whiteBread = new Food();
        setName("White Bread");
        breadTypes.add(getName());

        for (String i : breadTypes) {
            System.out.println(i);

        }
    }

}