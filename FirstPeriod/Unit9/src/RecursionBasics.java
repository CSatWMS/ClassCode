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
        System.out.println(fib(46));
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
        if (a == 0 || b == 0){
            return 0;
        }
        return a + multiply(a, b - 1);
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
