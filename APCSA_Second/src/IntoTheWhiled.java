public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;
        while (number < 10){
            System.out.println("hello-" + number);
            number = number + 1;
        }

        //initialization of a variable
        //while (condition is true)
            //do something
            //update the variable
        int num = 50;
        while (num <= 100){
            System.out.print(num + " ");
            num = num + 1; //num += 1 //num++
        }
        System.out.println();

        //even numbers, 2->20
        int evens = 2;
        while (evens <= 20){
            System.out.print(evens + " ");
            evens += 2;
        }
        System.out.println();
        //Countdown sequence!
        int countDown = 10;
        while (countDown > 0){
            System.out.println(countDown);
            countDown--; //countDown -= 1 // countDown = countDown - 1
        }
        System.out.println("BLASTOFF!");


        String word = "hello";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));

        int index = 0;
        while (index < word.length()){
            System.out.println(index + "- " + word.charAt(index));
            index++;
        }

        //can we print the string backwards??
        int indexBackwards = word.length() - 1;
        while (indexBackwards >= 0){
            System.out.println(word.charAt(indexBackwards));
            indexBackwards--;
        }

        String sentence = "empanadas are great";
        index = 0;
        while (index < sentence.length()){
            char letter = sentence.toLowerCase().charAt(index);
            if (letter == 'a'){
                System.out.println(letter);
            }
            index++;
        }

        //Print out only vowels:
        int indexForV = 0;
        while (indexForV < sentence.length()){
            String letter = sentence.substring(indexForV, indexForV + 1);
            switch(letter){
                case "a", "e", "i", "o", "u":
                    System.out.println(letter  + " is a vowel");
                    break; //exit the current control structure
                case " ":
                    System.out.println(letter + " is a space");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
            indexForV++;
        }

        //collect a's into a basket
        index = 0;
        String basket = "";
        while (index < sentence.length()){
            if (sentence.charAt(index) == 'a'){
                basket = basket + "a";
            }
            index++;
        }
        System.out.println(basket);

        //collect the letters of the string backwards
        //String sentence = "empanadas are great";

        //make an index
        int indexBack = sentence.length() - 1;
        //make a basket
        String basketBackwards = "";
        //loop until some condition
        while (indexBack >= 0) {
            //grab the letter
            String letter = sentence.substring(indexBack, indexBack + 1);
            //toss into basket
            basketBackwards += letter;
            //update index
            indexBack--;
        }
        System.out.println(basketBackwards);

        sentence = "EmPaNaDaS aRe GrEaT";

        //split this into:
            //lowerCase
            //upperCase
            //non - letter characters

        char letterToTest = 'a';
        if (letterToTest >= 'a' && letterToTest <= 'z'){
            System.out.println("lower case letter");
        }

        //INITIALIZE:
            //baskets
                //upper
                //lower
                //nonletter
            //index! (do I start at front or back?)
        //LOOP
            //grab letter
            char currLetter = sentence.charAt(i);
            //test letter
                //put in appropriate basket
            //update index
    }
}
