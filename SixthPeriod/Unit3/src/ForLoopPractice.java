public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 3; i <= 997; i = i + 7){
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println(containsVowel("hello"));
        System.out.println(containsVowel("aeiou"));
        System.out.println(containsVowel("bcd"));
        System.out.println("----------");
        System.out.println(containsONLYVowels("hello"));
        System.out.println(containsONLYVowels("aeiou"));
        System.out.println(containsONLYVowels("bcd"));

    }

    //Write function that returns true if there are adjacent duplicates
    public static boolean containsAdjDups(String str){
        for (int i = 0 ; i < str.length() - 1 ; i++){
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    //GOAL: write a function that will return true if ALL the letter are vowels
    public static boolean containsONLYVowels(String str){
        for (int i = 0; i < str.length(); i++){
            String currLetter = str.substring(i, i + 1);
            String vowelstring = "AEIOUaeiou";
            if (vowelstring.indexOf(currLetter) == -1){
                return false;
            }
        }
        return true;
    }

    //will return true if there is any vowel
    public static boolean containsVowel(String str){
        for (int i = 0; i < str.length(); i++){
            String currLetter = str.substring(i, i + 1);
            String vowelstring = "AEIOUaeiou";
            if (vowelstring.indexOf(currLetter) >= 0){
                return true;
            }
        }
        return false;
    }
}
