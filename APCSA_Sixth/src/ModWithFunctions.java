public class ModWithFunctions {

    public static void main(String[] args) {
        System.out.println(-2 % 10);
        changeCalculator(23.33, 100);
    }

    //MathMaster
        //sum, product, remainder, exponent for numbers
            //you are not allowed to arithmetic in MathMaster
    static void mathMaster(int a, int b){
        //if a = 3, b = 4;

        int addedTogether = sum(a, b);
        System.out.println(a + " + " + b + " = " + addedTogether);
        //3 + 4 = 7
        //3 * 4 = 12
    }

    static int sum(int a, int b){
        return a + b;
    }




    //GOAL: given cost, and amtTendered, we want to give back some change
        //calc num20s, 10, 5s, 1s

    static void changeCalculator(double cost, double amtTendered){
        //calculate the amount of change (79)
        double amtOfChange = amtTendered - cost;
       //System.out.println("Initial Change: " + amtOfChange);
        //calculate the number of 20s
        int num20s = (int) (amtOfChange / 20);
        System.out.println("20s: " + num20s);
            //divide by 20, cast it to an int
        // account for the given 20s
        amtOfChange = amtOfChange % 20;
       // System.out.println("leftovers: " + amtOfChange);
            //mod by 20
        //calculate the number of 10s

        int num10s = (int) (amtOfChange / 10);
        System.out.println("10s: " + num10s);

        amtOfChange = amtOfChange % 10;

        int num5s = (int) (amtOfChange / 5);
        System.out.println("5s: " + num5s);
        amtOfChange %= 5;

        int num1s = (int) (amtOfChange);
        System.out.println("1s: " + num1s);

        amtOfChange %= 1;

        System.out.println(amtOfChange);

        amtOfChange *= 100;
        int numQuarters = (int) (amtOfChange / 25);
        amtOfChange %= 25;
        int numDimes = (int) (amtOfChange / 10);
        amtOfChange %= 10;
        int numNickels = (int) (amtOfChange / 5);
        amtOfChange %= 5;
        int numPennies = (int) (Math.round(amtOfChange));
        System.out.println("Qs: " + numQuarters);
        System.out.println("Ds: " + numDimes);
        System.out.println("Ns: " + numNickels);
        System.out.println("Ps: " + numPennies);

    }
}
