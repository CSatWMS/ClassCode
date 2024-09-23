public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        while (number < 10){
            System.out.println(number + " is less than 10!");
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
        while (condition is true){
            do something
            update/incrementation
        }
         */

        //Countdown 10 -> 1, blastoff!
        int countdown = 10;
        while (countdown > 0){
            System.out.println(countdown);
            countdown -= 1; //countdown = countdown - 1;
        }
        System.out.println("Blastoff!");


        int powerOf2 = 1;
        while(powerOf2 <= 64){
            System.out.print(powerOf2 + ", ");
            powerOf2 *= 2; //powerOf2 = powerOf2 * 2;
        }
        System.out.println();
        int exponent = 0;
        while (Math.pow(2, exponent) <= 64){
            System.out.print(Math.pow(2, exponent) + ", ");
            exponent++; //exponent += 1;
        }
        System.out.println();

        String str = "hello, world";
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

        //print out the string backwards
        int indexBackwards = str.length() - 1;
        while (indexBackwards >= 0){
            System.out.println(str.charAt(indexBackwards));
            indexBackwards--;
        }

        printOnlyLs(str);
        labelLetters(str);
        System.out.println(gatherVowels(str));
        System.out.println(reverse("hello"));
    }

    //GOAL: Return a backwards version of the parameters
        //reverse("hello") -> olleh
    public static String reverse(String str){
        int index = str.length() - 1;
        String basket = "";
        while (index >= 0){
            basket = basket + str.substring(index, index + 1);
            index--;
        }
        return basket;
    }


    public static String gatherVowels(String str){
        String basket = "";
        int index = 0;
        while (index < str.length()){
            char currLetter = str.charAt(index);
            switch (currLetter) {
                case 'a', 'e', 'i', 'o', 'u':
                    basket = basket + currLetter;
                    break;
            }
            index++;
        }
        return basket;
    }

    //GOAL: Label every character as a vowel, or a consonant, or a Y
        //Vowels = aeiou
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
                case ' ', ',', '.', '!', '?':
                    System.out.println(curr + " is punctuation!");
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
        while (index < phrase.length()){
            char currentLetter = phrase.charAt(index);
            if (currentLetter == 'l'){
                System.out.println(currentLetter);
            }
            index++;
        }
    }



}
