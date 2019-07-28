package Buliding.Sandwich;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Sarah Al Yahyaei
 * @date 9 Dec 2018
 * Aim : This class is for store cheese types data to then use it for the user to bulid their
 * own sandwich .
 */
public class Cheese extends Food implements Ingerdintes {
    /**
     * @param cheese
     * @return
     */
    Map<String, Double> chesse = new HashMap<>();


    /**
     *
     * @param name
     * @return cost
     */
    @Override
    public double storeDate(String name) {

        //1
        Cheese montereyCheddar = new Cheese();
        montereyCheddar.setName("Monterey Cheddar");
        montereyCheddar.setCost(0d);
        chesse.put(montereyCheddar.getName(), montereyCheddar.getCost());
        //2
        Cheese pepperedCheese = new Cheese();
        pepperedCheese.setName("Peppered Cheese");
        pepperedCheese.setCost(0d);
        chesse.put(pepperedCheese.getName(), pepperedCheese.getCost());
        //3
        Cheese none = new Cheese();
        none.setName("None");
        none.setCost(0d);
        chesse.put(none.getName(), none.getCost());
        return chesse.get(name);
    }

    /**
     *
     * @return keys
     */
    @Override
    public String meun() {
        //1
        Cheese montereyCheddar = new Cheese();
        montereyCheddar.setName("Monterey Cheddar");
        montereyCheddar.setCost(0d);
        chesse.put(montereyCheddar.getName(), montereyCheddar.getCost());
        //2
        Cheese pepperedCheese = new Cheese();
        pepperedCheese.setName("Peppered Cheese");
        pepperedCheese.setCost(0d);
        chesse.put(pepperedCheese.getName(), pepperedCheese.getCost());
        //3
        Cheese none = new Cheese();
        none.setName("None");
        none.setCost(0d);
        chesse.put(none.getName(), none.getCost());

        Set key = chesse.keySet();
        return String.format("%s%n",key);


    }
}
