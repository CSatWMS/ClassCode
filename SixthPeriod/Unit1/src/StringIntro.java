public class StringIntro {
    public static void main(String[] args) {
        //general syntax and information

        String food = "Empanada";

        //.length() -> will tell you the number of letters in your string
        int numberOfLetters = food.length();
        System.out.println(numberOfLetters);

        //.charAt(index) -> returns the letter at that index
        char theLetterM = food.charAt(1);
        System.out.println(theLetterM);
        char theLastA = food.charAt(7);
        char theLastLetter = food.charAt(food.length() - 1);

        //.substring(startingPoint) -> take a chunk from the starting point to the end
        String justNada = food.substring(4);
        System.out.println(justNada);
        String theLast3 = food.substring(food.length() - 3);
        System.out.println(theLast3);

        //.substring(startingPoint, stoppingPoint) -> will give you a chunk in between start and stop
            //startingPoint -> inclusive
            //stoppingPoint -> Exclusive (up to, but not including)
        String piece = food.substring(0, 4);
        System.out.println(piece);

        String justPan = food.substring(2, 5);
        System.out.println(justPan);

        //.indexOf(text) -> returns the location (index) of that text
        int locOfM = food.indexOf("m");
        System.out.println(locOfM);
        int locOfE = food.indexOf("E");
        System.out.println(locOfE);
        int locOfA = food.indexOf("a");
        System.out.println(locOfA);
        int locOfPan = food.indexOf("pan");
        System.out.println(locOfPan);
        int locOfPizza = food.indexOf("pizza");
        System.out.println(locOfPizza);
        int locOfLitteE = food.indexOf("e");
        System.out.println(locOfLitteE);


    }


}
