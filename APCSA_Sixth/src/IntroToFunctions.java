public class IntroToFunctions {

    public static void main(String[] args) {
        int result = multiply(2, 4);
        System.out.println(result);

        System.out.println(multiply(3, 5));

        printProduct(5, 7);

        inquire("Ms. Snyder");

        double cReal = pythag(3, 4);
        System.out.println(cReal);

    } // ends the main method


    //GOAL: solve pythagorean theorem
    static double pythag(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }

    //GOAL: ask how someone is
    static void inquire(String name){
        System.out.println(name + ", how are you?");
    }

    //GOAL: multiply 2 numbers, but then simply print out the result
    static void printProduct(int a, int b){
        System.out.println(a * b);
    }


    //GOAL: Multiply two numbers and return the product
    static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

} // ends the class/file
