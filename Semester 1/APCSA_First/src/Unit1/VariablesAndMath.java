package Unit1;

public class VariablesAndMath {

    public static void main(String[] args) {
        /*
        Variable Naming Rules and Conventions
        Rules:
            No Spaces
            AlphaNumeric (also _)
            No reserved words
            Cannot start with a number
        Conventions:
            Start with a lowerCase letter
            Descriptive
            Account for the no space thing
                camelCaseForEachWord
                use_underscores_for_spaces
         */

        /*
        Math Methods
        Square Root
        double root = Math.sqrt(value)

        Exponents
        double answer = Math.pow(base, power);
            2^4 => Math.pow(2, 4)
            Do root -> Math.pow(value, .5)

        Rounding
        int answer = Math.round(number);

        AbsoluteValue
        numberType ans = Math.abs(number);

        Random Number
        double randomNumber = Math.random();
            returns a decimal between 0 and 1
                    0 is inclusive
                    1 is exclusive
            If I want number on a range a to b
                Math.random() * (b - a) + a
         */

        //let's make a random number between 20 and 50
        double subTotal = Math.random() * (50 - 20) + 20;
        System.out.println("Subtotal: " + subTotal);

        double tipPercentage = 0.22;

        double tipAmount = subTotal * tipPercentage;

        System.out.println("Tip Amount: " + tipAmount);
        //concatenation (fancy gluing)
        System.out.println("Total: " + (subTotal + tipAmount));
        

        double x = Math.pow(4, 2);
        System.out.println(x);



    }
}
