package Unit1;

public class IntroToFunctions {
    //functions in java are also called methods

    public static void main(String[] args) {
        int answer = multiply(2, 4);
        System.out.println(answer);

        printProduct(3, 5);
        printProduct(4, 6);

        greet("Lauren");

        String greeting = createGreeting("Ms. Snyder");
        System.out.println(greeting);
        
        pythagPrint(3, 4);
        System.out.println(pythagCalc(3, 4));
    } // ends main method

    //pythagorean revisiting
    //GOAL: print out the hypotenuse
    static void pythagPrint(double a, double b){
        System.out.println(Math.sqrt(a*a + b*b));
    }

    //GOAL: Calculate and return the hypotenuse
    static double pythagCalc(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }

    static String createGreeting(String name){
        String greeting = "What's up, " + name;
        return greeting;
    }

    static void greet(String name){
        System.out.println("What's up, " + name);
    }

    //GOAL: print out the product of two numbers
    static void printProduct(int num1, int num2){
        int product = num1 * num2;
        System.out.println(product);
    }

    static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

} //ends the class/file
