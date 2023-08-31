package Unit1;

public class VariablesAndMath {
    public static void main(String[] args) {

        /*
        Variable naming rules and conventions

        Rules: Something we must always do (it will not compile if I don't do this)
            1. No Spaces
            2. No Reserved Words (are blue/orange in IntelliJ)
            3. AlphaNumeric (also use _)
            4. Cannot start with a number (usually starts with a letter)
        Conventions: Something we agree to do and play nice
            1. Start with a lowerCase letter
            2. Descriptive
            3. Deal with the no space thing
                a. camelCasingVariableNames
                b. use_underscores_as_spaces
         */

        //the number of siblings you have
        int numSiblings = 4;
        //Do you have a drivers license
        boolean hasLicense = true;
        //your favorite color
        String favColor = "purple";

        /*
        Math Methods

        Square Root
        double root = Math.sqrt(number);

        Exponents
        double answer = Math.pow(base, power)
            2^5 (32) -> Math.pow(2, 5);

        Absolute Value
        numberType positiveAnswer = Math.abs(number);

        Rounding
        int wholeNumber = Math.round(otherNumber);

        Random Numbers
        double result = Math.random();
            your result will be a double between 0 and 1
                0 is Inclusive
                1 is exclusive
            if I want something on the range [a, b)
                Math.random() * (b - a) + a;
         */

        //Range of [-10, 10)

        double randomNumber = Math.random() * (20) - 10;
        System.out.println(randomNumber);

        double subTotal = Math.random() * (40 - 20) + 20;
        double tipPercentage = 0.22;

        double tipAmount = subTotal * tipPercentage;

        double total = subTotal + tipAmount;

        subTotal = Math.round(subTotal * 100) / 100.0;
        tipAmount = Math.round(tipAmount * 100) / 100.0;
        total = Math.round(total * 100) / 100.0;

        System.out.println("Subtotal: \t\t$" + subTotal);
        System.out.println("Tip: \t\t\t$" + tipAmount);
        System.out.println("Final Total: \t$" + total);

        int x = (int) 7.5;

        int a = 6;
        double b = 7; //prints 7.0 because PROMOTION
        //int z = 7.0; //that doesn't fly (possibly lossy conversion)
        int c = 7 / 2;
        double d = 7 / 2; //prints 3.0
        double e = 7.0 / 2; //print 3.5
        int f = (int) (7.0 / 2); //casting (int) forcibly changes the data type
            //causes truncation
                //truncation is a fancy way of saying chop off the decimal (Not round)


        double g = (double) 7 / 2; //3.5
        double h = 7 / (double) 2; //3.5

        final int DAYS_OF_THE_YEAR = 365;
        //daysOfTheYear = 2;
        System.out.println(Math.PI);
        //Math.PI = 3;





    }
}
