public class IfStatementIntro {
    public static void main(String[] args) {

        //Conditional Statements
            //Decisions in our code

        int number = 17;

        /*
        if (condition is true){
            //do something
        } else if (condition2){
            //do something when condition2 is true
        } else {
            //what we do when the condition is false
        }

         */

        if (number > 0){
            System.out.println(number + " is Positive!");
        } else if (number == 0){
            System.out.println("You got ZERO");
        } else {
            System.out.println(number + " is negative :(");
        }

        if (number % 2 == 1){
            System.out.println(number + " is ODD");
        } else {
            System.out.println(number + " is EVEN");
        }

        //Sequential If Statements
        int grade = 95;
        if (grade >= 90){
            System.out.println("A");
        }
        if (grade >= 80  &&  grade < 90){
            //&& -> AND (both sides have to be true)
            System.out.println("B");
        }
        if (grade >= 70 && grade < 80){
            System.out.println("C");
        }
        if (grade < 70){
            System.out.println("F");
        }

        //Invalid grade is negative or above 100
            // || -> OR (Either side is true)
        if (grade < 0 || grade > 100){
            System.out.println("INVALID Grade");
        }

        //VS ELse If Statements
        if (grade >= 90){
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70){
            System.out.println("C");
        } else {
            System.out.println("F");
        }


    }
}
