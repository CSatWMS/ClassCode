public class Arr2DIntro {
    public static void main(String[] args) {
        //dt[][] arrName = new dt[rows][cols]

        int[][] nums = new int[3][4];
        nums[0][1] = 7;
        nums[1][3] = 2;
        nums[2][0] = 9;
        nums[2][2] = 5;

        System.out.println(nums);
        print(nums);

        double[][] grades = { {88, 89} , {98, 98} , {72, 75} , {95, 91} };
        print(grades);


    } //ends the main method

    public static int find9s(double[][] grades){
        return -1;
    }

    public static double yearlyAvg(double[][] grades){
        //calculate yearly average (whole array)
        int numRows = grades.length;
        int numCols = grades[0].length;
        double toReturn = 0;
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                double elem = grades[i][j];
                toReturn += elem;
            }
        }
        return toReturn / (numCols * numRows);
    }

    public static void print(double[][] arr2D){
        //1

        for (double[] row : arr2D){
            //2
            System.out.print("| ");
            for (double element : row){
                //3
                System.out.print(element + " | ");
                //4
            }
            //5
            System.out.println();
        }
    }

    public static void print(int[][] arr2D){
        int numRows = arr2D.length;
        int numCols = arr2D[0].length;
        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++){
                int element = arr2D[r][c];
                System.out.print(element + ", ");
            }//inner loop
            System.out.println();
        }//outer loop
    }

} //ends the class
