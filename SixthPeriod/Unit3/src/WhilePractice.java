public class WhilePractice {
    public static void main(String[] args) {
        String sentence = "The Cat Spat At The Rat";
        System.out.println(countVowels(sentence));
        System.out.println(countAts(sentence));
    }

    public static int countAny(String bigString, String littleString){
        int index = 0;
        int counter = 0;
        while (index < bigString.length() - (littleString.length() - 1)){
            String window = bigString.substring(index, index + littleString.length());
            if (window.equals(littleString)){
                counter++;
            }
            index++;
        }
        return counter;
    }

    //sliding window algorithm
    public static int countAts(String str){
        int index = 0;
        int counter = 0;
        while (index < str.length() - 1){
            String window = str.substring(index, index + 2);
            if (window.equalsIgnoreCase("at")){
                counter++;
            }

            index++;
        }
        return counter;
    }

    public static int countVowels(String str){
        int index = 0;
        int counter = 0;
        while (index < str.length()){
            String vowelString = "AEIOUaeiou";
            String currentLetter = str.substring(index, index + 1);
            if (vowelString.indexOf(currentLetter) != -1){
                counter++;
            }
            index++;
        }
        return counter;
    }

}
