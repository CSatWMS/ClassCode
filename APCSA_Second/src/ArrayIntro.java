import com.sun.security.jgss.GSSUtil;

public class ArrayIntro {
    public static void main(String[] args) {

        //a collection of data (the array)

        int x = 7;

        //to make an array:
            //dataType[] arrName = { value1, value2, value3, etc };
            //dataType[] arrName = new dataType[size];

        double[] grades = {84, 87, 89, 82};

        //there are 4 elements in my array
            //element -> a guy / a value in the array

        int numberOfElements = grades.length;

        System.out.println(numberOfElements);

        //accessing elements in an array
        double firstGrade = grades[0];
        double lastGrade = grades[grades.length - 1];

        //update an element
        grades[0] = 92; //TC on first test

        //whereI'mGoing <= whatIHave


        int[] heights = new int[3];
        //creates a new array with three spots
        //while we have not put data in it, it's not empty
        //it's populated with default values
            //int -> 0
            //double -> 0.0
            //boolean -> false
            //String -> null (a fancy word for nothing) (not "null")
        for (int i = 0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        heights[0] = 64;
        heights[1] = 74;
        heights[2] = 68;

        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        for (int i = 0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }









    }
}
