public class ArrayIntro {
    public static void main(String[] args) {
        double[] favNumbers = {3.14, 6.28, 6.02, 2.72};
        int numElements = favNumbers.length;
        System.out.println(numElements);

        double firstNumber = favNumbers[0];
        double lastNumber = favNumbers[favNumbers.length - 1];
        favNumbers[2] = Math.pow(10, -23) * 6.02;
        System.out.println(favNumbers);

        for (int i = 0; i < favNumbers.length; i++){
            System.out.print(favNumbers[i] + ", ");
        }
        System.out.println();
        System.out.println(sumUp(favNumbers));
        System.out.println(findMax(favNumbers));
        System.out.println(locateMin(favNumbers));
    }

    //Find the position of the smallest
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

    //Find Max (or Min)
    public static double findMax(double[] arr){
        double max = arr[0]; //NOT ZERO ITSELF
        for (int i = 1; i < arr.length; i++){
            double currNum = arr[i];
            if (currNum > max){
                max = currNum;
            }
        }
        return max;
    }

    public static double sumUp(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            double currNum = arr[i];
            sum += currNum;
        }
        return sum;
    }
}
