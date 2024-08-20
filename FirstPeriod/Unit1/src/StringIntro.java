public class StringIntro {
    public static void main(String[] args) {
        //General Syntax

        String food = "Empanada";

        //.length() -> the number of letters in your string
        int numLetters = food.length();
        System.out.println(numLetters);

        //.charAt(index) -> returns the letter at that index
        char letter = food.charAt(2);
        System.out.println(letter);

        char lastLetter = food.charAt(7);
        System.out.println(lastLetter);
        char betterLastLetter = food.charAt(food.length() - 1);

        //.substring(startingIndex) -> returns from that index to the end
        String smaller = food.substring(4);
        System.out.println(smaller);

        //.substring(startingPoint, stoppingPoint) -> returns the letters in between start and stop
            //start = inclusive
            //stop = exclusive
        String firstPart = food.substring(0, 2);
        System.out.println(firstPart);

        String justPan = food.substring(2, 5);

        //.indexOf(text) -> return the location of that text
        int locOfM = food.indexOf("m");
        System.out.println(locOfM);
        int locOfA = food.indexOf("a");
        System.out.println(locOfA);
        int locOfPan = food.indexOf("pan");
        System.out.println(locOfPan);
        int locOfPizza = food.indexOf("Pizza");
        System.out.println(locOfPizza);

    }


}
