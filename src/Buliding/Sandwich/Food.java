package Buliding.Sandwich;

/**
 * @author Sarah Al Yahyaei
 * @date 9 Dec 2018
 * aim : This class is to have setter and getter method
 * for set the name and set the cost for each ingredient
 * in the sandwich or the name only as a result of
 * some ingredients are without price .
 * @SuperClass
 */
public class Food {

    private String name;
    private double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
