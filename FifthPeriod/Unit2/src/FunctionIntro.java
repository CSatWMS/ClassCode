public class FunctionIntro {
    //function == method
        //a chunk of code that performs a purpose (has inputs and outputs)

    //FUNCTIONS CAN ALSO GO HERE

    public static void main(String[] args) {

        //function syntax:

        /*
        public (static) returnType methodName(parameters) {

        }
            returnType -> the data type of your answer
            methodName -> description of what youre doing
            parameters -> inputs to the function
                dataType varName, dataType2 varName2, etc
         */

        //function CALLS:
        int answer = addTogether(3, 5);
        System.out.println(answer);

        int answer2 = addTogether(6, 1);
        System.out.println(answer2);

        double hypotenuse = pythag(3, 4);
        System.out.println(hypotenuse);

        System.out.println(pythag(3, 4));
        System.out.println(isEven(4));
        System.out.println(isEven(5));

    } //ends the main method

    //return true if your number is even, false if it is odd
    //called isEven
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //goal: is to determine if a number is pos, neg, or zero
    public static String numberType(int number){
        if (number > 0){
            return "Positive";
        } else if (number < 0){
            return "Negative";
        } else /* if (number == 0) */ {
            return "Zero";
        }

        // dummy return statement
        // return "should never happen";
    } //closes the function

    //solve the pythagorean theorem
    public static double pythag(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }


    //FUNCTIONS CAN GO DOWN HERE

    //GOAL: add two numbers together
    public static int addTogether(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

} //ends the class
