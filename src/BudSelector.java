import java.util.Random;

public class BudSelector {

    public static void budSelectorGreetings(){
        System.out.println("Hi, I am Yara, your virtual flower picker!");
        System.out.println("I was created to make your life simpler by deciding your bud selection for you!");
        System.out.println("Let's take the guess work out of things and save time");

    }



    public static void main(String[] args) {
        budSelectorGreetings();
        Beyonce.CoinCounter();
        budSelectorMethod();

    }

        public static void budSelectorMethod(){
            Object[] budSelection = {
                    "Gmo",
                    "tangerine",
                    "ice cream cake",
                    "lemon kush"

            };
            for(Object bud:
                 budSelection) {
            System.out.println("Your options for today are " + bud);
            }
//            System.out.println("Your options for today are " + budSelection[0]
//                                                            + "\n" + budSelection[1]
//                                                            + "\n" + budSelection[2]
//                                                            + "\n" + budSelection[3]
//                            );

            System.out.printf("Randomly picking a bud strain for you to try.%n");
            System.out.printf(".....%n.....%n");
            System.out.println("And you will be having");
            Random random = new Random();
            int index = random.nextInt(budSelection.length);
            System.out.println(budSelection[index]);

        }


    }




