package Buliding.Sandwich;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sarah Al Yahyaei
 * @date 7 Dec 2018
 * Aim of this class is to store subway sauces in array.
 */
public class Sauces extends Food {
    /**
     *
     * @param name
     */

    public double storeDate(String name) {
            Map<String,Double> sauce = new HashMap<>();

            //1
            Sauces bbq = new Sauces();
            bbq.setName("BBQ Sauce");
            bbq.setCost(0d);
            sauce.put(bbq.getName(),bbq.getCost());

            //2
            Sauces chipotleSouthwest = new Sauces();
            chipotleSouthwest.setName("Chipotle Southwest");
            chipotleSouthwest.setCost(0d);
            sauce.put(chipotleSouthwest.getName(),chipotleSouthwest.getCost());

            //3
            Sauces cranberry = new Sauces();
            cranberry.setName("Cranberry Sauce");
            cranberry.setCost(0d);
            sauce.put(cranberry.getName(),cranberry.getCost());

            //4
            Sauces hotChiliSauce = new Sauces();
            hotChiliSauce.setName("Hot Chili Sauce");
            hotChiliSauce.setCost(0d);
            sauce.put(hotChiliSauce.getName(),hotChiliSauce.getCost());

            //5
            Sauces lightMayo = new Sauces();
            lightMayo.setName("Light Mayo");
            lightMayo.setCost(0d);
            sauce.put(lightMayo.getName(),lightMayo.getCost());

            //6
            Sauces marinara = new Sauces();
            marinara.setName("Marinara");
            marinara.setCost(0d);
            sauce.put(marinara.getName(),marinara.getCost());

            //7
            Sauces ranch = new Sauces();
            ranch.setName("Ranch");
            ranch.setCost(0d);
            sauce.put(ranch.getName(),ranch.getCost());

            //8
            Sauces sweetChiliSauce = new Sauces();
            sweetChiliSauce.setName("Sweet Chili Sauce");
            sweetChiliSauce.setCost(0d);
            sauce.put(sweetChiliSauce.getName(),sweetChiliSauce.getCost());

            //9
            Sauces sweetonion = new Sauces();
            sweetonion.setName("Sweet Onion");
            sweetonion.setCost(0d);
            sauce.put(sweetonion.getName(),sweetonion.getCost());

            //10
            Sauces none = new Sauces();
            none.setName("None");
            none.setCost(0d);
            sauce.put(none.getName(),none.getCost());

            return sauce.get(name);


        }


    public void meun() {

        Map<String,Double> sauce = new HashMap<>();

        //1
        Sauces bbq = new Sauces();
        bbq.setName("BBQ Sauce");
        bbq.setCost(0d);
        sauce.put(bbq.getName(),bbq.getCost());

        //2
        Sauces chipotleSouthwest = new Sauces();
        chipotleSouthwest.setName("Chipotle Southwest");
        chipotleSouthwest.setCost(0d);
        sauce.put(chipotleSouthwest.getName(),chipotleSouthwest.getCost());

        //3
        Sauces cranberry = new Sauces();
        cranberry.setName("Cranberry Sauce");
        cranberry.setCost(0d);
        sauce.put(cranberry.getName(),cranberry.getCost());

        //4
        Sauces hotChiliSauce = new Sauces();
        hotChiliSauce.setName("Hot Chili Sauce");
        hotChiliSauce.setCost(0d);
        sauce.put(hotChiliSauce.getName(),hotChiliSauce.getCost());

        //5
        Sauces lightMayo = new Sauces();
        lightMayo.setName("Light Mayo");
        lightMayo.setCost(0d);
        sauce.put(lightMayo.getName(),lightMayo.getCost());

        //6
        Sauces marinara = new Sauces();
        marinara.setName("Marinara");
        marinara.setCost(0d);
        sauce.put(marinara.getName(),marinara.getCost());

        //7
        Sauces ranch = new Sauces();
        ranch.setName("Ranch");
        ranch.setCost(0d);
        sauce.put(ranch.getName(),ranch.getCost());

        //8
        Sauces sweetChiliSauce = new Sauces();
        sweetChiliSauce.setName("Sweet Chili Sauce");
        sweetChiliSauce.setCost(0d);
        sauce.put(sweetChiliSauce.getName(),sweetChiliSauce.getCost());

        //9
        Sauces sweetonion = new Sauces();
        sweetonion.setName("Sweet Onion");
        sweetonion.setCost(0d);
        sauce.put(sweetonion.getName(),sweetonion.getCost());

        //10
        Sauces none = new Sauces();
        none.setName("None");
        none.setCost(0d);
        sauce.put(none.getName(),none.getCost());

        for(String key : sauce.keySet()){
            System.out.println(key);
        }
    }
}
