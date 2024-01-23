package Unit3;

import java.util.Scanner;

public class WhileAndScanner {
    public static void main(String[] args) {
        //Initialization
        //while (condition)
            //do something
            //update on the loop variable

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Enter your guest names, or 'quit' to stop");
        String guestName = scan.nextLine();
        String guestList = "";
        while (!guestName.equals("quit")){
            guestList += guestName + ", ";
            System.out.println("Enter your guest names, or 'quit' to stop");
            guestName = scan.nextLine();
        }
        System.out.println("You have invited: " + guestList);
        */

        //sum numbers until they enter a '0'
        boolean keepGoing = true;
        int total = 0;
        int numberOfNumbers = 0;

        while (keepGoing){
            System.out.println("Enter a number to add, or '0' to stop");
            int number = Integer.parseInt(scan.nextLine());
            if (number == 0){
                keepGoing = false;
            } else {
                total += number;
                numberOfNumbers++;
            }
        }
        System.out.println("Sum: " + total);
        System.out.println("Avg: " + total / numberOfNumbers);
    }
}
