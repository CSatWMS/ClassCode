public class RecursionIntro {
    public static void main(String[] args) {
        /*
        Pillars of Recursion
        1. Base Case / Terminating Condition
        2. Approach that base case
        3. Make a recursive call
         */

        System.out.println(cupTower(4));
        System.out.println(fib(9));
        //System.out.println(fib(-2)); STACK OVERFLOW ERROR
    }

    public static int mult(int a, int b){

    }


    public static int fib(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib( n - 1) + fib ( n - 2) ;
        }
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static int cupTower(int n){
        //n is the size of the bottom
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            int areaOfTheTop = cupTower(n - 1);
            int MYArea = n + areaOfTheTop;
            return MYArea;
        }
    }

}
