public class ArrayIntro {
    public static void main(String[] args) {
        double[] favNumbers = {3.14, 6.28, 6.02, 2.72};
        int numElements = favNumbers.length;
        System.out.println(numElements);

        double firstNumber = favNumbers[0];
        double lastNumber = favNumbers[favNumbers.length - 1];

        favNumbers[2] = 6.02 * Math.pow(10, -23);

        System.out.println(favNumbers);
        for (int i = 0; i < favNumbers.length; i++){
            System.out.print(favNumbers[i] + ", ");
        }
        System.out.println();
        System.out.println(sumUp(favNumbers));
        System.out.println(findMax(favNumbers));
        System.out.println(locateMin(favNumbers));
    }

    //GOAL: return the index, or location, of the minimum
    public static int locateMin(double[] arr){
        double min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //GOAL: to return the maximum value of the array
    public static double findMax(double[] arr){
        double max = arr[0]; //NOT JUST ZERO
        for (int i = 1; i < arr.length; i++){
            double currElem = arr[i];
            if (currElem > max){
                max = currElem;
            }
        }
        return max;
    }

    //GOAL: to sum an array
    public static double sumUp(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            double currElement = arr[i];
            sum += currElement;
        }
        return sum;
    }
}
