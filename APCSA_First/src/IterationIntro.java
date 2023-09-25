public class IterationIntro {
    public static void main(String[] args) {
        //loops
        int number = 5;
        while (number < 10){
            System.out.println("hello-" + number);
            number = number + 1;
        }

        /*
        initialization of variable
        while (condition on variable){
            do something
            update of the variable
        }
         */

        int counter = 0;
        while (counter <= 20){
            System.out.println(counter);
            counter = counter + 2;
        }

        int fives = 5;
        while (fives <= 100){
            System.out.print(fives + " ");
            fives += 5; //fives = fives + 5;
        }
        System.out.println();

        //COUNTDOWN
        int countDownSequence = 10;
        while (countDownSequence > 0){
            System.out.println(countDownSequence);
            countDownSequence -= 1;
        }
        System.out.println("BLASTOFF!");

        String word = "hello";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));

        int index = 0;
        while (index <= word.length()){
            System.out.println(word.charAt(index));
            index++;
        }

        int indexBackwards = word.length() - 1;
        while(indexBackwards >= 0){
            System.out.println(word.charAt(indexBackwards));
            indexBackwards--;
        }
    }

}
