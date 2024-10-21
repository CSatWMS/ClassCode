public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] favFoods = new String[5];
        System.out.println(favFoods[0]);
        favFoods[0] = "Pizza";
        favFoods[1] = "Sushi";
        favFoods[2] = "Burgers";
        favFoods[3] = "Empanadas";
        favFoods[4] = "Ice Cream";
        System.out.println(favFoods);
        printArray(favFoods);
        printArray(favFoods);
        System.out.println(initialism(favFoods));
        System.out.println(countChars(favFoods));
        System.out.println(findLongestLength(favFoods));
        System.out.println(countVowels(favFoods));
        fancyPrint(favFoods);
        System.out.println(indexOf(favFoods, "sushi"));
    }

    //to return the index of where a particular food might exist, or -1
    public static int indexOf(String[] arr, String testFood){
        for (int i = 0; i < arr.length; i++){
            String currFood = arr[i];
            if (currFood.equalsIgnoreCase(testFood)){
                return i;
            }
        }
        return -1;
    }

    //P i z z a
    //S u s h i
    //

    public static void fancyPrint(String[] arr){
        for (String w : arr){
            //for (char c : w.toCharArray()){
            for (int i = 0; i < w.length(); i++){
                char c = w.charAt(i);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


    public static int countVowels(String[] arr){
        //"AEIOUaeiou".indexOf(letter) != -1
        int count = 0;
        for (String curr : arr){
            for (char c : curr.toCharArray()){
                if ("AEIOUaeiou".indexOf(c) != -1){
                    count++;
                }
            }
        }
        return count;
    }

    //find the length of the longest word
    public static int findLongestLength(String[] arr){
        //init
        int maxLength = 0;
        //loop
        for (String word : arr) {
            //if statement (if i'm bigger)
            if (word.length() > maxLength){
                //update
                maxLength = word.length();
            }

        }
        //return
        return maxLength;
    }

    public static int countChars(String[] arr){
        int counter = 0;
        /*for (int i = 0; i < arr.length; i++){
            String currWord = arr[i];
            counter += currWord.length();
        }*/
        for (String currWord : arr){
            counter += currWord.length();
        }
        return counter;
    }

    public static String initialism(String[] arr){
        String basket = "";
        for (int i = 0; i < arr.length; i++){
            String curr = arr[i];
            char firstLetter = curr.charAt(0);
            basket += firstLetter;
        }
        return basket;
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
