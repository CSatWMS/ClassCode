package Unit1;

public class VariablesAndMath {
    public static void main(String[] args) {
        //dataType variableName = value;

        /*
        Variable Naming Rules and Conventions:

        Rules: Must always apply
            1. No Spaces
            2. Cannot be a reserved word (true, public, try, do)
            3. Alphanumeric (also use _)
            4. Cannot start with a number
        Conventions: Suggestions, all computer scientists try to follow these
            1. Descriptive
            2. Starts with a lowercase letter
            3. Deal with the nospace thing
                a. camelCasingForLongNames
                b. underscores_for_long_names
         */


        // the number of siblings you have
        int numSiblings = 4;
        // do you have pets
        boolean hasPets = true;
        // your middle name
        String middleName = "Elvira";

        /*
        Math Methods

        Square Root
        double root = Math.sqrt(number);

        Exponents
        double result = Math.pow(base, power);
            2^5 -> Math.pow(2, 5);

        Absolute Value
        numberType posVersion = Math.abs(number);

        Rounding
        int roundedWholeNumber = Math.round(otherNumber);
            follows regular rounding rules (.5+ goes up)


        Random Numbers
        double randomNumber = Math.random();
            randomNumber is a random decimal between 0 and 1
                0 is inclusive
                1 is exclusive
            If I want a number on the range [a, b)
                Math.random() * (b - a) + a

         */

        //between -10 and 10
        double randomNumber = Math.random() * (10 - -10) + -10;
        double randomAgain = Math.random() * 20 - 10;

        System.out.println(randomNumber);
        System.out.println(randomAgain);

        double subTotal = Math.random() * (50 - 20) + 20;
        int tipPercentage = 22;

        double tipAmount = subTotal * (tipPercentage / 100.0);

        double total = subTotal + tipAmount;

        subTotal = Math.round(subTotal * 100) / 100.0;
        System.out.println("Subtotal: \t\t$" + subTotal);
        System.out.println("Tip: \t\t\t$" + Math.round(tipAmount* 1000) / 1000.0);

        int powerOf10 = 100;
        System.out.println("Final Total: \t$" + Math.round(total * powerOf10) / (double) powerOf10);

        int a = 6 / 3; //2
        int b = 7 / 3; //2 (integer division) -> truncation
            //truncation means chopping off the decimal (no rounding)
        double c = 6 / 3; //2.0
            //promotion is when an int gets promoted to a double
        double cEx = 2;
        double d = 7 / 3; //2.0
        double e = 7.0 / 3; //2.33333
        //int f = (7.0 / 3); -> possible lossy conversion error
        int g = (int) (7.0 / 3); //2

        double h = (double) 7 / 3; //2.33
        double i = 7 / (double) 3; //2.333
        double j = (double) (7 / 3); //2.0






    }



}
