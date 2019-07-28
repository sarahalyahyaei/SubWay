package Testing;


import Buliding.Sandwich.*;

/**
 * @author Sarah Alyahyaei
 * @date 7 Dec 2018
 * Aim : This class is to test the system.
 */
public class SandwichBulid {
    /**
     * @param args
     * @return Bill for the cost one sandwich + VAT
     */

    public static void main(String[] args) {
        SandwichDataBase s = new SandwichDataBase();
        System.out.println("Sandwich : Veggie Delite");
        System.out.println(" cost is :£" + s.storeDate("Veggie Delite"));
        Bread bread = new Bread();
        System.out.printf("%s%-5d%n","9 Grain Wheat Bread £",0);
        BreadSize ss = new BreadSize();
        System.out.println("Cost of footing sandwich is: £" + ss.storeDate("Footing"));
        Cheese c = new Cheese();
        System.out.println("Cheese cost: £" + c.storeDate("None"));
        Filings f = new Filings();
        System.out.println("Filings cost cucumber : £" + f.storeDate("Cucumber"));
        System.out.println(s.isSandwichVegg("Veggie Patty"));
        double costt = 0.2 * (s.storeDate("Big Beef Melt") + ss.storeDate("Footing"));
        double costAfterTax = costt + s.storeDate("Big Beef Melt") + ss.storeDate("Footing");
        System.out.println("Total cost With VAT :£" + costAfterTax);
        System.out.println("VTA :" + costt);

    }
}
