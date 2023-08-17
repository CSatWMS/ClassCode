public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Ms. Snyd\\er");

        System.out.println(306);

        System.out.println(306 + 2);

        System.out.println(306 - 2);

        System.out.println(306 * 2);

        System.out.println(306 / 2);
        System.out.println(307 / 2);
        //^ this is integer division

        System.out.println(307.0 / 2);
        System.out.println(307 / 2.0);
        //numbers with decimals are floats or doubles

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Q: Variables
        //A variable is  way to remember something in code
        int numStudents = 17;
        System.out.println(numStudents);
        System.out.println("numStudents");
        System.out.println(numStudents + 1);
        //update a variable
        numStudents = numStudents + 1;

        //assignment operator (=)
        System.out.println(numStudents);

        double gpa = 97.3;
        System.out.println("My GPA is: " + gpa); //concatenation

        String myName = "Ms. Snyder";
        System.out.println("My name is " + myName);

        char firstInitial = 'C'; //chars are single letters
        boolean hasDogs = true; //booleans are only true or false
        //Required to know: int, double, char, boolean (and String)
        //Other primitive types: short, long, byte, float

        //primitive data types are reserved words

        //int int = 3; NO!

        int length = 3;
        int width = 5;
        int area = length * width;
        int perimeter = 2 * length + 2 * width;
        System.out.println("The area is : " + area);
        System.out.println("THe perimeter is: " + perimeter);

        double root = Math.sqrt(49);
        System.out.println(root);

        double a = 3.0;
        double b = 4.0;
        double aSquared = a * a;
        double underRoot = aSquared + b*b;
        double c = Math.sqrt(underRoot);
        System.out.println(c);

        //Solve quadratic equation (A = 1, B = -2, C = -15)

    }
}