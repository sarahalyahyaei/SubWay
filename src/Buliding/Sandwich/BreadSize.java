package Buliding.Sandwich;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sarah Alyahyaei
 * @date 7 Dec 2018
 * Aim : This class is to store bread sizes
 */
public class BreadSize extends Food implements Ingerdintes {
    /**
     * @param size
     * @return cost
     */

    Map<String, Double> braadSize = new HashMap<>();

    @Override
    public double storeDate(String name) {

        //1
        BreadSize regularSize = new BreadSize();
        regularSize.setName("Regular Size");
        regularSize.setCost(0.0);
        braadSize.put(regularSize.getName(), regularSize.getCost());

        //2
        BreadSize footingSize = new BreadSize();
        footingSize.setName("Footing");
        footingSize.setCost(2.40);
        braadSize.put(footingSize.getName(), footingSize.getCost());


// This will return the cost of the sandwich size by the key in the array
        return braadSize.get(name);

    }
//I do not need this method :)
    @Override
    public String meun() {
        return null;
    }
}
