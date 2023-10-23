public class ArrayIntro {
    public static void main(String[] args) {

        int x = 7;
        double y = 8;

        //a collection of data
        // []

        double[] grades = { 87, 85, 84, 89 };

        //element -> a guy in your array (the value)

        int numberOfElements = grades.length;

        System.out.println(numberOfElements);

        //access things with indexes
        double firstGrade = grades[0];

        double lastGrade = grades[grades.length - 1];

        //update my array
        grades[0] = 93.5; //do TC on first grade

        // whereI'mGoing <= whatIHave

        //to create an array
            //dataType[] arrName = {el1, el2, el3, etc};
            //dataType[] arrName = new dataType[size];

        int[] heights = new int[3];
        //arrays are populated with default values:
                //int -> 0
                //double -> 0.0
                //boolean -> false
                //String -> null (a fancy word for nothing)
        for (int i =0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        heights[0] = 64;
        heights[1] = 65;
        heights[2] = 72;

        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        for (int i =0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }

    }
}
