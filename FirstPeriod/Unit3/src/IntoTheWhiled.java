public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        while (number < 10){
            System.out.println(number + " is less than 10");
            number = number + 1;
        }

        int count5s = 0;
        while (count5s <= 100){
            System.out.print(count5s + ", ");
            count5s = count5s + 5;
        }
        System.out.println();
        /*
        initialization
        while (condition is true) {    //stopping point
            do something
            update/incrementation
        }
         */

        //GOAL: count DOWN from 10 to 1, then blastoff!
        int countdown = 10;
        while (countdown > 0){
            System.out.println(countdown);
            countdown -= 1; //countdown = countdown - 1;
        }
        System.out.println("Blastoff!");

        int powerOf2 = 1;
        while (powerOf2 <= 64){
            System.out.print(powerOf2 + ", ");
            powerOf2 *= 2;
        }
        System.out.println();
        int exponent = 0;
        while (Math.pow(2, exponent) <= 64){
            System.out.print(Math.pow(2, exponent) + ", ");
            exponent ++; //exponent = exponent + 1
        }
        System.out.println();
        String str = "helloworld";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));

        int index = 0;
        while (index < str.length()){
            System.out.println(str.charAt(index));
            index++;
        }

        //print the string backwards, each letter on its own line
        int indexBackwards = str.length() - 1;
        while (indexBackwards >= 0){
            System.out.println(str.charAt(indexBackwards));
            indexBackwards--;
        }


        printOnlyLs(str);
        labelLetters(str);
        System.out.println(collectVowels(str));
        System.out.println(reverse("hello"));
    }

    //COUNT the vowels
    public static int countVowels(String str){
        int index = 0;
        int counter = 0;
        while (index < str.length()){
            String currentLetter = str.substring(index, index + 1);
            String vowels = "AEIOUaeiou";
            if (vowels.indexOf(currentLetter) != -1){
                counter++;
            }
            index++;
        }
        return counter;
    }

    //reverse("hello") -> returns elloh
    public static String reverse(String str){
        int index = str.length() - 1;
        String basket = "";
        while (index >= 0){
            basket = basket + str.substring(index, index + 1);
            index--;
        }
        return basket;
    }

    //collect Vowels
    public static String collectVowels(String phrase){
        String basket = "";
        int index = 0;
        while (index < phrase.length()){
            char letter = phrase.charAt(index);
            switch (letter) {
                case 'a', 'e', 'i', 'o', 'u':
                    basket = basket + letter;
                    break;
            } //switch curly
            index++;
        }//while curly
        return basket;
    }//function curly

    //LabelLetters
        //print if the letters is vowel (aeiou)
        //it's a Y
        //or if its a consonant
    public static void labelLetters(String word){
        int index = 0;
        while (index < word.length()){
            char curr = word.charAt(index);
            switch (curr){
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(curr + " is a vowel");
                    break;
                case 'y':
                    System.out.println("YYYYYYY");
                    break;
                default:
                    System.out.println(curr + " is a consonant");
                    break;
            }
            index++;
        }
    }

    public static void printOnlyLs(String phrase){
        int index = 0;
        while(index < phrase.length()){
            char currLetter = phrase.charAt(index);
            if (currLetter == 'l'){
                System.out.println(currLetter);
            }

            index++;
        }
    }

}
