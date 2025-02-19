import java.util.Arrays;

public class Arr2DBasics {
    public static void main(String[] args) {
        int[][] arr2D = { {8, 7, 3} , {4, 9, 2} };
        System.out.println(arr2D.length + " x " + arr2D[0].length);
        System.out.println(Arrays.toString(arr2D));
        print(arr2D);
        System.out.println(avg(arr2D));
        System.out.println(Arrays.toString(columnSums(arr2D)));
        double[][] grades = { {90, 95, 93, 93} , {85, 82, 88, 86} , {72, 75, 79, 80} };
        double[][] updated = makeGradebook(grades);
        print(updated);
    }

    public static void print(double[][] arr2D){
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                double elem = arr2D[i][j];
                elem = Math.round(elem * 100) / 100.0;
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] makeGradebook(double[][] grades){
        double[][] toReturn = new double[grades.length + 1][grades[0].length+1];

        return toReturn;
    }

    public static int[] columnSums(int[][] arr2D){
        int size = arr2D[0].length;
        int[] toReturn = new int[size];
        //where initialize sum?
        //when save sum?
        //1
        for (int j = 0; j < arr2D[0].length; j++){
            //2
            int sum = 0;
            for (int i = 0; i < arr2D.length; i++){
                //3
                sum += arr2D[i][j];
                //4
            }
            //5
            toReturn[j] = sum;
        }
        //6
        return toReturn;
    }

    public static double avg(int[][] arr2D){
        int numRows = arr2D.length;
        int numCols = arr2D[0].length;
        double sum = 0;
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                sum += arr2D[i][j];
            }
        }
        int numElements = numCols * numRows;
        return sum / numElements;
    }

    public static void print(int[][] arr2D){
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                int elem = arr2D[i][j];
                System.out.print(elem + ", ");
            }
            System.out.println();
        }
    }


}
