import java.util.Scanner;

public class WhileAndScanner {
    public static void main(String[] args) {
        //make the scanner
        Scanner scan = new Scanner(System.in);
        //prompt
        System.out.println("Enter numbers to be added, just hit 'return' to quit");
        //retrieve that response
        String response = scan.nextLine();
        int basket = 0;
        double counter = 0;
        while (response.length() > 0){
            int number = Integer.parseInt(response);
            basket += number;
            counter++;
            response = scan.nextLine();
        }
        System.out.println("The sum of your numbers is: " + basket);
        System.out.println("The average of your numbers is: " + basket / counter);

        System.out.println("----Welcome to the guessing game!----");
        int secretNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Guess the secret number!");
        System.out.println("Enter a number between 1 and 10");
        int guess = Integer.parseInt(scan.nextLine());
        while (guess != secretNumber){
            if (guess < secretNumber){
                System.out.println("You need to guess higher");
            } else if (guess > secretNumber){
                System.out.println("You need to guess lower");
            }
            guess = Integer.parseInt(scan.nextLine());
        }
        System.out.println("You guess correctly! The secret number was: " + guess);


    }
}
