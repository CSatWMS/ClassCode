public class FunctionIntro {

    //FUNCTIONS CAN ALSO GO HERE

    public static void main(String[] args) {
        //a function (or a method) is a code segment that performs a purpose
            //have inputs and outputs

        //general function syntax:
            //public (static) returnType methodName(parameters) { }
                //returnType -> the data type of your answer
                //methodName -> a descriptor of what you're doing
                //parameters -> inputs (aka arguments)
                    //dataType variableName, datatype2 variableName2

        int answer = addTogether(4, 5);
        System.out.println(answer);

        String kind = numberType(-5);
        System.out.println(kind);

        System.out.println(numberType(17));

        System.out.println(dayOfWeek("WED"));

    } //this closing curly belongs to main

    public static int daysInMonth(String month){
       // if (month.equals("January") || month.equals("March")) {
        //    return 31;
       // }

        switch (month){
            case "January", "March", "May", "July", "August", "October", "December":
                return 31;
            case "February":
                return 28;
            default:
                return 30;
        }
    }
    

    //FUNCTIONS CAN GO HERE
    //our first GOAL: is to add to numbers together
    public static int addTogether(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    } //ends addTogether

    //GOAL: determine if a number is positive, negative or ZERO
    public static String numberType(int number){
        if (number > 0){
            return "Positive";
        } else if (number < 0){
            return "Negative";
        } else {
            return "ZERO";
        }
    }

    public static int dayOfWeek(String day){
       /* if (day.equals("Sunday") || day.equals("sunday") || day.equals("SUN")){
            return 1;
        } else if (day.equals("Monday") || day.equals("monday") || day.equals("MON")){
            return 2;
        } else if (day == "Tuesday") {
            return -15;
        } else {
            //not continue...
            return 1000;
        }*/

        switch (day){
            case "Sunday", "sunday", "SUN":
                return 1;
            case "Monday", "monday", "MON":
                return 2;
            case "Tuesday", "tuesday", "TUES":
                return 3;
            case "WED":
                return 4;
            case "THURS":
                return 5;
            case "FRI":
                return 6;
            case "SAT":
                return 7;
            default:
                //just like an else
                return -1;
        } //closes my switch
    } //closes my DayOfWeek function

} //belongs to the CLASS
