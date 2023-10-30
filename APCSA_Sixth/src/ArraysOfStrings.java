public class ArraysOfStrings {
    public static void main(String[] args) {

        String[] spookyThings = {"homework", "ghosts", "a black cat", "bats"};

        System.out.println(spookyThings.length);
        printArray(spookyThings);
        System.out.println(grabFirstLetters(spookyThings));
        System.out.println(countTotalLetters(spookyThings));
        System.out.println(countVowels(spookyThings));
        fancyPrint(spookyThings);
        System.out.println(findSpooky(spookyThings, "ghosts"));
        System.out.println(findSpooky(spookyThings, "zombies"));
        System.out.println(findLongestLength(spookyThings));
        System.out.println(findShortestWord(spookyThings));
    }

    //GOAL: Find the actual shortest word
    public static String findShortestWord(String[] arr){
        String shortestWord = arr[0];
        for (String dude : arr){
            if (dude.length() < shortestWord.length()){
                shortestWord = dude;
            }
        }
        return shortestWord;
    }

    //GOAL: find the length of the longest word
    public static int findLongestLength(String[] arr){
        //init max
        int maxLength = arr[0].length(); // 0 is okay here
        //loop
        for (String dude : arr) {
            //if I'm bigger
            if (dude.length() > maxLength) {
                //Max is me
                maxLength = dude.length();
            }
        }
        return maxLength;
    }

    //GOAL: find the location of a single spooky thing, or return -1 if it doesn't exit
    public static int findSpooky(String[] things, String spookyGuy){
        for (int i = 0; i < things.length; i++){
            String currentDude = things[i];
            if (currentDude.equals(spookyGuy)){
                //i've found him!
                return i;
            }
        }
        return -1;
    }

    //fancy print situation
        //h o m e w o r k
        //g h o s t s
        //a   b l a c k   c a t
        //b a t s
    public static void fancyPrint(String[] arr){
        for (String word : arr){
            for (int i = 0; i < word.length(); i++){
                String letter = word.substring(i , i + 1);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }

    //GOAL: count the number of vowels in my array
    public static int countVowels(String[] arr){
        int counter = 0;
        for (String word : arr){
            for (int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1);
                switch (letter) {
                    case "a", "e", "i", "o", "u":
                        counter++;
                }
            }
        }
        return counter;
    }

    //GOAL: count the total number of letters in my array
    public static int countTotalLetters(String[] arr){
        int counter = 0;
        for (String word : arr){
            counter += word.length();
        }
        return counter;
    }

    //GOAL: Grab the first letters of every string
        //use a basket, in a loop, with substring
    public static String grabFirstLetters(String[] arr){
        //make basket
        String basket = "";
        //loop
        for (int i = 0; i < arr.length; i++){
            //substring
            String word = arr[i];
            String letter = word.substring(0, 1);
            //add to basket
            basket += letter;
        }
        return basket;
    }

    //GOAL: print out the string array
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
