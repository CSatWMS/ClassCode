import java.util.Arrays;

public class Array2DBasics {
    public static void main(String[] args) {
        int[][] arr2d = { {8, 7, 3} , {5, 9, 2} };
        System.out.println(arr2d.length + " x " + arr2d[0].length);
        System.out.println(arr2d);
        System.out.println(Arrays.toString(arr2d));
        System.out.println(Arrays.toString(arr2d[0]) + ", " + Arrays.toString(arr2d[1]));
        print(arr2d);
        System.out.println(calcAvg(arr2d));
        System.out.println(Arrays.toString(columnSums(arr2d)));
    }

    public static int[] columnSums(int[][] arr2d){
        int size = arr2d[0].length;
        int[] toReturn = new int[size];
        //Where should I initialize sum?
        //Where should I save it into toReturn?
        //1
        for (int j = 0; j < arr2d[0].length; j++){
            //2
            int sum = 0;
            for (int i = 0; i < arr2d.length; i++){
                //3
                sum += arr2d[i][j];
                //4
            }
            //5
            toReturn[j] = sum;
        }
        //6
        return toReturn;
    }

    public static double calcAvg(int[][] arr2d){
        int numRows = arr2d.length;
        int numCols = arr2d[0].length;
        double sum = 0;
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                sum += arr2d[i][j];
            }
        }
        int numElements = numRows * numCols;
        return sum / numElements;
    }

    public static void print(int[][] arr2d){
        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[0].length; j++){
                int elem = arr2d[i][j];
                System.out.print(elem + ", ");
            }
            System.out.println();
        }
    }
}
