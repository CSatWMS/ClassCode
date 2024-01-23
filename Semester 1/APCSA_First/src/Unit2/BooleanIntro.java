package Unit2;

public class BooleanIntro {
    public static void main(String[] args) {
        boolean first = true;

        /*
        boolean operators
        > (greater than)
        < (less than)
        >=
        <=

        == (equals equals) (not to be confused with = (the assignment operator))
        != (not equals)

        ! (not)
         */

        int age = 31;
        boolean canVote = age >= 18;

        int birthdate = 31;
        boolean isGoldenBirthday = age == birthdate;

        boolean flipped = !canVote;

        /*
        conditional statements
            if statement
        if (condition is true){
            //do something
        } else if (condition2 is true){
            //do something if condition1 is false, but condition2 is true
        } else {
            //do something when the condition is false
        }

         */

        if (age >= 18){
            System.out.println("GO TO THE POLLS!");
        } else {
            System.out.println("Have a couple birthdays");
        }

        if (age >= 18)
        {
            System.out.println("GO TO THE POLLS!");
        }
        else
        {
            System.out.println("Have a couple birthdays");
        }

        System.out.println(posOrNeg(7));
        System.out.println(posOrNeg(-7));
        System.out.println(posOrNeg(0));

        //combine boolean expressions
        // AND (&&)
            //boolean1 && boolean2
                //results in a single true or false
                //it's true when: BOTH are true
        // OR (||)
            //also results in a single true or false
            //but only ONE has to be true

        boolean isItCold = true;
        boolean isItWindy = true;
        boolean isItRaining = true;

        if (isItRaining || isItCold){
            System.out.println("Wear some boots");
        }
        if (isItRaining && !isItWindy){
            System.out.println("Bring an umbrella");
        }

        int number = 18;
        if (number > 0 && number % 2== 0){
            System.out.println("Positive AND even");
        }



    } //ends the main method

    //GOAL: determine if a number is even or odd
    static String evenOrOdd(int number){
        if (number % 2 == 0){
            return "even";
        } else if (number % 2 == 1){
            return "odd";
        }
        return "dummy return";
    }

    //GOAL: determine if a number is positive or negative
    static String posOrNeg(int number){
        if (number > 0){
            return "positive";
        } else if(number == 0) {
            return "ZERO";
        } else {
            return "negative";
        }
    }

} //ends the class/file
