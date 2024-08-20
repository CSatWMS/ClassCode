public class VariableIntro {
    public static void main(String[] args) {
        //a comment is a non-executable line of code

        //variables are a way to remember things
        //all variables in java have a datatype
            //datatype -> the type of data that youre storing

        //primitive types
            //int -> integer -> whole numbers
            //double -> number with decimals
            //char -> character -> single letters (also get single quotes)

        //reference type
            //start with a capital letter
            //String -> text -> use double quotes

        int numberOfLamps = 7;
        System.out.println(numberOfLamps);
        System.out.println("numberOfLamps");

        int bigLights = 8;
        int totalNumLights = numberOfLamps + bigLights;
        System.out.println(totalNumLights);

        double gpa = 96.74;
        System.out.println(gpa);

        //int wontwork = 7.5;

        double test = 7; //promotion
        System.out.println(test);

        int test2 = 7 / 2; //truncation
        System.out.println(test2);

        double test3 = 7 / 2;
        System.out.println(test3);

        double test4 = 7.0 / 2;
        System.out.println(test4);

        char firstInitial = 'C';
        char lastInitial = 'S';
        System.out.println(firstInitial);
        System.out.println(lastInitial);

        String myName = "Christina Snyder";
        System.out.println(myName);

        /*
        this is a block comment, the whole thing is one big comment

        Variable Naming Rules
            Rule = something you have to do ALL the time
        1. No Spaces
        2. AlphaNumeric (letters and numbers + the underscore)
        3. No Reserved Words
        4. Must start with a letter (cannot start with a number)

        Variable Naming Conventions
            Convention = a strong suggestion
        1. starts with a lowerCase letter
        2. Descriptive
        3. Deal with the no space thing
            a. camelCasingWhereYouCapEachWordExceptTheFirst
            b. you_can_use_underscores_for_spaces
         */
    }
}
