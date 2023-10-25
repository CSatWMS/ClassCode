package Unit3;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = generateSecretNumber();
        int guess = getGuess();
        String result = evaluate(guess, secretNumber);
            //result is going to be "correct", "too high", "too low"
        while (!result.equals("correct")) {
            System.out.println(result);
            guess = getGuess();
            result = evaluate(guess, secretNumber);
        }

        System.out.println("Hooray, you got it");
    }

    public static String evaluate(int guess, int secretNumber){
        if (guess == secretNumber){
            return "correct";
        } else if (guess > secretNumber){
            return "too high";
        } else {
            return "too low";
        }
    }

    public static int getGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a guess: ");
        int guess = Integer.parseInt(scan.nextLine());
        return guess;
    }

    public static int generateSecretNumber(){
        int min = 1;
        int max = 10;
        int number = (int) (Math.random() * (max - min + 1) + min);
        return number;
    }

}
