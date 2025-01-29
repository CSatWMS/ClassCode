public class Basics {
    public static void main(String[] args) {
        int favNum = 11;
        printOut(favNum);
        System.out.println(isEven(favNum));

        int[] nums = {11, 17, 12, 6, 3};
        printOut(nums);

        String str = "Water Bottle";
        System.out.println(str.length());
        System.out.println(str.substring(0, str.length() / 2));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf("B"));
    }

    public static void printOut(int[] arr){
        for (int currNum : arr){
            //currNum vs arr[currNum]
            printOut(currNum);
        }
    }

    //GOAL: isEven
        //return true if the number is even, false if its odd
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
            System.out.println("And it's even!");
        } else {
            System.out.println("And it's odd!");
        }
    }
}
