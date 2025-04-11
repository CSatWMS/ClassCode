import java.util.ArrayList;

public class RecursionBasics {
    public static void main(String[] args) {
        //Pillars of Recursion
            //I. Base Case
            //II. Approach the Base Case
            //III. Make a recursive Call

        System.out.println(areaOfTriangle(4));
        System.out.println(areaOfTriangle(104));
        System.out.println(factorial(4));
        System.out.println(fib(8));
        //System.out.println(fib(46));
        System.out.println(multiply(3, 5));
        System.out.println(add(4, 6));

        System.out.println(multiply(3, 5));
        System.out.println(multiply(3, -5));
        System.out.println(multiply(-3, 5));
        System.out.println(multiply(-3, -5));
        //return b + multiply(a-1, b);
        System.out.println(isPalindrome("tacocat"));
        System.out.println(isPalindrome("tacocar"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(getPerms("t"));
        System.out.println(getPerms("at"));
        System.out.println(getPerms("eat"));
        System.out.println(getPerms("seat"));
        solveTOH(3, 1, 3, 2);

    }

    public static void solveTOH(int numDisks, int start, int dest, int temp){
        if (numDisks == 1){
            System.out.println("Move 1 disk from " + start + " to " + dest);
            return;
        }
        solveTOH(numDisks - 1, start, temp, dest);
        solveTOH(1, start, dest, temp);
        solveTOH(numDisks - 1, temp, dest, start);
    }

    public static ArrayList<String> getPerms(String str){
        ArrayList<String> toReturn = new ArrayList<String>();
        if (str.length() <= 1){
            toReturn.add(str);
            return toReturn;
        }
        for (int i = 0; i < str.length(); i++){
            char startingLetter = str.charAt(i);
            String otherLetters = str.substring(0, i) + str.substring(i + 1);
            ArrayList<String> miniPerms = getPerms(otherLetters);
            for (String perm : miniPerms){
                toReturn.add(startingLetter + perm);
            }
        }
        return toReturn;
    }

    public static boolean isPalindrome(String str){
        //capitalization
        //punctuation
        //spaces
        str = str.toLowerCase();
        //basket
        String goodguys = "";
        //loop over it
        for (int i = 0; i < str.length(); i++) {
            //delete the bad guys -> keep the good guys
            //the good guys are lowercase letters only
            //character == 'a'
            //character >= 'a' && character <= 'z'
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                goodguys += c;
            }
        }
        return rec_isPalindrome(goodguys);
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
        } else if (b == 0){
            return a;
        } else {
            return 1 + add(a, b - 1);
        }
    }

    public static int multiply(int a, int b){
        if (a < 0){
            return -rec_multiply(-a, b);
        }
        return rec_multiply(a, b);
    }

    public static int rec_multiply(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        } else {
            return b + rec_multiply(a-1, b);
        }

        /*
        if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }
         */
    }

    public static int fib(int n){
        if (n == 1){
            return 1;
        } else if (n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int factorial(int n){
        if (n == 1){
            return n;
        }
        return n * factorial(n - 1);
    }

    //area of a triangle with a known base length
    public static int areaOfTriangle(int baseLength){
        //base case
        if (baseLength == 1){
            return 1;
        } else if (baseLength == 0){
            return 0;
        }
        //recursive call
        int smallerArea = areaOfTriangle(baseLength - 1);
        return smallerArea + baseLength;
        //return baseLength + areaOfTriangle(baseLength - 1);
    }
}
