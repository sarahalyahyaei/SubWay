package GUI;

import Buliding.Sandwich.BreadSize;
import Buliding.Sandwich.ExtraToppings;
import Buliding.Sandwich.SandwichDataBase;

/** CSC1021
 * @author Sarah Al Yahyaei
 * @date 11 Dec 2018
 * Aim : This class is to print the receipt
 */
public class PrintReport {

    final static double VAT = 0.2d;
    SandwichDataBase s = new SandwichDataBase();

    public static double getVAT() {
        return VAT;
    }

    /**
     *
     * @param sandw1
     * @param sandw2
     * @param sandw3
     * @param a
     * @param b
     * @param c
     * @return VAT
     */
    public double costVAT(String sandw1, String sandw2, String sandw3,String a,String b, String c,String h , String w , String y) {

      double costVAT = ((sandwichCost(sandw1,sandw2,sandw3)+sizeBreadCost(a,b,c)
             + extraFilings(h,w,y))*0.2);
      return costVAT;

    }

    /**
     *
     * @param sandw1
     * @param sandw2
     * @param sandw3
     * @return addition of sandwiches cost
     */

    public static double sandwichCost(String sandw1, String sandw2, String sandw3) {
        SandwichDataBase s1 = new SandwichDataBase();
        return
                +s1.storeDate(sandw1)
                        + s1.storeDate(sandw2)
                        + s1.storeDate(sandw3);
    }

    /**
     *
     * @param sizeBread
     * @param sizeBread2
     * @param sizeBread3
     * @return addition of bread size cost
     */

    public static double sizeBreadCost(String sizeBread, String sizeBread2, String sizeBread3) {
        BreadSize size = new BreadSize();
        return size.storeDate(sizeBread)
                + size.storeDate(sizeBread2)
                + size.storeDate(sizeBread3);
    }

    /**
     *
     * @param sandw1
     * To show to the user what the have chosen
     */

    public void sandw1Print(String sandw1){
        System.out.printf("%s%-5s%s", "Sandwich cost ", sandw1," £");
        System.out.println(s.storeDate(sandw1));

    }

    /**
     * To show to the user what the have chosen
     * @param sandw2
     */

    public void sandwPrint2(String sandw2){

        System.out.printf("%s%-5s%s", "Sandwich cost ", sandw2," £");
        System.out.println(s.storeDate(sandw2));

    }

    /**
     * To show to the user what the have chosen
     * @param sandw3
     */

    public void sandwPrint3(String sandw3){

        System.out.printf("%s%-5s%s", "Sandwich cost ", sandw3," £");
        System.out.println(s.storeDate(sandw3));

    }

    /**
     *
     * @param e
     * @param h
     * @param y
     * @return
     */
    public double extraFilings(String e,String h , String y){
        ExtraToppings f = new ExtraToppings();
       return f.storeDate(e)+f.storeDate(h)+f.storeDate(y);
    }


}

