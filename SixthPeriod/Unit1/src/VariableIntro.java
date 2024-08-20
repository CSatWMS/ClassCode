public class VariableIntro {
    public static void main(String[] args) {
        //a comment is a non-executable line of text

        //variables are a way for us to store data

        //all variables have a dataType
            //dataType = the KIND of INFORMATION you have

        //primitive type
        //int -> integer -> whole numbers
        //double -> decimal numbers
        //char -> character -> single letters (single letter gets single quotes)

        //Reference Types
            //starts with a CAPITAL letter
        //String -> text -> use double quotes

        int numberOfLamps = 7;
        System.out.println(numberOfLamps);
        System.out.println("numberOfLamps");

        int bigLights = 8;
        System.out.println(bigLights);

        int totalLights = numberOfLamps + bigLights;
        System.out.println(totalLights);

        double hwAvg = 98.2;
        System.out.println(hwAvg);

        //int wontWork = 9.2;

        double test1 = 7; //Promotion
        System.out.println(test1);

        int test2 = 7 / 2; //Truncation
        System.out.println(test2);

        double test3 = 7 / 2;
        System.out.println(test3);

        double test4 = 7.0 / 2; //7 / 2.0 also okay
        System.out.println(test4);

        char firstInitial = 'C';
        System.out.println(firstInitial);
        char lastInitial = 'S';
        System.out.println(lastInitial);

        String myName = "Christina Snyder";
        System.out.println(myName);

        /*
        This is called a BLOCK COMMENT

        Variable Naming RULES
            RULE = something that must happen every time (Requirements)
        1. No Spaces
        2. AlphaNumeric (Letters + Numbers + also the UnderScore)
        3. No Reserved Words
        4. Must start with a letter (not a number)

        Variable Naming Conventions
            Convention = A Strong Suggestion (technically optional)
        1. start with a lowercase letter
        2. descriptive
        3. Deal with the no space thing
            a. useCamelCasingToRepresentWords
            b. you_can_use_underscores_to_be_the_spaces
         */




    }
}
