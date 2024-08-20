public class VariableIntro {
    public static void main(String[] args) {
        //Variables are a way to remember things

        // All variables have datatypes
                //the type of information that you're storing

        //primitive types
        //int -> integer -> whole numbers
        //double -> number with decimals
        //char -> character -> single letter (represented with single quotes)

        //reference types
            //start with a capital letter
        //String -> holds text, typically more than one letter (we use double quotes)

        int numberOfApples  = 3;
        System.out.println(numberOfApples);
        System.out.println("numberOfApples");
        int numberOfPeaches = 4;
        int numberOfFruits = numberOfApples + numberOfPeaches;
        System.out.println(numberOfFruits);

        double height = 5.333;
        System.out.println(height);

        double tricky = 4; //promotion
        System.out.println(tricky);

        int result = 6 / 4;
        System.out.println(result);

        double trickier = 6 / 4;
        System.out.println(trickier);

        char firstInitial = 'C';
        char lastInitial = 'S';
        System.out.println(firstInitial);
        System.out.println(lastInitial);

        String myName = "Christina Snyder";
        System.out.println(myName);

        /*
        Variable Naming Rules
            Rule = Something that ALWAYS has to happen
        1. No Spaces
        2. AlphaNumeric (letters + numbers + also use the underscore)
        3. No Reserved Words
        4. Cannot start with a number (must start with a letter)

        Variable Naming Conventions
            Convention = A strong suggestion
        1. typically start with a lowerCase letter
        2. Descriptive
        3. Deal with the no space thing
            a. camelCaseMeansCapitalizeEachWord
            b. you_can_use_underscores_to_look_like_spaces
         */


    }


}
