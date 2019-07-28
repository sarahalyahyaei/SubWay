package Buliding.Sandwich;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Sarah Alyhayaei
 * @date 9 Dec 2018
 * Aims : This class is to store extra topping in array
 */
public class ExtraToppings extends Food implements Ingerdintes {
    /**
     * @param name
     * @return cost
     */

    @Override
    public double storeDate(String name) {
        Map<String, Double> extraTopping = new HashMap<>();
        //1
        ExtraToppings avocado = new ExtraToppings();
        avocado.setName("Avocado");
        avocado.setCost(0.60);
        extraTopping.put(avocado.getName(), avocado.getCost());

        //2
        ExtraToppings bacon = new ExtraToppings();
        bacon.setName("Extra Bacon");
        bacon.setCost(0.60);
        extraTopping.put(bacon.getName(), bacon.getCost());

        //3
        ExtraToppings doubleMeat = new ExtraToppings();
        doubleMeat.setName("Double Meat");
        doubleMeat.setCost(1.20);
        extraTopping.put(doubleMeat.getName(), doubleMeat.getCost());

        //4
        ExtraToppings choirzo = new ExtraToppings();
        choirzo.setName("Chorizo");
        choirzo.setCost(0.60);
        extraTopping.put(choirzo.getName(), choirzo.getCost());

        //5
        ExtraToppings cheese = new ExtraToppings();
        cheese.setName("Extra Cheese");
        cheese.setCost(0.30);
        extraTopping.put(cheese.getName(), cheese.getCost());

        //6
        ExtraToppings none = new ExtraToppings();
        none.setName("None");
        none.setCost(0.0);
        extraTopping.put(none.getName(),none.getCost());

        return extraTopping.get(name);
    }

    /**
     *
     * @return keys
     */
    @Override
    public String meun() {
        Map<String, Double> extraTopping = new HashMap<>();
        //1
        ExtraToppings avocado = new ExtraToppings();
        avocado.setName("Avocado");
        avocado.setCost(0.60);
        extraTopping.put(avocado.getName(), avocado.getCost());

        //2
        ExtraToppings bacon = new ExtraToppings();
        bacon.setName("Extra Bacon");
        bacon.setCost(0.60);
        extraTopping.put(bacon.getName(), bacon.getCost());

        //3
        ExtraToppings doubleMeat = new ExtraToppings();
        doubleMeat.setName("Double Meat");
        doubleMeat.setCost(1.20);
        extraTopping.put(doubleMeat.getName(), doubleMeat.getCost());

        //4
        ExtraToppings choirzo = new ExtraToppings();
        choirzo.setName("Chorizo");
        choirzo.setCost(0.60);
        extraTopping.put(choirzo.getName(), choirzo.getCost());

        //5
        ExtraToppings cheese = new ExtraToppings();
        cheese.setName("Extra Cheese");
        cheese.setCost(0.30);
        extraTopping.put(cheese.getName(), cheese.getCost());

        //6
        ExtraToppings none = new ExtraToppings();
        none.setName("None");
        none.setCost(0.0);
        extraTopping.put(none.getName(),none.getCost());


        // To return a set of keys for meny
        Set key = extraTopping.keySet();
        return String.format("%s%n", key);
    }
}
