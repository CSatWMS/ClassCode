public class StringIntro {
    public static void main(String[] args) {
        String str = "pool noodle";
        System.out.println(str.equals("POOL NOODLE"));
        System.out.println(str.equalsIgnoreCase("POOL NOODLE"));

        //.length() -> int, the number of letters
        int numLetters = str.length();
        System.out.println(numLetters);

        //.charAt(index) -> char, the letter at that index
        char firstLetter = str.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = str.charAt(str.length() - 1);
        System.out.println(lastLetter);

        //.substring(startingPosition) -> String, starting at the parameter, and going to the end
        String piece = str.substring(5);
        System.out.println(piece);

        //.substring(start, stop) -> String, between start and stop
            //starting point -> inclusive
            //stopping point -> exclusive (we go up to , but not INcluding the stop)
        String firstPiece = str.substring(0, 7);
        System.out.println(firstPiece);

        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2, str.length());
        System.out.println(firstHalf);
        System.out.println(secondHalf);

        //.toLowerCase() and .toUpperCase()
        System.out.println(str.toUpperCase());

        //.indexOf(letter(s)) -> int, the position of those letter(s)
        int indexOfN = str.indexOf("n");
        System.out.println(indexOfN);
        int indexOfO = str.indexOf("o"); //if I have multiples, I get the first one
        System.out.println(indexOfO);
        int indexOfNoo = str.indexOf("noo"); //returns the position where it starts
        System.out.println(indexOfNoo);
        int indexOfNOO = str.indexOf("NOO");
        System.out.println(indexOfNOO);
        int notInthere = str.indexOf("pizza");
        System.out.println(notInthere);

        //.indexOf(letters, startingPoint)

        //.compareTo
            //a.compareTo(b) -> int
                // > 0 (positive) -> a > b
                // < 0 (negative) -> a < b
                // 0 -> a == b
        //based on the ascii table
            // # < A < a
            //A < Z
            //a < z

        int ex1 = "cat".compareTo("dog");
        System.out.println(ex1);
        int ex2 = "cat".compareTo("zoo");
        System.out.println(ex2);
        int ex3 = "Cat".compareTo("CAT");
        System.out.println(ex3);
        System.out.println("CAT".compareTo("Cat"));

    }
}
