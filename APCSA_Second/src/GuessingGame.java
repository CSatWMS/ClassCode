import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = generateSecretNumber();
        int guess = getGuess();
        String result = check(guess, secretNumber);
            //result -> correct, too high, too low
        while (guess != secretNumber){
            System.out.println(result);
            guess = getGuess();
            result = check(guess, secretNumber);
        }
        System.out.println("Hooray, you got it!");
    }

    public static String check(int guess, int secret){
        if (guess == secret){
            return "correct";
        } else if (guess < secret){
            return "too low";
        } else {
            return "too high";
        }
    }

    public static int getGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a guess");
        int guess = Integer.parseInt(scan.nextLine());
        return guess;
    }

    public static int generateSecretNumber(){
        int min = 1;
        int max = 10;
        int secret = (int) (Math.random() * (max-min + 1) + min);
        return secret;
    }
}
