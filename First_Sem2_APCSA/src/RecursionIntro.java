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
        System.out.println(factorial(100));
        System.out.println(fibonacci(50));

    }

    public static int add(int a, int b){
        
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
