package Buliding.Sandwich;

import java.util.*;

/**
 * @author Sarah Alyahyaei
 * @date 7 Dec 2018
 * Aim : This class is to store filings names and then show to the user menu to choose
 */
public class Filings extends Food implements Ingerdintes {


    @Override
    public double storeDate(String name) {
      return 0;

    }

    /**
     *
     * @return list of chooses to the user
     */
    @Override
    public String meun() {
        List<String> filings = new ArrayList<>();
        //1
        Filings cucumber = new Filings();
        cucumber.setName("Cucumber");

        //2
        Filings jalapenos = new Filings();
        jalapenos.setName("Jalapenos");



        //3
        Filings lettuce = new Filings();
        lettuce.setName("Lettuce");


        //4
        Filings olives = new Filings();
        olives.setName("Olives");



        //5
        Filings peppers = new Filings();
        peppers.setName("Peppers");



        //6
        Filings pickles = new Filings();
        pickles.setName("Pickles");



        //7
        Filings tomato = new Filings();
        tomato.setName("Tomato");



        //8
        Filings none = new Filings();
        none.setName("None");

        return "s";

    }
}
