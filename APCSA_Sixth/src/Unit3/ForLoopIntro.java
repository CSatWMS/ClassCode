package Unit3;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
        intialize something
        while (condition){
            do something
            update the variable
        }

        for ( initialize ; condition ; update) {
            do something
        }

         */

        //count from 1 to 5
        for (int count = 1; count <= 5; count++){
            System.out.println(count);
        }

        //count from 0 to 100 in steps of 5
        for (int count = 0; count <= 100; count = count + 5){
            System.out.print(count + " ");
        }

        //Display a countdown sequence (10 -> 1, then BLASTOFF!)
        for (int count = 10 ; count > 0 ; count--){
            System.out.println(count);
        }
        System.out.println("BLASTOFF!");

        String str = "Homecoming King and Queen";
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            System.out.println(letter);
        }
        System.out.println(countVowels(str));


    }

    //can we know if a little string is contained within a big string
    public static boolean containsLittleGuy(String littleGuy, String bigGuy){
        for (int i = 0; i < bigGuy.length() - (littleGuy.length() - 1); i++){
                        // i <= bigGuy.length() - littlelength
                        // i < bigLength - littleLength + 1
            String window = bigGuy.substring(i, i + littleGuy.length());
            if (window.equals(littleGuy)){
                return true;
            }
        }
        return false;
    }

    //can we contain a vowel with a flag?
    public static boolean containsVowelWithFlag(String str){
        boolean hasVowel = false;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1){
                hasVowel = true;
            }/* else { //BAD IDEA
                hasVowel = false;
            }*/
        }
        return hasVowel;
    }

    //know if my string CONTAINS a vowel (return true or false)
    public static boolean containsVowel(String str){
        for (int i = 0; i < str.length(); i++){
            if ("aeiou".indexOf(str.substring(i, i + 1)) != -1){
                //I KNOW I am a vowel
                return true;
            }
            /*
            else {
                return false;
            }
            BAD NEWS BEARS
             */
        }
        return false;
    }


    //GOAL: return the number of vowels in a string
    public static int countVowels(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1){
                counter++;
            }
        }
        return counter;
    }


}







