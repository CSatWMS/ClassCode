public class ForLoopIntro {
    public static void main(String[] args) {
        /*
        intitialization
        while (condition)
            do something
            update the  loop variable

        for ( initialization ; condition ; update) {
            do something
        }

         */

        //count from 1 to 5
        for (int count = 1; count <= 5; count++){
            System.out.println(count);
        }

        //count from 10 to 100 in steps of 5
        for (int count = 10; count <= 100; count = count + 5){
            System.out.print(count + " ");
        }

        //countdown sequence:
        for (int count = 10; count >= 1; count--){
            System.out.println(count);
        }
        System.out.println("BLASTOFF!");

        String str  = "twinkle lights";
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            System.out.println(letter);
        }
        System.out.println(countVowels(str));
        System.out.println(containsLittleGuy("wink", "twinkle lights"));
        System.out.println(containsLittleGuy("zoo", "twinkle lights"));
        System.out.println(containsLittleGuy("lights", "twinkle lights"));
        System.out.println(containsLittleGuy("twinkle", "twinkle lights"));
    }

    //We're going to take in a little guy and a big guy
        //return true if the little guy appears in the big guy
    public static boolean containsLittleGuy(String littleGuy, String bigGuy){
        for (int i = 0; i < bigGuy.length() - (littleGuy.length() - 1); i++){
                        //i <= bigGuy.length() - littleLength()
                        //i < bigGuy.length - littleGuy.length + 1
            String window = bigGuy.substring(i, i + littleGuy.length());
            if (window.equals(littleGuy)){
                return true;
            }
        }
        return false;
    }

    //Do it again with a boolean flag!
    public static boolean containsVowelWithFlag(String str){
        boolean hasVowel = false;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1){
                hasVowel = true;
            }
            /*else {
                hasVowel = false; //similarly BAD
            }*/
        }
        return hasVowel;
    }

    //GOAL: return true or false, if the string contains a vowel
    public static boolean containsVowels(String str){
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1){
                //I KNOW I am a vowel
                return true;
            }
            /* BAD NEWS BEARS
            else {
                return false;
            }
             */
        }
        return false;
    }

    //GOAL: Count how many vowels there are in a string
    public static int countVowels(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            switch (letter){
                case "a", "e", "i", "o", "u":
                    counter++;
            }
        }
        return counter;
    }

}
