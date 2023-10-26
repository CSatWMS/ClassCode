public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] favFoods = {"burger", "steak", "spaghetti", "wings"};

        System.out.println(favFoods.length);
        printArray(favFoods);
        System.out.println(grabFirstLetters(favFoods));
        System.out.println(countLetters(favFoods));
        System.out.println(countVowels(favFoods));
        fancyPrint(favFoods);
        System.out.println(indexOfFood(favFoods, "spaghetti"));
        System.out.println(indexOfFood(favFoods, "pizza"));
        System.out.println(findLongestLength(favFoods));
        System.out.println(findShortestWord(favFoods));
        printArray(grabShortestWords(favFoods));
    }

    //GOAL: Return an array with ALL of the shortest words
    public static String[] grabShortestWords(String[] arr){
        int shortestLength = findShortestWord(arr).length();
        //count how many we have
        int counter = 0;
        for (String word : arr){
            if (word.length() == shortestLength){
                counter++;
            }
        }
        //make an array of the right size
        String[] onlyShortest = new String[counter];
        //fill it up
        int specialIndex = 0;
        for (String word : arr){
            if (word.length() == shortestLength){
                onlyShortest[specialIndex] = word;
                specialIndex++;
            }
        }
        return onlyShortest;
    }

    //GOAL: the actual shortest word
    public static String findShortestWord(String[] arr){
        int shortestLength = arr[0].length();
        String shortestWord = arr[0];
        for (String word : arr){
            if (word.length() <= shortestLength){
                shortestLength = word.length();
                shortestWord = word;
            }
        }
        return shortestWord;

        /*
        --------
        String shortestWord = arr[0];
        for (String word : arr){
            if (word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }
        return shortestWord;
         */
    }


    //GOAL: Length of the longest word
    public static int findLongestLength(String[] arr){
        //init max
        int maxLength = arr[0].length();
        //loop
        for (String word : arr) {
            //if I'm bigger
            if (word.length() > maxLength){
                maxLength = word.length();
            }
            //update the max
        }
        return maxLength;
    }

    //Given an array of foods, and a single food -> return the index where that food appears
    public static int indexOfFood(String[] arr, String food){
        for (int i = 0; i < arr.length; i++){
            String currFood = arr[i];
            if (currFood.equals(food)){
                //I've found it!
                return i;
            }
        }
        return -1;
    }

    //GOAL: fancy print situation
        //b u r g e r
        //s t e a k
        //s p a g h e t t i
        //w i n g s
    public static void fancyPrint(String[] arr){
        for (String word : arr){
            for (int z = 0; z < word.length(); z++){
                //System.out.print(word.charAt(z) + " ");
                System.out.print(word.substring(z, z + 1) + " ");
            }
            System.out.println();
        }
    }

    //GOAL: find the total number of vowels in my array
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

    //GOAL: find the total number of letters in my string array
    public static int countLetters(String[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            String word = arr[i];
            counter += word.length();
        }
        return counter;
    }

    //GOAL: Collect the first letter of every string
    public static String grabFirstLetters(String[] arr){
        //make basket
        String basket = "";
        //loop
        for (int i = 0; i <arr.length; i++) {
            //grab first letter
            String firstLetter = arr[i].substring(0, 1);
            //put it in basket
            basket += firstLetter;
        }

        return basket;

        //return basket
    }


    //GOAL: Print out the array of strings
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
