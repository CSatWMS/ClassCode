import java.util.Arrays;

public class Array2DBasics {
    public static void main(String[] args) {
        int[][] arr2d = { {8, 3, 2} , {3, 5, 1} };
        System.out.println(Arrays.toString(arr2d));
        print(arr2d);
        System.out.println(calcAverage(arr2d));
        System.out.println(Arrays.toString(columnSums(arr2d)));
    }

    public static int[] columnSums(int[][] arr2d){
        int[] toReturn = new int[arr2d[0].length];
        //where initialize sum?? (2 is the best spot)
        //where save sum into toReturn??
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

    //calculate the average of the elements in a 2d array
    public static double calcAverage(int[][] arr2d){
        int numRows = arr2d.length;
        int numCols = arr2d[0].length;
        double sum = 0;
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                sum += arr2d[i][j];
            }
        }
        int numElements = numRows*numCols;
        return sum / numElements;
    }

    public static void print(int[][] arr2d){
        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[0].length; j++){
                int element = arr2d[i][j];
                System.out.print(element + ", ");
            }
            System.out.println();
        }
    }
}
