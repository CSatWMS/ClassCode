public class ForLoopIntro {
    public static void main(String[] args) {
        for (int i = 3; i<= 997; i += 7){
            System.out.print(i + ", ");
        }
        System.out.println();


        System.out.println(containsVowel("Hello"));
        System.out.println(containsVowel("BCD"));
        System.out.println(containsVowel("AIEOU"));
        System.out.println("--------------");
        System.out.println(hasONLYVowels("Hello"));
        System.out.println(hasONLYVowels("BCD"));
        System.out.println(hasONLYVowels("AIEOU"));
        System.out.println("--------------");
        System.out.println(containsAdjDups("spell"));
        System.out.println(containsAdjDups("hola"));
    }

    //see if there are any adjacent duplicate
    public static boolean containsAdjDups(String str){
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    //has ONLY vowels
    public static boolean hasONLYVowels(String str){
        for (int i = 0; i < str.length(); i++){
            String vowelString = "AEIOUaeiou";
            String currentLetter = str.substring(i, i + 1);
            if (vowelString.indexOf(currentLetter) == -1){
                return false;
            }
        }
        return true;
    }

    //contain any vowel
    public static boolean containsVowel(String str) {
        for (int i = 0; i < str.length(); i++){
            String vowelString = "AEIOUaeiou";
            String currentLetter = str.substring(i, i + 1);
            if (vowelString.indexOf(currentLetter) >= 0){
                return true;
            }
        }
        return false;
    }
}
