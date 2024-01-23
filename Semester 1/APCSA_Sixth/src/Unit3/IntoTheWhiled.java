package Unit3;

public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        while (number < 10){
            System.out.println("hello-" + number);
            number = number + 1;
        }

        //initialize some variable (starting point)
        //while (condition) (stopping point)
            //do something
            //update the variable

        int num = 0;
        while (num <= 50){
            System.out.print(num + " ");
            num += 1; //num = num + 1;
        }
        System.out.println();

        //even numbers from 2 to 20
        int evens = 2;
        while (evens <= 20){
            System.out.print(evens + " ");
            evens += 2;
        }
        System.out.println();

        //countdown sequence (10 -> 1) then blastoff!
        //where do I start?
        int countDown = 10;
        //where do I stop?
        while (countDown > 0) {
            //how do I get there?
            System.out.println(countDown);
            countDown--; //countDown -= 1 // countDown = countDown - 1
        }
        System.out.println("BLASTOFF!");

        // 1, 2, 4, 8, 16, 32, 64
        //powers of 2 less than 100
        int powerOf2 = 1;
        while (powerOf2 < 100){
            System.out.println(powerOf2);
            powerOf2 *= 2;
        }

        int exponent = 0;
        while (Math.pow(2, exponent) < 100){
            System.out.println(Math.pow(2, exponent));
            exponent++;
        }

        String word = "hello";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));

        int index = 0;
        while (index < word.length()){
            System.out.println(index + " - " + word.charAt(index));
            index++;
        }

        //print out word backwards
        int indexBackwards = word.length() - 1;
        while (indexBackwards >= 0){
            System.out.println(word.charAt(indexBackwards));
            indexBackwards--;
        }

        String sentence = "Besties FIVE_Ever";

        int i = 0;
        while (i < sentence.length()){
            char letter = sentence.toLowerCase().charAt(i);
            if (letter == 'e'){
                System.out.print(letter);
            }
            i++;
        }

        System.out.println();
        //printout vowels
        i = 0;
        String basket = "";
        while (i < sentence.length()){
            String letter = sentence.substring(i, i + 1);
            switch (letter.toLowerCase()){
                case "a", "e", "i", "o", "u":
                    System.out.println(letter + "-VOWEL");
                    basket = basket + letter;
            }
            i++;
        }
        System.out.println(basket);

        indexBackwards = sentence.length() - 1;
        String backwardsBasket = "";
        while (indexBackwards >= 0){
            backwardsBasket = backwardsBasket + sentence.charAt(indexBackwards);
            indexBackwards--;
        }
        System.out.println(backwardsBasket);

        //basket -> capital letters
        //-> lowerCase letters
        //-> non letter
        char testLetter = 'a';
        boolean isA = testLetter == 'a';
        boolean isLowerCase = testLetter >= 'a' && testLetter <= 'z';

        String testLetterstr = "a";
        boolean isLowerCaseStr = testLetterstr.compareTo("a") >= 0 && testLetterstr.compareTo("z") <= 0;

        //String sentence = "Besties FIVE_Ever";
        String capBasket = "";
        String lowerBasket = "";
        String notLetterBasket = "";
        //access every letter
        index = 0;
        while (index < sentence.length()) {
            char letter = sentence.charAt(index);
            //test it for caps
                //test for lower
            if (letter >= 'a' && letter <= 'z'){
                lowerBasket += letter;
            }
                //test for upper
            else if (letter >= 'A' && letter <= 'Z'){
                capBasket += letter;
            } else {
                notLetterBasket += letter;
            }
            //toss it into the appropriate basket
            index++;
        }
        System.out.println("CAPS: " + capBasket);
        System.out.println("lower: " + lowerBasket);
        System.out.println("NOT: " + notLetterBasket);

        //count vowels

        i = 0;
        int counter = 0;
        while ( i < sentence.length()){
            String currLet = sentence.substring(i , i + 1);
            if ("aeiouAEIOU".indexOf(currLet) != -1){
                counter++;
            }
            i++;
        }
        System.out.println(counter + " vowels");





    }
}
