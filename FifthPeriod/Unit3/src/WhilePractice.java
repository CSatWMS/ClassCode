public class WhilePractice {
    public static void main(String[] args) {
        String sentence = "The Cat Spat At The Rat";
        System.out.println(countAts(sentence));
    }

    public static int mysteryCount(String bigString, String littleString){
        int index = 0;
        int counter = 0;
        while (index < bigString.length() - (littleString.length() - 1)){
            String window = bigString.substring(index, index + littleString.length());
            if (window.equalsIgnoreCase(littleString)){
                counter++;
            }
            index++;
        }
        return counter;
    }

    //Sliding window algorithm
    //goal: count how many 'at's there are
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

    //GOAL: To count Vowels
    public static int countVowels(String phrase){
        int index = 0;
        int counter = 0;
        while (index < phrase.length()){
            String currLetter = phrase.substring(index, index + 1);
            String vowelString = "AEIOUaeiou";
            if (vowelString.indexOf(currLetter) != -1){
                counter++;
            }
            index++;
        }
        return counter;
    }

}
