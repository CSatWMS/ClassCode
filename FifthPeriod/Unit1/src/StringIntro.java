public class StringIntro {
    public static void main(String[] args) {
        //general syntax

        String food = "Empanada";

        //.length() -> will tell you the number of letters in a string

        int numberOfLetters = food.length();
        System.out.println(numberOfLetters);

        //.charAt(index) -> return the character at that index
        char emm = food.charAt(1);
        System.out.println(emm);
        char lastA = food.charAt(7);
        lastA = food.charAt(numberOfLetters - 1);
        lastA = food.charAt(food.length() - 1);

        //.substring(start) -> returns a chunk from the start to the end of the string
        String part = food.substring(4);
        System.out.println(part);

        //.substring(start, stop) -> returns a chunk from start to stop
            //start -> inclusive
            //stop -> exclusive (up to, but not including our stopping point)
        String firstBit = food.substring(0, 4);
        String justPan = food.substring(2, 5);

        //.indexOf(text) -> returns the location (index) of that text
        int locOfE = food.indexOf("E");
        System.out.println(locOfE);

        int locOfA = food.indexOf("a");
        System.out.println(locOfA);

        int locOfPan = food.indexOf("pan");
        System.out.println(locOfPan);

        int locOfPizza = food.indexOf("pizza");
        System.out.println(locOfPizza);
        int locOfLittlee = food.indexOf("e");
        System.out.println(locOfLittlee);


    }

}
