import java.util.ArrayList;

public class RecursionBasics {
    public static void main(String[] args) {
        //Pillars Of Recursion
            //I. Have a base case
            //II. Approach that base case
            //III. Make a recursive call
        System.out.println(factorial(4));
        System.out.println(factorial(200));
        //System.out.println(factorial(23)); Integer Overflow
        //System.out.println(factorial(-3)); Stack overflow error
        //System.out.println(fib(46));

        //   return a + multiply(a, b - 1);
        System.out.println(multiply(3, 5));
        System.out.println(multiply(-3, 5));
        System.out.println(multiply(3, -5));
        System.out.println(multiply(-3, -5));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("racecat"));
        System.out.println(isPalindrome("racekar"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(getPermutations("eat"));
        System.out.println(getPermutations("seat"));
    }

    public static ArrayList<String> getPermutations(String str){
        if (str.length() == 1){
            ArrayList<String> toReturn = new ArrayList<String>();
            toReturn.add(str);
            return toReturn;
        } else {
            ArrayList<String> toReturn = new ArrayList<String>();
            for (int i = 0; i < str.length(); i++){
                char currentLetter = str.charAt(i);
                String otherGuys = str.substring(0, i) + str.substring(i + 1);
                ArrayList<String> miniPerms = getPermutations(otherGuys);
                for (String guy : miniPerms){
                    toReturn.add(currentLetter + guy);
                }
            }
            return toReturn;
        }
    }

    public static boolean isPalindrome(String str){
        //all the same case (.toLowerCase() and .toUpperCase())
        //want no spaces (str.charAt(i) != ' ')
        //no punctuation (Character.isAlphabetic()
            //char >= 'a' && char <= 'z'
        str = str.toLowerCase();
        String goodGuy = "";
        //loop
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                goodGuy += c;
            }
        }
        return isPalindrome_rec(goodGuy);

    }

    public static boolean isPalindrome_rec(String str){
        if (str.length() <= 1){
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return isPalindrome_rec(str.substring(1, str.length() - 1));

    }


    public static int add(int a, int b){
        // NO! return a + b;
        if (a == 0){
            return b;
        } else if (b == 0){
            return a;
        } else {
            return 1 + add(a - 1, b); //1 + add(a, b - 1) // 2 + add(a-1, b-1);
            //return a + add(0, b)
        }
    }

    public static int multiply(int a, int b){
        if (a > 0 && b > 0){
            return rec_multiply(a, b);
        } else if (a < 0 && b < 0){
            return rec_multiply(-a, -b);
        } else if (b < 0){
            return -rec_multiply(a, -b);
        } else {
            return rec_multiply(a, b);
        }
    }

    public static int rec_multiply(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a + rec_multiply(a, b - 1);
        //return b + multiple(a - 1, b);
    }

    public static int fib(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //Factorial problem -> 4! = 4 * 3!
    public static int factorial(int n){
        //base case
        if (n == 1){
            return 1;
        }
        //recursive call
        return n * factorial(n - 1);
    }

}
