import java.sql.SQLOutput;

public class ModInFunctions {

    public static void main(String[] args) {
        changeCalculator(26.57, 100);
    }

    //MathMaster
        //print out: sum, difference, remainder, product, and a^b for 2 numbers
        //can't actually do any math in mathMaster

    

    //GOAL: Print out the number of 20's, 10's, 5's, 1's
    static void changeCalculator(double price, double amtTendered){
        //calc the amount of change
        double amountOfChange = amtTendered - price;
        System.out.println("Amount of change: " + amountOfChange);
        //79
        //79 % 20 -> 19

        //calculate the number of 20s
        int num20s = (int) (amountOfChange / 20);
        //deal with the 20s

        amountOfChange = amountOfChange % 20;
        //Calculate the number of 10s
        int num10s = (int) (amountOfChange) / 10;

        amountOfChange = amountOfChange % 10;

        //calculate number of 5's
        int num5s = (int) (amountOfChange / 5);

        amountOfChange %= 5;

        //calculate number of 1's
        int num1s = (int) (amountOfChange);


        System.out.println("20s: " + num20s);
        System.out.println("10s: " + num10s);
        System.out.println("5s: " + num5s);
        System.out.println("1s: " + num1s);

        amountOfChange = amountOfChange - num1s;

        amountOfChange *= 100;

        int numQuarters = (int) (amountOfChange / 25);
        System.out.println("Num Quarters: " + numQuarters);

        amountOfChange %= 25;
       // System.out.println("remaining change: " + amountOfChange);

        int numDimes = (int) (amountOfChange / 10);
        amountOfChange %= 10;
        System.out.println("Num Dimes: " + numDimes);

        int numNickels = (int) (amountOfChange / 5);
        amountOfChange %= 5;
        System.out.println("Num Nickels: " + numNickels);

        int numPennies = (int) (amountOfChange);
        System.out.println("Num Pennies: " + numPennies);


    }
}
