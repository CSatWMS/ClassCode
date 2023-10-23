package Unit3;

import java.util.Scanner;

public class ScannerAndWhile {
    public static void main(String[] args) {
        //initialization
        //while (condition)
            //do something
            //update that variable

        //Can we compile a guest list
        Scanner scan = new Scanner(System.in);

        System.out.println("Who do you want to invite?");
        String guestName = scan.nextLine();
        String guestList = "";
        while (!guestName.equals("quit")){
            guestList += guestName + ", ";
            System.out.println("Who do you want to invite?");
            System.out.println("Enter 'quit' to stop");
            guestName = scan.nextLine();
        }
        if (guestList.length() > 0){
            System.out.println("You have invited: " + guestList.substring(0, guestList.length() - 2));
        } else {
            System.out.println("No friends :(");
        }


        //prompt for numbers and calculate the sum of those numbers
        boolean keepGoing = true;
        int total = 0;
        while (keepGoing){
            System.out.println("Enter a number, or '0' to stop");
            int nextNumber = Integer.parseInt(scan.nextLine());
            if (nextNumber == 0){
                keepGoing = false;
            } else {
                total += nextNumber;
            }
        }
        System.out.println("Sum: " + total);



    }
}
