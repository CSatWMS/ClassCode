package Unit3;

public class StringIntro {
    public static void main(String[] args) {
        String str = "noodles";
        System.out.println(str);
        System.out.println(str.equals("NOODLES"));
        System.out.println(str.equalsIgnoreCase("NOODLES"));

        int numLetters = str.length();
        System.out.println(numLetters);

        char firstLetter = str.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = str.charAt(6);
        System.out.println(lastLetter);

        lastLetter = str.charAt(str.length() - 1);
        char middleLetter = str.charAt(numLetters  / 2);

        //substring(startingPoint) -> letters from that starting point to the end
        String lastTwo = str.substring(5);
        System.out.println(lastTwo);

        String lastFour = str.substring(str.length() - 4);
        System.out.println(lastFour);

        //another substring!
        //substring(startingPoint, stoppingPoint)
            //start -> inclusive
            //stop -> exclusive (up to but not including)
        String test = str.substring(0, 3);
        System.out.println(test);

        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2, str.length());

        //.toUpperCase() and .toLowerCase()
        String excited = str.toUpperCase();
        System.out.println(excited);

        //.indexOf(letters) -> the position of those letters
        int indexOfL = str.indexOf('l');
        System.out.println(indexOfL);
        int indexOfO = str.indexOf("o"); //index of the first one
        System.out.println(indexOfO);
        int indexOfNoo = str.indexOf("noo"); //index of the starting letter
        System.out.println(indexOfNoo);
        int indexOfNOO = str.indexOf("NOO"); //it IS case sensitive
            //if the parameter is not in the word -> we get -1
        System.out.println(indexOfNOO);
        System.out.println(str.indexOf("zoo"));
        System.out.println(str.indexOf("oo"));

        //compareTo
            //a.compareTo(b) -> returns an integer
                // >0 (positive) if a > b
                // <0 (negative) if a < b
                // 0 (zero) if a == b
                    // 0 < A < a
                    //A < Z
                    //a < z
        int result1 = "cat".compareTo("bee");
        System.out.println(result1);
        int result2 = "cat".compareTo("zoo");
        System.out.println(result2);
        int result3 = "CAT".compareTo("Cat");
        System.out.println(result3);

        int result4 = "carrier".compareTo("carried");
        System.out.println(result4);


    }
}
