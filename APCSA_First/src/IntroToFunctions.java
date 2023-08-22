public class IntroToFunctions {
    //functions in java are also methods

    //defining the function
        //returnType methodName(dataType1 Param1, DataType2 param2){ }

    //call the function
        //ususally happens main




    public static void main(String[] args) {
        int product = multiply(2, 3);
        System.out.println(product);

        printProduct(2, 3);

        performGreeting("Ms. Snyder");
        performGreeting("Mr. Kazlow");

        String sentence = createGreeting("Suzie");
        System.out.println(sentence);


        System.out.println(pythag(3, 4));

        System.out.println(circ(2));
    } // ends my main method

    static double circ(double radius){
        double diam = radius * 2;
        double result = Math.PI * diam;
        return result;
    }

    //GOAL: Create a pythagorean solver
    static double pythag(double a, double b){
        double c = Math.sqrt(a*a + Math.pow(b, 2));
        return c;
    }


    //GOAL: Create a greeting String
    static String createGreeting(String name){
        String greeting = "Hello, " + name;
        return greeting;
    }

    //GOAL: greet the person
    static void performGreeting(String name){
        System.out.println("Hello, " + name);
    }

    //this guy will calculate and print the product
    static void printProduct(int a, int b){
        int result = a * b;
        System.out.println(result);
    }


    //this guy calculates the product and returns a value
    static int multiply(int a, int b){
        int result = a *b;
        return result;

        //return a*b; // also works
    }


} //ends the class/file
