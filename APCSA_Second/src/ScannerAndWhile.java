import java.util.Scanner;

public class ScannerAndWhile {
    public static void main(String[] args) {
        //initialize something
        //while (condition)
            //do something
            //update that variable

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Who do you want to invite? (Or enter 'quit' to stop)");
        String guestName = scan.nextLine();
        String guestList = "";
        while (!guestName.equals("quit")){
            //if we make it here, it's not quit
            guestList += guestName + ", ";
            System.out.println("Who do you want to invite? (Or enter 'quit' to stop)");
            guestName = scan.nextLine();
        }
        System.out.println("You have invited: " + guestList);
        */

        //sum some numbers
        boolean keepGoing = true;
        int total = 0;
        int counter = 0;
        while (keepGoing){
            System.out.println("Enter a number, or '0' to quit");
            int number = Integer.parseInt(scan.nextLine());
            if (number == 0){
                keepGoing = false;
            } else {
                total += number;
                counter++;
            }
        }
        System.out.println("Sum: " + total);
        System.out.println("Avg: " + total / counter);


    }
}
