package Unit2;

public class BooleanIntro {
    public static void main(String[] args) {
        boolean test = false;

        /*
            Boolean Operators
            >
            <
            >=
            <=
            == "equals equals" (not to be confused with assignment operator =)
            != tests to see if two things are different

            ! not
         */

        boolean greaterThan10 = 15 > 10; //true
        boolean lessThan10 = 10 < 10; //false
        boolean lessThanOrEqTo10 = 10 <= 10; //true
        boolean is10 = 10 == 10; //true
        boolean isNot10 = 5 != 10; //true

        boolean flipped = !is10; // false

        int age = 11;
        boolean canVote = age >= 18;

        /*
        The conditional statement (the if statement)
            if (conditionIsTrue){
                do stuff;
            } else if (condition2){
                //do other stuff
            } else {
                does stuff when the if condition is false
            }
         */

        if (canVote == true){
            System.out.println("Go to the polls!");
        } else {
            System.out.println("Have a couple birthdays");
        }

        if (canVote == true)
        {
            System.out.println("Go to the polls!");
        }
        else
        {
            System.out.println("Have a couple birthdays");
        } //ends the else
        System.out.println(posOrNeg(7));
        System.out.println(posOrNeg(-7));
        System.out.println(posOrNeg(0));

        //combining boolean expression
        //AND (&&)
            //booleanThing1 && booleanTHing2
                //collapses to a single true or false:
                    //if BOTH things are true: the answer is true
                    //if EITHER is false: the answer is false
        //OR (||)
            //only ONE thing has to be true, to result in a single true

        int number = 12;
        if (number > 0 && number %2 == 0){
            System.out.println("Number is positive AND even");
        }

        String relToZero = posOrNeg(number);
        String eo = evenOrOdd(number);

        if (relToZero.equals("positive") && eo.equals("even")){
            System.out.println("Number is positive AND even");
        }

    }//ends my main method

    //GOAL: determine if a number is positive or negative
    static String posOrNeg(int number){
        if (number > 0){
            return "Positive";
        } else if(number == 0) {
            return "ZERO";
        } else {
            return "Negative";
        }
    }

    //GOAL: determine if a number is even or odd
    static String evenOrOdd(int number){
        if (number % 2 == 0){
            return "even";
        } else if (number % 2 == 1){
            return "odd";
        }
        return "should never happen";
    }

}//ends the class/file
