import java.util.ArrayList;

public class RecursionIntro {
    public static void main(String[] args) {
        /*
        Pillars of Recursion:
        I. Have a base case / terminating condition
        II. Approach the base case
        III. Make a recursive Call
         */
        System.out.println(cupTower(4));
        System.out.println(fib(8));
        System.out.println("racekar: " + isPal("racekar"));
        System.out.println("tacocat: " + isPal("tacocat"));
        System.out.println("woow: " + isPal("woow"));
        System.out.println("Go Hang a salami I'm a Lasagna hog: " + isPal("Go Hang a salami I'm a Lasagna hog"));
        System.out.println(permutations("feat"));
        printTOHSolution(4, 1, 3, 2);

    }

    public static void printTOHSolution(int n, int source, int destination, int aux){
        if (n == 1){
            System.out.println("Move from " + source + " to " + destination);
        } else {
            printTOHSolution(n-1, source, aux, destination);
            printTOHSolution(1, source, destination, aux);
            printTOHSolution(n - 1, aux, destination, source);
        }
    }

    public static ArrayList<String> permutations(String str){
        ArrayList<String> toReturn = new ArrayList<String>();
        if (str.length() == 1){
            toReturn.add(str);
            return toReturn;
        } else {
            for (int i = 0; i < str.length(); i++){
                char fancyLetter = str.charAt(i);
                String theRest = str.substring(0, i) + str.substring(i + 1);
                ArrayList<String> miniPerms = permutations(theRest);
                for (String miniGuy : miniPerms){
                    toReturn.add(fancyLetter + miniGuy);
                }
            }
            return toReturn;
        }
    }


    /*
        aGoodNamedFunction(DT messyParameter){
            clean the data

            make a call to the recursive helper function

            it may manipulate the answer before it gets returned

        }

        aRecursiveHelperFunction(DT OnlyCleanData){
            does the recursive magic
        }

     */

    public static boolean isPal(String str){
        //cleaning the data
            //no spaces
            //no punctuation
            //no upper case letters
        String onlyGoodStuff = "";
        for (int i = 0; i < str.length(); i++){
            char let = str.charAt(i);
            if (let >= 'a' && let <= 'z'){
                onlyGoodStuff += let;
            } else if (let >= 'A' && let <= 'Z'){
                onlyGoodStuff += (char)(let + ' ');
            }
        }
        boolean result = isPalHelper(onlyGoodStuff);
        return result;
    }


    //Palindrome -> woow
        //tacocat
        //racekar
        //Go Hang a salami I'm a Lasagna hog
        //Madam I'm Adam
    public static boolean isPalHelper(String str){
        if (str.length() <= 1){
            return true;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (first != last){
                return false;
            } else {
                return isPalHelper(str.substring(1, str.length() - 1));
            }
        }
    }

    public static int multiply(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }
    }

    public static int fib(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib (n- 1)+ fib(n - 2);
        }
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static int cupTower(int n){
        if (n == 1) {
            return 1;
        } else {
            int topPart = cupTower(n - 1);
            int myArea = n + topPart;
            return myArea;
        }
    }

}
