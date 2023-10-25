public class ArrayIntro {
    public static void main(String[] args) {

        int x = 7;

        //an array is way for us to hold more than one piece of data
        //[] -> array

        //create an array:
            //dataType[] arrName = {value1, value2, value3, etc};
            //dataType[] arrName = new dataType[size];

        double[] grades = {84, 87, 82, 89};

        int numberOfElements = grades.length;

        //element -> a guy/ a value in the array

        System.out.println(numberOfElements);

        //access data from an array:
        double firstGrade = grades[0];
        double lastGrade = grades[grades.length - 1];

        //update data in my array
        grades[0] = 92;

        //whereI'mGoing <= whatIHave

        int[] heights = new int[3];
        //new arrays are populated with default values
            //int -> 0
            //double -> 0.0
            //boolean -> false
            //String -> null (a fancy word that means nothing) (not "null")
        for (int i =0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
        System.out.println();


        heights[0] = 64;
        heights[1] = 74;
        heights[2] = 68;

        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        for (int i =0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
        System.out.println();







    }
}
