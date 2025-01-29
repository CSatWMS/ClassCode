public class Basics {
    public static void main(String[] args) {
        int favNumber = 11;
        printOut(favNumber);
        System.out.println(isEven(favNumber));

        int[] numbers = {11, 17, 12, 3, 8};
        printOut(numbers);

        String str = "Lamp Shade";
        System.out.println(str.length());
        System.out.println(str.substring(0, str.length() / 2));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf("m"));
    }

    public static void printOut(int[] nums){
        //for (init ; condition ; update)
        for (int i = 0; i < nums.length; i++){
            int currValue = nums[i];
            printOut(currValue);
        }
    }

    //GOAL: isEven
        //return true if a number is even, false if its odd
    public static boolean isEven(int number){
        /*if (number % 2 == 0){
            return true;
        } else {
            return false;
        }*/
        return number % 2 == 0;
    }

    public static void printOut(int num){
        System.out.println("My favorite number is: " + num);
        if (isEven(num)){
            System.out.println(" And the number is even!");
        } else {
            System.out.println(" and the number is ODD");
        }
    }

}
