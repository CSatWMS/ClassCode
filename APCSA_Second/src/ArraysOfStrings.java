public class ArraysOfStrings {
    public static void main(String[] args) {
        //dataType[] arrName =
        String[] favFoods = {"pasta", "sushi", "pizza", "noodles"};
        System.out.println(favFoods.length);
        printArray(favFoods);
        System.out.println(grabFirstLetters(favFoods));
        System.out.println(totalLetters(favFoods));
        System.out.println(countVowels(favFoods));
        fancyPrint(favFoods);
        System.out.println(findFood(favFoods, "pizza"));
        System.out.println(findFood(favFoods, "hot wings"));
        System.out.println(findLongestLength(favFoods));
    }

    //GOAL: find the actual shortest word (doesn't matter which one)
    public static String actualShortestWord(String[] arr){
        String minWord = arr[0];
        for (String word : arr){
            if (word.length() < minWord.length()){
                minWord = word;
            }
        }
        return minWord;
    }

    //GOAL: Find the length of the longest string
        //init a max
        //loop
            //if i'm bigger
                //max is me
    public static int findLongestLength(String[] arr){
        int maxLength = 0; //arr[0].length();
        for (String word : arr){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    //GOAL: given an array, and a single food, find the location of that food (or -1 if it DNE)
    public static int findFood(String[] arr, String food){
        for (int i = 0; i < arr.length; i++){
            String currentFood = arr[i];
            if (currentFood.equals(food)){
                //i've found it!
                return i;
            }
        }
        return -1;
    }

    //fancy print situation
        //p a s t a
        //s u s h i
        //p i z z a
        //n o o d l e s
    public static void fancyPrint(String[] arr){
        for (String word : arr){
            for (int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }

    //GOAL: find the number of vowels in the array
    public static int countVowels(String[] arr){
        int counter = 0;
        for (String word : arr){
            for (int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1);
                switch (letter){
                    case "a", "e", "i", "o", "u":
                        counter++;
                }
            }
        }
        return counter;
    }

    //GOAL: I want to know the total number of letters in the array
    //counter
    //loop
        //counter += word.length
    public static int totalLetters(String[] arr){
        int counter = 0;
        //for each loop
        for (String word : arr){
            counter += word.length();
        }
        return counter;
    }

    //GOAL: grab only the first letter of each string and return it
        //-> pspn
    public static String grabFirstLetters(String[] arr){
        //basket
        String basket = "";
        //loop
        for (int i =0 ; i< arr.length; i++) {
            //access first letters
            String word = arr[i];
            String firstLetter = word.substring(0, 1);
            basket += firstLetter;

            //basket += arr[i].substring(0, 1);
        }
        return basket;
    }

    //GOAL: Print out the array of strings
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
