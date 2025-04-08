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
        System.out.println(fib(46));
        System.out.println(multiply(3, 5));
        System.out.println(add(4, 6));
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
        if (a == 0 || b == 0){
            return 0;
        } else {
            return b + multiply(a-1, b);
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
