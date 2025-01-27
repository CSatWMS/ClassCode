public class Basics {
    public static void main(String[] args) {
        int favNumber = 11;
        printOut(favNumber);
        System.out.println(isEven(favNumber));

        int[] nums = {11, 17, 3, 6, 8};
        printOut(nums);

        String str = "First Day!";
        System.out.println(str.length());
        System.out.println(str.length() / 2);
        System.out.println(str.substring(0, str.length() / 2));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf(" "));
    }

    public static void printOut(int[] nums){
        for (int i = 0; i < nums.length; i++){
            printOut(nums[i]);
        }
    }

    public static void printOut(int number){
        System.out.println("My favorite number is: " + number);
        if (isEven(number)){
            System.out.println("And its even!");
        } else {
            System.out.println("And it's odd!");
        }
    }

    //GOAL: IsEven
        //return true if the number is even, false if it's odd
    public static boolean isEven(int number){
        /*if (number % 2 == 0){
            return true;
        } else {
            return false;
        }*/
        return number%2 == 0;
    }

}
