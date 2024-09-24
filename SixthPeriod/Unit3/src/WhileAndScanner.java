import java.util.Scanner;

public class WhileAndScanner {
    public static void main(String[] args) {
        //make the scanner
        Scanner scan = new Scanner(System.in);
        //a prompt
        System.out.println("Enter numbers to be added, or just return to quit");
        //retreive their response
        String response = scan.nextLine();
        int basket = 0;
        int counter = 0;
        while (response.length() > 0){
            int number = Integer.parseInt(response);
            basket += number;
            counter++;
            System.out.println("Enter numbers to be added, or just return to quit");
            response = scan.nextLine();
        }
        System.out.println("The sum of your numbers is : " + basket);
        System.out.println("The average of your numbers is : " + basket / counter);


        int secretNumber = (int) (Math.random() * 10 + 1);
        System.out.println("Pick a number between 1 and 10");
        int guess = Integer.parseInt(scan.nextLine());
        while (guess != secretNumber){
            if (guess < secretNumber){
                System.out.println("Too Low!");
            } else if (guess > secretNumber){
                System.out.println("Too high!");
            }
            System.out.println("Pick a number between 1 and 10");
            guess = Integer.parseInt(scan.nextLine());
        }
        System.out.println("Correct! The secret number was: " + secretNumber);

    }
}
