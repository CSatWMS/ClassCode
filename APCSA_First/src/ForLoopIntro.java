public class ForLoopIntro {
    public static void main(String[] args) {
        //Initialization
        //While (condition)
            //do something
            //update


        //for (initialize ; condition ; update) {
            //do something
        //}


        //count from 0 to 5
        for (int count = 0 ; count <= 5; count++){
            System.out.println(count);
        }

        //10 to 100 in steps of 5s
        for (int count = 10; count <= 100; count += 5){
            System.out.println(count);
        }

        //Blastoff problem
        for (int count = 10; count >= 0; count--){
            System.out.println(count);
            if (count == 0){
                System.out.println("Blastoff");
            }
        }

        String str = "twinkle lights";
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            System.out.println(letter);
        }

        System.out.println(countVowels(str));
    }





    //do we contain adjacent duplicates
    public static boolean containsAdjDups(String str){
        for (int i = 0; i < str.length() - 1; i++){
            //charAt(i) vs charAt(i + 1)
            //substring(i, i +1) vs substring(i + 1, i + 2)
            //substring(i, i + 2) -> look at index 0 and index 1 in the window
            String letter1 = str.substring(i, i + 1);
            String letter2 = str.substring(i + 1, i + 2);
            if (letter1.equals( letter2)){
                return true;
            }
        }
        return false;
    }

    //Given two strings, a little guy and a big guy
        //return true if the little guy appears in the big guy
    public static boolean containsLittleGuy(String littleGuy, String bigGuy){
        for (int i = 0; i < bigGuy.length() - (littleGuy.length() - 1); i++){
            String window = bigGuy.substring(i, i + littleGuy.length());
            if (window.equals(littleGuy)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsVowelsWithFlag(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1) {
                flag = true;
            }
            /*ROOKIE PITFALL
            else {
                flag = false;
            }*/
        }
        return flag;
    }

    public static boolean containsVowels(String str){
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if ("aeiou".indexOf(letter) != -1){
                //I KNOW I am a vowel
                return true;
            }
            /*else {
                return false;
            }*/
        }
        return false;
    }

    public static int countVowels(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            switch (letter){
                case "a", "e", "i", "u", "o":
                    counter++;
            }
        }
        return counter;
    }
}
