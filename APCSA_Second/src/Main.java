public class Main {
    public static void main(String[] args) {
        System.out.println("\\Hello world!");
        System.out.println("Ms. Snyder");

        System.out.println(1992);

        System.out.println(306 + 5);
        System.out.println(306 - 5);
        System.out.println(306 * 2);
        System.out.println(306 / 2);
        System.out.println(307 / 2);
        //^ is called integer division
        //an integer is a whole number (int)

        System.out.println(307.0 / 2);
        System.out.println(307 / 2.0);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //queue: variables
        //A variable is a way for us to remember stuff in code

        //dataType variableName = value;
        int numStudents = 13;
        // = is the assignment operator

        System.out.println(numStudents);
        System.out.println("numStudents");

        double gpa = 97.2;
        System.out.println(gpa);

        String myName = "Ms. Snyder";

        char firstInitial = 'C'; //single letter only
        boolean hasDogs = true; //true or false only
        //reserved words are special java words
            //cannot be variable names
       // int int = 7; NO!

        //NEED to know: int, double, char, boolean (and String)
        //other primitive types: float, short, long, byte

        System.out.println("My gpa is: " + gpa); //concatenation
        System.out.println("My name is " + myName);

        int length = 3;
        int width = 5;
        int area = length * width;
        int perimeter = length * 2 + width * 2;

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

        //2 ^ 4 (that's not exponents -> the bitwise XOR)
        double root = Math.sqrt(49);
        System.out.println(root);

        double a = 3;
        double b = 4;
        double aSquared = a * a;
        double underRoot = aSquared + b * b;
        double c = Math.sqrt(underRoot);

        double c2 = Math.sqrt(a*a + b*b);

        double A = 2;
        double B = 1;
        double C = -15;
        double det = B*B - 4*A*C;
        double topPos = -B + Math.sqrt(det);
        double topNeg = -B - Math.sqrt(det);

        double ans1 = topPos / (2 * A);
        double ans2 = topNeg / (2*A);

        System.out.println("(" + ans1 + ", " + ans2 + ")");




    }
}