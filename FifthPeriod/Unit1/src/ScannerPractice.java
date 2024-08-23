import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("What is your full name? (First Middle Last)");
        String fullName = scan.nextLine();

        System.out.println("Your name is: " + fullName);

        char firstInitial = fullName.charAt(0);

        int spaceSpot = fullName.indexOf(" ");
        char middleInitial = fullName.charAt(spaceSpot + 1);

        String justMiddleLast = fullName.substring(spaceSpot + 1);
        int spaceSpot2 = justMiddleLast.indexOf(" ");
        char lastInitial = justMiddleLast.charAt(spaceSpot2 + 1);
        System.out.println("My Initials are: " + firstInitial + middleInitial + lastInitial);
        */

        //Tip Calculator

        //Total Cost -> subTotal + tax
        System.out.print("What is your subtotal?   $");
        double subtotal = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the tax percentage, in decimal form: ");
        double taxDecimal = Double.parseDouble(scan.nextLine());

        //Calcualte + print your total
        double total = subtotal + taxDecimal*subtotal;

        //the tip percentage
        //print a prompt
        System.out.println("Enter your tip percentage, as a whole number");
        //retrieve that information
        int tipPercent = Integer.parseInt(scan.nextLine());
        //perform the calculations
        double tipAmount = tipPercent / 100.0 * total;

        double finalTotal = tipAmount + total;
        System.out.println(finalTotal);
        System.out.println(Math.round(finalTotal * 100) / 100.0);


        //Math Methods
        //Math.sqrt(number) -> returns the squareRoot
        //Math.abs(number) -> returns the absolute value
        //Math.round(number) -> round to the ones place
        //Math.pow(base, exponent) -> return base ^ exponent
            //2 ^ 5 (2 to the 5th)
        System.out.println(Math.pow(2, 5));


    }
}
