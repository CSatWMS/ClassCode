public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] favFoods = new String[5];
        System.out.println(favFoods[0]);

        favFoods[0] = "Pizza";
        favFoods[1] = "Burgers";
        favFoods[2] = "Empanadas";
        favFoods[3] = "Ice Cream";
        favFoods[4] = "Pasta";

        System.out.println(favFoods);
        printArray(favFoods);
        System.out.println(countLetters(favFoods));
        System.out.println(grabFirstLetters(favFoods));
        System.out.println(countVowels(favFoods));
        System.out.println(indexOf(favFoods, "burgers"));
        System.out.println(indexOf(favFoods, "apples"));
    }

    //P i z z a
    //B u r g e r s
    public static void fancyPrint(String[] arr){
        
    }

    public static int indexOf(String[] arr, String testFood){
        for (int i = 0; i < arr.length; i++){
            String currWord = arr[i];
            if (currWord.equalsIgnoreCase(testFood)){
                return i;
            }
        }
        return -1;
    }

    //count the total number of vowels (case Insensitive)
    //"AEIOUaeiou".indexOf(letter) != -1
    public static int countVowels(String[] arr){
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
        int longestLength = 0;
        //loop
        for (String element : arr) {
            //if statement (if I'm bigger)
            if (element.length() > longestLength){
                longestLength = element.length();
            }
            //update
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
        //for Each Loop
        //for (DT varName : arrName)
        for (String currWord : arr){
            basket += currWord.charAt(0);
        }
        return basket;
    }

    public static int countLetters(String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String currWord = arr[i];
            count += currWord.length();
        }
        return count;
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", "); // "ith" element
        }
        System.out.println();
    }

}
