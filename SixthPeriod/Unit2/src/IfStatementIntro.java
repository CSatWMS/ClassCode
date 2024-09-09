public class IfStatementIntro {
    public static void main(String[] args) {
        //conditional statements are a way to make decisions

        /*
        if (condition is true){
            do something
        } else if (condition2 is true){
            do thing 2
        } else {
            do something when the condition is false
        }


         */

        int number = 17;
        if (number > 0) {
            System.out.println(number + " is positive!");
        } else if (number == 0){
            System.out.println("You've got ZERO!");
        } else {
            System.out.println(number + " is negative!");
        }

        if (number % 2 == 0){
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }

        //sequential if statements
        int grade = 95;
        if (grade >= 90 && grade <= 100){
            System.out.println("A");
        }
        if (grade >= 80 && grade < 90){
            // && -> AND (Both sides must be true)
            System.out.println("B");
        }
        if (grade >= 70 && grade < 80){
            System.out.println("C");
        }
        if (grade < 70){
            System.out.println("F");
        }

        if (grade < 0 || grade > 100){
            // ||  -> OR (Either side can be true, only ONE needs to be true)
            System.out.println("INVALID GRADE");
        }

        //VS else if statements
        if (grade >= 90){
            System.out.println("A");
        } else if (grade >= 80){
            System.out.println("B");
        } else if (grade >= 70){
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
