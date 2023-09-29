import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //generate the secret number
        //use scanner to retreive their guess
        //compare guess to number

        int secretNumber = generateSecretNumber();
        int guessNumber = getGuess();
        String resultOfCheck = check(guessNumber, secretNumber);
        while (!resultOfCheck.equals("correct")){
            System.out.println(resultOfCheck);
            guessNumber = getGuess();
            resultOfCheck = check(guessNumber, secretNumber);
        }
        System.out.println("HOORAY! You got it!");

    }

    //write a check function:
        //returns "correct" "too high" or "too low"
    public static String check(int guess, int secret){
        if (guess == secret){
            return "correct";
        } else if (guess > secret){
            return "too high";
        } else {
            return "too low";
        }
    }

    public static int getGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = Integer.parseInt(scan.nextLine());
        return number;
    }

    public static int generateSecretNumber(){
        int min = 1;
        int max = 10;
        int secret = (int) (Math.random() * (max- min + 1) + min);
        return secret;
    }
}
