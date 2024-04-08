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
        System.out.println(fibonacci(10));
        System.out.println(factorial(10));
        System.out.println(fibonacci(5));
        System.out.println("raceKar: " + isPal("raceKar"));
        System.out.println("woow: " + isPal("woow"));
        System.out.println("tacocat: " + isPal("tacocat"));
        System.out.println("TACOcat: " + isPal("TACOcat"));
        System.out.println("Go Hang a salami, I'm a lasanga hog: " + isPal("Go Hang a salami, I'm a lasanga hog"));
        System.out.println(permutations("feat"));
        printHanoiDirections(4, 1, 3, 2);
    }

    public static void printHanoiDirections(int n, int source, int dest, int limbo){
        if (n == 1){
            System.out.println("Move a disk from " + source + " to " + dest);
        } else {
            printHanoiDirections(n - 1, source, limbo, dest);
            printHanoiDirections(1, source, dest, limbo);
            printHanoiDirections(n - 1, limbo, dest, source);
        }
    }

    public static ArrayList<String> permutations(String str){
        ArrayList<String> toReturn = new ArrayList<String>();
        if (str.length() == 1){
            toReturn.add(str);
            return toReturn;
        } else {
            for (int i = 0; i < str.length(); i++){
                char THELetter = str.charAt(i);
                String theRest = str.substring(0, i) + str.substring( i + 1);
                ArrayList<String> theLittlePerms = permutations(theRest);
                for (String littleGuy : theLittlePerms){
                    toReturn.add(THELetter + littleGuy);
                }
            }
            return toReturn;
        }

    }

    /*
        aGoodNamedFunction(DT uglyData){
            clean the data

            call the recursive helper with clean data

            may do final processing

            return the answer

        }

        aRecursiveHelperFunction(DT onlyGoodData){
            recursive magic
            return an answer
        }


     */

    public static boolean isPal(String str){
        //what do we need to clean up?
            //punctuation
            //case sensitivity
            //spaces
        String onlyGoodStuff = "";
        for (int i = 0; i < str.length(); i++){
            char let = str.charAt(i);
            if (let >= 'a' && let <= 'z'){
                onlyGoodStuff += let;
            } else if (let >= 'A' && let <= 'Z'){
                char lowerLetter = (char) (let + ' ');
                let = (char) (let + ' ');
                onlyGoodStuff += lowerLetter;
            }
        }

        boolean result = isPalHelper(onlyGoodStuff);
        return result;
    }
    //Palindrome problem
        //  raceKar
        //                      tacocat
        //woow
        //Go Hang a salami, I'm a lasanga hog
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


    public static int add(int a, int b){
        return 0;
    }

    public static int multiply(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a , b - 1);
        }
    }

    public static int fibonacci(int n){
        if ( n == 1){
            return 1;
        } else if (n == 0){
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //How many cups are in the tower?
    public static int cupTower(int n){
        if (n == 1){
            return 1;
        } else if (n == 0){
            return 0;
        } else {
            int areaOfTop = cupTower(n - 1); // recursive call
            int myArea = n + areaOfTop;
            return myArea;
        }

    }
}
