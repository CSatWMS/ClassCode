public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(1992);

        System.out.println("M\\s. Snyder");
        System.out.print("Westminster");
        System.out.print("Schools");
        System.out.println("hooray");
        System.out.println("awesome");

        System.out.println(306);

        System.out.println(306 + 5);
        System.out.println(306 - 5);
        System.out.println(306 * 2);
        System.out.println(306 / 2);
        System.out.println(307 / 2);
        //^ this is integer division

        System.out.println(307.0 / 2);
        System.out.println(307 / 2.0);
        /*
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        */

        //Variables are a way we can remember things in code

        // dataType variableName = value
        int numStudents  = 15;
        // = is actually the assignment operator

        double gpa = 97.2;
        System.out.println(numStudents);
        System.out.println(numStudents + 1);

        //updating variables:
        numStudents = numStudents + 1;
        System.out.println("numStudents");

        System.out.println("My gpa is: " + gpa); //concatenation

        char firstInitial = 'C'; //only single letters for char
        boolean hasDogs = true; //boolean can only be true or false
        //true and false are reserved words

       // int int = 7; NO!

        String myName = "Ms. Snyder";
        //primitive types (Super basic)
        //reference types (can do special ability things)

        //data types MUST KNOW: int, double, char, boolean (also String)
        //Other primitive types: float, short, long, byte

        int length = 5;
        int width = 3;

        int area = length * width;
        int perimeter = 2*length + 2*width;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        double root = Math.sqrt(49);
        System.out.println(root);

        //^ is not for exponents (bitwise XOR)
        double a = 3;
        double b = 4;
        double aSquared = a*a;
        double underRoot = aSquared + b*b;
        double c = Math.sqrt(underRoot);

        //solve the quadratic equation:
        int A = 2;
        int B = -1;
        int C = -15;




    }
}