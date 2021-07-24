public class Beyonce {
    public static void coinCounter(double dimes, double pennies, double nickles, double quarters, double dollars){
//        verified = 29;
        int dimeCount = 29;
//       verified = 390;
        int pennyCount = 390;
//        verified = 9;
        int nickleCount = 9;
//        verified = 11;
        int quarterCount = 11;
//        verified = null;
        int dollarCount = 0;
        double dimeTotal = (dimes * dimeCount);
        double pennyTotal = (pennies * pennyCount);
        double nickleTotal = (nickles * nickleCount);
        double quarterTotal = (quarters * quarterCount);
        double dollarTotal = (dollars * dollarCount);
        double total = (dimeTotal + pennyTotal + nickleTotal + quarterTotal + dollarTotal);
            System.out.println("You now have $" + total);
    }
    public static void coinCounter(){
        System.out.println("Yo, I am Beyoonccceee, your virtual coin Counter!");
        System.out.println("I was created to make your life simpler by counting your coins and dollars too!");
        System.out.println("Let's see here");
    }
    public static void CoinCounter(){
        System.out.printf(".....%n.....%n");
    }
    public static void main(String[] args){
        coinCounter();
        CoinCounter();
        coinCounter(.10,.01,.05,.25, 1.00);
        System.out.println("Don't forget to update me!");
        
    }
    }



  
