public class BooleanBasics {
    public static void main(String[] args) {
        boolean result = 7 > 10;
        System.out.println(result);

        //conditional statement

        //the if statement
        // if (condition is true) {
        //      do something
        // } else {
        //      do something else
        // }


        /*
            the else if
         if (condition1){
            do thing 1
         } else if (condition2){
            do thing 2
         } else if (condition3){
            do thing 3
         } else {
            //the thing we do when nothing else is true
         }
         */

        int number = 17;
        if (number > 0){
            System.out.println(number + " is Positive!");
        } else if (number == 0) {
            System.out.println("You've got ZERO");
        } else {
            System.out.println(number + " is Negative!");
        }

        //EVEN vs ODD
        if (number % 2 == 0){
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }

        if (number > 0){
            System.out.println("positive");
        }
        if (number == 0){
            System.out.println("zero");
        }
        if (number < 0){
            System.out.println("negative");
        }

        if (number >= 90) {
            System.out.println("A");
        }
        if (number >= 80 && number < 90){ // && => AND, both things must be true
            System.out.println("B");
        }
        if (number >= 70 &&  number < 80){
            System.out.println("C");
        }
        if (number < 70){
            System.out.println("F");
        }
        if (number < 0 || number > 100){
            System.out.println("Invalid grade");
        }
    }
}
