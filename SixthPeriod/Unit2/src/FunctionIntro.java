public class FunctionIntro {

        //functions are a chunk of code that serve a purpose
            //typically have inputs and outputs

    //FUNCTIONS CAN ALSO GO HERE

    public static void main(String[] args) {

        //function header syntax
        /*
        public (static) returnType methodName(parameters) {

        }
            returnType -> the datatype of your answer
            methodName -> a descriptor of what you're doing
            parameters -> the inputs to your function
                dataType varName, dataType2 varName2, etc
         */

        int answer = addTogether(3, 5);
        System.out.println(answer);
        int answer2 = addTogether(145, 692);
        System.out.println(answer2);

        String result = numberType(-5);
        System.out.println(result);
        System.out.println(numberType(0));
        System.out.println(isEven(5));
        System.out.println(isEven(4));
    } //ends the main method

    //GOAL: determine if a number is even or not
        //return true or false, depending
        //call your function isEven
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //GOAL: determine if a number is positive, negative, or ZERO
    public static String numberType(int number){
        if (number > 0){
            return "Positive";
        } else if (number < 0){
            return "Negative";
        } else { //if (number == 0){
            return "ZERO";
        }

        //dummy return statement
        //return "non-number";
    }//end the function

    //FUNCTIONS CAN GO HERE
    //GOAL: to add two numbers together
    public static int addTogether(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

} // ends the class
