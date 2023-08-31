public class BooleanIntro {

    public static void main(String[] args) {
        boolean first = true;

        boolean bigger = 10 > 5;
        /*
        boolean operators
        >
        <
        >=
        <=
        == (not single =)
        !=
        ! (not)
         */

        int age = 31;
        boolean canVote = age >= 18; //true
        boolean isSeniorCitizen = age >= 65; // false
        int birthDate = 31;

        boolean isGoldenBirthday = age == birthDate;

        boolean isNot100 = age != 100;

        boolean flipped = !isGoldenBirthday;
        //!true -> false
        //!false -> true

        //The conditional statement
        /*
        if (condition){
            //this code only executes if my condition is true
        } else if (condition2){
            //this code executes when condition1 is false, but condition2 is true
        } else {
            //this happens if my condition is false
        }
         */

        if (canVote == true){
            System.out.println("GO TO THE POLLS!");
        } else {
            System.out.println("Wait a couple years...");
        }

        if (canVote == true)
        {
            System.out.println("GO to the polls");
        }
        else
        {
            System.out.println("Wait a couple years");
        }

        System.out.println(posOrNeg(7));
        System.out.println(posOrNeg(-7));
        System.out.println(posOrNeg(0));

        //combine boolean statements
            //AND -> &&
                //booleanExpr1 && booleanExpr2
                    //results in a true only if BOTH are true
            //OR -> ||
                    //results in a true as long as ONE is true

        boolean isRaining = true;
        boolean isItCold = true;
        boolean isItWindy = false;

        //when do I wear a jacket?
        if (isItCold || isRaining){ //
            System.out.println("Wear a jacket");
        }

        if (isRaining && !isItWindy){
            System.out.println("Need umbrella");
        }

    } // ends my main method

    //GOAL: given a number, tell me if it's positive or negative
    static String posOrNeg(int number){
        if (number > 0){
            return "Positive";
        } else if (number == 0) {
            return "ZERO";
        } else {
            return "Negative";
        } //ends the else
    } //ends the method

    static String evenOrOdd(int number){
        if (number % 2 == 0){
            return "even";
        }else if (number % 2 == 1){
            return "odd";
        }

        return "Should never happen";
    }

} //ends my class
