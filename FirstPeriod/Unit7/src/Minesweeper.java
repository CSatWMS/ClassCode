public class Minesweeper { public static void main(String[] args) {
        String[][] grid = new String[4][4];
        grid[0][1] = "*";
        grid[1][0] = "*";
        grid[2][2] = "*";
        grid[3][0] = "*";
        print(grid);
        populate(grid); System.out.println();
        print(grid);
    }
    public static void print(String[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == null){
                    System.out.print(" ,");
                } else {
                    System.out.print(arr[i][j] + ",");
                }
            }
            System.out.println();
        }
    }
    public static int countAround(int i, int j, String[][] grid){
        int count = 0;
        if (grid[i-1][j-1] != null){
            count++;
        }
        if (grid[i-1][j] != null){
            count++;
        }
        if (grid[i-1][j+1] != null){
            count++;
        }
        if (grid[i][j-1] != null){
            count++;
        }
        if (grid[i][j+1] != null){
            count++;
        }
        if (grid[i+1][j-1] != null){
            count++;
        }
        if (grid[i+1][j] != null){
            count++;
        }
        if (grid[i+1][j+1] != null){
            count++;
        }
        return count;
    }

    public static void populate(String[][] grid){
        String[][] sandbox = new String[grid.length + 2][grid[0].length + 2];
        for (int i = 0; i < grid.length; i++){
            for (int j =0; j < grid[0].length; j++){
                sandbox[i + 1][j + 1] = grid[i][j];
            }
        }
        for (int i = 1; i < sandbox.length - 1; i++){
            for (int j = 1; j < sandbox[0].length - 1; j++){
                if (sandbox[i][j] == null) {
                    int count = countAround(i, j, sandbox);
                    grid[i - 1][j - 1] = count + "";
                }
            }
        }


    }
}
