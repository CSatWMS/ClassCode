public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;
        while (number < 10){
            System.out.println(number + " is smaller Than 10");
            number = number + 1;
            System.out.println("Hooray!");
        }

        int count5 = 0;
        while (count5 <= 100) {
            System.out.print(count5 + ", ");
            count5 = count5 + 5;
        }

        System.out.println();
        //NASA Countdown
        //initialization (starting point)
        //while (Condition is true){
            //do something
            //update (incrementation)
        int countDown = 10;
        while(countDown > 0){
            System.out.println(countDown);
            countDown -= 1; //countDown = countDown - 1;
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
            exponent += 1; //exponent++;
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

        int backIndex = str.length() - 1;
        while (backIndex >= 0){
            System.out.println(str.charAt(backIndex));
            backIndex--; //index = index - 1
        }

        printLs(str);
        labelLetters(str);
        System.out.println(retrieveVowels(str));
        System.out.println(reverse(str));
    }

    public static void printLs(String word){
        int index = 0;
        while (index < word.length()){
            char currentLetter = word.charAt(index);
            if (currentLetter == 'l'){
                System.out.println(currentLetter);
            }
            index++;
        }
    }

    //Label each character
        //vowel (AEIOU) (aeiou)
        //Y
        //consonant
    public static void labelLetters(String str){
        int index = 0;
        while (index < str.length()){
            char letter = str.charAt(index);
            switch (letter){
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                case 'y':
                    System.out.println("YYYYYYYYYY");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
                    break;
            }
            index++;
        }
    }

    public static String retrieveVowels(String phrase){
        String basket = "";
        int index = 0;
        while (index < phrase.length()){
            char currentLetter = phrase.charAt(index);
            switch (currentLetter) {
                case 'a', 'e', 'i', 'o', 'u':
                    basket = basket + currentLetter; //basket += currentLetter
                    break;
            }
            index++;
        }
        return basket;
    }

    public static String reverse(String str){
        int index = str.length() - 1;
        String basket = "";
        while (index >= 0){
            basket = basket + str.substring(index, index + 1);
            index--;
        }
        return basket;
    }

}
