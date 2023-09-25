public class IntoTheWhiled {
    public static void main(String[] args) {
        String str = "empanadas are great";

        int index = 0;
        while (index < str.length()){
            char letter = str.charAt(index);
            if (letter == 'a'){
                System.out.println(letter);
            } //ends if statement
            index++;
        } //end while loop

        int i = 0;
        String basket = "";
        while (i < str.length()) {
            String letter = str.substring(i, i + 1);
            switch (letter.toLowerCase()){
                case "a", "e", "i", "o", "u":
                    System.out.println(letter + " is a vowel");
                    basket = basket + letter; //basket += letter;
                    break;
                case " ":
                    System.out.println(letter + " is a space");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
            i++;
        }//ends my while loop
        System.out.println(basket);


        //init backwardsIndex
        int backwardsIndex = str.length() - 1;
        //init backwardsBasket
        String backwardsBasket = "";
        //loop
        while (backwardsIndex >= 0) {
            //add to basket
            backwardsBasket += str.substring(backwardsIndex, backwardsIndex + 1);
            //backwardsBasket += str.charAt(backwardsIndex);
            //update index
            backwardsIndex--;
        }
        System.out.println(backwardsBasket);

        int indexForA = 0;
        int count = 0;
        while (indexForA < str.length()){
            //rookie mistake -> int count = 0;
            char currLetter = str.charAt(indexForA);
            if (currLetter == 'a'){ //vowels -> "aeiouAEIOU".indexOf(letter) != -1
                count++;
            }
            indexForA++;
        }
        System.out.println(count + " a's");

        String sentence = "dogs are great, i love dogs, dogs run fast";
        String word = "dogs";
        System.out.println(sentence.length());
        int dogIndex = 0;
        int dogCounter = 0;
        while (dogIndex < sentence.length() - (word.length() - 1)){
            String window = sentence.substring(dogIndex, dogIndex + word.length());
            if (window.equals(word)){
                dogCounter++;
            }
            dogIndex++;
        }
        System.out.println(dogCounter);

        String catsAndDogs = "cat and dog and cats and dogs and cats are losers";
        //do cat and dog appear the same number of times
            //count cat
            //count dog
            //test it-

        int catCount = 0;
        int dogCount = 0;
        int catDogIndex = 0;
        while (catDogIndex < catsAndDogs.length() - 2){
            String animalWindow = catsAndDogs.substring(catDogIndex, catDogIndex + 3);
            if (animalWindow.equals("cat")){
                catCount++;
            } else if (animalWindow.equals("dog")){
                dogCount++;
            }
            catDogIndex++;
        }
        System.out.println(catCount == dogCount);
        
    }
}
