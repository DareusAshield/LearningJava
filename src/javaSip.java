public class javaSip{

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate,
                                               double people) {

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = (listedMealPrice + tip + tax)/people;
        System.out.println("Your total meal price is " + result);
    }
    public static void main(String[] args) {

//        calculateTotalMealPrice(15,.3,.08);
        calculateTotalMealPrice(100,.2,.08,5);

    }
}
