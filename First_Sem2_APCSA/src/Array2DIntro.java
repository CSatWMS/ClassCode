import java.util.Arrays;

public class Array2DIntro {
    public static void main(String[] args) {
        //dt[][] arrName = new dt[][];
        int[][] nums = new int[3][4];
        nums[0][1] = 7;
        nums[1][3] = 2;
        nums[2][0] = 9;
        nums[2][2] = 5;

        System.out.println(nums);
        print(nums);

        double[][] grades = { {91, 93} , {87, 89} , {72, 78}, {95, 92} };

        print(grades);

    } //ends my main method


    //GOAL: Find the class average
    public static double classAverage(double[][] arr){
        double avg = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                double element = arr[i][j];
                avg += element;
            }
        }
        return avg / (arr.length * arr[0].length);
    }

    public static void print(double[][] arr){
        //1
        for (double[] row : arr){
            //2
            System.out.print("| ");
            for (double element : row){
                //3
                System.out.print(element + " | ");
            }
            //4
            System.out.println();
        }
        //5
    }

    public static void print(int[][] arr){
        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++){
                int element = arr[r][c];
                System.out.print(element + ", ");
            }
            System.out.println();
        }
    }

}//ends my class















