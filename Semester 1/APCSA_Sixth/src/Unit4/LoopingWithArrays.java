package Unit4;

public class LoopingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 8, 2, 1, 3};

        printArray(numbers);
        System.out.println("Total: " + sumUp(numbers));
        System.out.println("Average: " + sumUp(numbers) / numbers.length);
        System.out.println("Maximum: " + findMax(numbers));
    }

    //GOAL: Find  the biggest (maximum) value in the array
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            int currEl = arr[i];
            if (currEl > max){
                max = currEl;
            }
        }
        return max;
    }

    //GOAL: I want to sum the contents of my array
        //add up the total values
        //use a basket/bucket!
    public static int sumUp(int[] arr){
        int sumBasket = 0;
        for (int i = 0; i < arr.length; i++){
            int currElement = arr[i];
            sumBasket = sumBasket + currElement;

            //sumBasket += arr[i];
        }
        return sumBasket;
    }

    //GOAL: Print out the array on one line
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);

        /*
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i));
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

         */
    }

}
