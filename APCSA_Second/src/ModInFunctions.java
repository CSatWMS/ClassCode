public class ModInFunctions {

    public static void main(String[] args) {
        changeCalculator(26.18, 100);
        mathMaster(7, 3);
    }

    //MathMaster
        //print out the sum, remainder, product, and exponent for 2 numbers
            //You cannot do arithmetic in math master

    static void mathMaster(int a, int b){
        //call methods in here
        int added = sum(a, b);
        System.out.println(a + " + " + b + " = " + added);
    }

    static int sum(int a, int b){
        return a + b;
    }


    //GOAL: create a change calculator
        //display the number 20's 10's 5's 1's that someone would need
    //price, amtTendered -> amtOf change
    // $79
    // calculate num20's by dividing
    // Grab what's left
    //repeat process for 10's, 5's
    static void changeCalculator(double price, double amtTendered){
        double amtOfChange = amtTendered - price;
        System.out.println("Change: " + amtOfChange);
        int num20s = (int) (amtOfChange / 20);
        System.out.println("20's: " + num20s);

        amtOfChange = amtOfChange % 20;

        int num10s = (int) (amtOfChange / 10);
        System.out.println("10's: " + num10s);

        amtOfChange = amtOfChange % 10;

        int num5s = (int) (amtOfChange / 5);
        System.out.println("5's: " + num5s);
        amtOfChange %= 5;

        int num1s = (int) amtOfChange;
        System.out.println("1's: " + num1s);

        amtOfChange -= num1s;
        //amtOfChange is just the decimal

        amtOfChange *= 100;

        int numQuarters = (int) (amtOfChange / 25);
        System.out.println("Quarters: " + numQuarters);

        amtOfChange = amtOfChange % 25;
        System.out.println("Remaining change: " + amtOfChange);

        int numDimes = (int) (amtOfChange / 10);
        System.out.println("Dimes: " + numDimes);

        amtOfChange %= 10;

        int numNickels = (int) (amtOfChange / 5);
        System.out.println("Nickels: " + numNickels);

        amtOfChange %= 5;

        int numPennies = (int) Math.round(amtOfChange);
        System.out.println("Pennies: " + numPennies);

    }
}
