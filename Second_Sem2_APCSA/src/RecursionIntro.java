import java.util.ArrayList;

public class RecursionIntro {
    public static void main(String[] args) {
        /*
        Pillars of Recursion
        I. Have a base case / terminating condition
        II. Approach that base case
        III. Make a recursive call
         */

        System.out.println(cupTower(4));
        System.out.println(factorial(4));
        System.out.println(fib(9));
        System.out.println("raceKar: " + isPal("raceKar"));
        System.out.println("racecar: " + isPal("racecar"));
        System.out.println("tacocat: " + isPal("tacocat"));
        System.out.println("never odd or even: " + isPal("never odd or even"));
        System.out.println(permutations("feat"));
        printTOHSteps(3, 1, 3, 2);
    }

    public static void printTOHSteps(int n, int source, int dest, int aux){
        if ( n == 1){
            System.out.println("Move one disk from " + source + " to " + dest);
        } else {
            printTOHSteps(n - 1, source, aux, dest);
            printTOHSteps(1, source, dest, aux);
            printTOHSteps(n - 1, aux, dest, source);
        }
    }

    public static ArrayList<String> permutations(String str){
        ArrayList<String> toReturn = new ArrayList<String>();
        if (str.length() == 1){
            toReturn.add(str);
            return toReturn;
        } else {
            for (int i = 0; i < str.length(); i++){
                char fancyGuy = str.charAt(i);
                String theRestOfIt = str.substring(0, i) + str.substring(i + 1);
                ArrayList<String> ALLThePermutations = permutations(theRestOfIt);
                for (String individualPerm : ALLThePermutations){
                    toReturn.add(fancyGuy + individualPerm);
                }
            }
            return toReturn;
        }
    }

    /*
        aGoodNamedFunction(DT uglyData){
            clean the data

            make a call to the recursive helper

            can post-process the answer

            return the final answer
        }

        aRecursiveHelperFunction(DT cleanGoodData){
            do his recursive magic
            return an answer
        }

     */

    //Palindrome
        //raceKar
                //          tacocat
        //woow
        //never odd or even
        //go hang a salami, I'm a lasagna hog

    public static boolean isPal(String str){
        //clean the data
            //capitalization
            //spaces
            //punctuation
        String onlyGoodStuff = "";
        for (int i =0 ; i < str.length(); i++){
            char let = str.charAt(i);
            if (let >= 'a' && let <= 'z'){
                onlyGoodStuff += let;
            } else if (let >= 'A' && let <= 'Z'){
                char lowerVersion = (char) (let + ' ');
                onlyGoodStuff += lowerVersion;
            }
        }
        boolean result = isPalHelper(onlyGoodStuff);
        return result;
    }

    public static boolean isPalHelper(String str){
        if (str.length() <= 1){
            return true;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (first != last){
                return false;
            } else {
                //here, first == last
                return isPalHelper(str.substring(1, str.length() - 1));
            }
        }
    }


    public static int add(int a, int b){
        return -1;
    }


    public static int multiply(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a , b - 1);
        }
    }


    public static int fib(int n){
        if (n == 0){
            return 0;
        } else if ( n == 1){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //How many cups are in my tower?
    public static int cupTower(int n){
        if (n == 1){
            return 1;
        } else {
            int areaOfTheTop = cupTower(n - 1);
            int myArea = n + areaOfTheTop;
            return myArea;
        }
    }

}
