package Unit4;

public class LoopingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 8, 2, 1, 3};

        printArray(numbers);
        System.out.println("Total: " + sumUp(numbers));

        System.out.println("Average: " + sumUp(numbers) / numbers.length);
        System.out.println("Maximum: " + findMax(numbers));
    }

    //GOAL: find the biggest number (the maximum)
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            int currElem = arr[i];
            if (currElem > max){
                max = currElem;
            }
        }
        return max;
    }

    //GOAL: write a function that SUMS an array
        //arr[0] + arr[1] + arr[2] + etc
        //use a loop + a basket
    public static int sumUp(int[] arr){
        int sumBasket = 0;
        for (int i = 0; i < arr.length; i++){
            int currElement = arr[i];
            sumBasket = sumBasket + currElement;

            //sumBasket += arr[i];
        }
        return sumBasket;
    }

    //GOAL: write a function that prints an array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

}
