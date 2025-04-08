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
       /* if (a == 0 || b == 0){
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }

        */

        if (a == 0 || b == 0){
            return 0;
        } else {
            return b + multiply(a - 1, b);
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
