import java.util.ArrayList;

public class RecursionBasics {
    public static void main(String[] args) {
        //Pillars of Recursion
            //I. Have a base case
            //II. Approach the base case
            //III. Make a recursive call
        System.out.println(areaOfTriangle(4));
        System.out.println(areaOfTriangle(104));
        System.out.println(factorial(4));
        //System.out.println(factorial(24)); Integer Overflow
        System.out.println(fib(7));
        System.out.println(fib(35));
        //System.out.println(fib(104));
        //System.out.println(fib(47)); takes forever
        System.out.println(multiply(3, 5));
        System.out.println(add(4, 6));

        //return b + multiply(a - 1, b);
        System.out.println(multiply(3, 5));
        System.out.println(multiply(3, -5));
        System.out.println(multiply(-3, 5));
        System.out.println(multiply(-3, -5));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("racekar"));
        System.out.println(isPalindrome("racecat"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(getPermutations("t"));
        System.out.println(getPermutations("at"));
        System.out.println(getPermutations("eat"));
        System.out.println(getPermutations("seat"));
        System.out.println(getPermutations("westmins"));
        solveTOH(3, 1, 3, 2);
    }

    public static void solveTOH(int numDisks, int start, int dest, int extra){
        if (numDisks == 1){
            System.out.println("Move 1 disk from " + start + " to " + dest);
            return;
        }
        solveTOH(numDisks - 1, start, extra, dest);
        solveTOH(1, start, dest, extra);
        solveTOH(numDisks - 1, extra, dest, start);
    }

    public static ArrayList<String> getPermutations(String str){
        ArrayList<String> toReturn = new ArrayList<String>();
        if (str.length() == 1){
            toReturn.add(str);
            return toReturn;
        }
        for (int i = 0; i < str.length(); i++){
            char startingLetter = str.charAt(i);
            String otherLetters = str.substring(0, i) + str.substring(i + 1);
            ArrayList<String> miniPerms = getPermutations(otherLetters);
            for (String perm : miniPerms){
                toReturn.add(startingLetter + perm);
            }
        }
        return toReturn;
    }

    public static boolean isPalindrome(String str){
        //spaces
        //punctuation
        //capitalization
        str = str.toLowerCase();
        //basket
        String onlyLetters = "";
        //loop
        for (int i = 0; i < str.length(); i++) {
            //keep everything that's a letter //isAlphabetic
            //character == 'a' -> character == 97
            //character >= 'a' && character <= 'z'
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                onlyLetters += c;
            }
        }
        return rec_isPalindrome(onlyLetters);
    }


    public static boolean rec_isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return rec_isPalindrome(str.substring(1, str.length() - 1));
    }

    public static int add(int a, int b){
        // NO! return a + b;
        if (a == 0){
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return 1 + add(a - 1, b); // 1 + add(a, b - 1); // 2 + add( a - 1, b - 1)
        }
    }

    public static int multiply(int a, int b){
        if (a > 0 && b > 0){
            return rec_multiply(a, b);
        } else if (a < 0){
            return -rec_multiply(-a, b);
        } else {
            return rec_multiply(a, b);
        }
    }

    public static int rec_multiply(int a, int b){
       /* if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }
        */
        if (a == 0 || b == 0){
            return 0;
        } else {
            return b + rec_multiply(a - 1, b);
        }

    }

    public static int fib(int n){
        //base case
        if (n == 0){
            return 1;
        } else if (n == 1){
            return 1;
        }
        //recursive call
        return fib(n-1) + fib(n - 2);
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    //area of a triangle with a known length
    public static int areaOfTriangle(int length){
        //base case
        if (length == 1){
            return 1;
        }
        //recursive call
        int smallerArea = areaOfTriangle(length - 1);
        return smallerArea + length;
    }
}
