public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] favFoods = new String[5];

        System.out.println(favFoods[0]);

        favFoods[0] = "Ice Cream";
        favFoods[1] = "Pizza";
        favFoods[2] = "Empanadas";
        favFoods[3] = "Chicken Tenders";
        favFoods[4] = "Fajitas";

        System.out.println(favFoods);
        printArray(favFoods);
        printArray(favFoods);
        System.out.println(countLetters(favFoods));
        System.out.println(findLongestLength(favFoods));
        System.out.println(countVowels(favFoods));
        fancyPrint(favFoods);
        System.out.println(indexOf(favFoods, "pizza"));
    }

    public static int indexOf(String[] arr, String testFood){
        for (int i = 0; i < arr.length; i++){
            if (testFood.equalsIgnoreCase(arr[i])){
                return i;
            }
        }
        return -1;
    }

    /*
    I c e   C r e a m
    P i z z a

     */

    public static void fancyPrint(String[] arr){
        for (String word : arr){
            for (int i = 0; i < word.length(); i++){
                System.out.print(word.substring(i , i + 1) + " ");
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

    public static int findLongestLength(String[] arr){
        //init
        int longestLength = 0;
        //loop
        for (String curr : arr) {
            //if bigger
            if (curr.length() > longestLength) {
                //update it
                longestLength = curr.length();
            }
        }
        //return
        return longestLength;
    }

    public static String grabFirstLetters(String[] arr){
        String basket = "";
        /*for (int i = 0; i < arr.length; i++){
            String currWord = arr[i];
            basket += currWord.charAt(0);
        }*/
        for (String currWord : arr){
            basket += currWord.charAt(0);
        }
        return basket;
    }

    public static int countLetters(String[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            int wordLength = arr[i].length();
            total += wordLength;
        }
        return total;
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
