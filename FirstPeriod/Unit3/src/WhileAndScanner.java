import java.util.Scanner;

public class WhileAndScanner {
    public static void main(String[] args) {
        //make the scanner
        //prompt
        //retreive the input

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers continuously, or just hit return to quit");
        String response = scan.nextLine();
        int basket = 0;
        int counter = 0;
        while (!response.equals("")){
            int number = Integer.parseInt(response);
            basket += number;
            counter++;
            response = scan.nextLine();
        }
        System.out.println("The sum of your numbers is: " + basket);
        System.out.println("The avg of your numbers is: " + basket / counter);


        int secretNumber = (int) (Math.random() * 10 + 1);
        
    }
}
