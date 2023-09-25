public class StringIntro {
    public static void main(String[] args) {
        String str = "empanada";

        System.out.println(str.equals("EMPANADA"));
        System.out.println(str.equalsIgnoreCase("EMPANADA"));

        //.length() -> int, the number of letters
        int numLetters = str.length();
        System.out.println(numLetters);

        //.charAt(index) -> char, the single letter at that index
        char letterP = str.charAt(2);
        System.out.println(letterP);

        char lastLetter = str.charAt(str.length() - 1);
        System.out.println(lastLetter);

        //.substring(startingPoint) -> a String, starting at start and going to the end
        String wholeWord = str.substring(0);
        String piece = str.substring(4);
        System.out.println(piece);

        //.substring(start, stop) -> a piece between start and stop
            //starting -> inclusive
            //stopping -> exclusive (up to, but not including)
        String firstBit = str.substring(0, 4);
        String test = str.substring(2, 5);
        System.out.println(test);

        //first half / second half
        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2, str.length());

        //.toUpperCase() and .toLowerCase()
        System.out.println(str.toUpperCase());

        //.indexOf(letter(s)) -> int, the index where that letter(s) appear
        int indexOfP = str.indexOf("p");
        System.out.println(indexOfP);
        int indexOfA = str.indexOf("a"); //when multiples, it gives you the first spot
        System.out.println(indexOfA);
        int indexOfNada = str.indexOf("nada"); //it tells you where you start
        System.out.println(indexOfNada);

        int indexOfZoo = str.indexOf("zoo"); //returns -1 when it's not in there
        System.out.println(indexOfZoo);

        //compareTo()
            //a.compareTo(b) -> int
                // > 0 (positive) -> a > b
                // < 0 (negative) -> a < b
                // ex 0 (zero) -> a == b
                    //0 < A < a
                    // A < Z
                    // a < z

        int ex1 = "cat".compareTo("dog");
        System.out.println(ex1);
        int ex2 = "cat".compareTo("zoo");
        System.out.println(ex2);
        int ex3 = "Cat".compareTo("CAT");
        System.out.println(ex3);

        int ex4 = "carrier".compareTo("carried");
        int ex5 = "cat".compareTo("catch");
        System.out.println(ex5);
        System.out.println("cat".compareTo("cat"));
    }
}
