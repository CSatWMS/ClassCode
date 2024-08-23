import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("What is your full name? (first middle last)");

        String fullName = scan.nextLine();
        System.out.println("Your name is: " + fullName);

        char firstInitial = fullName.charAt(0);
        System.out.println(firstInitial);
        int spaceSpot = fullName.indexOf(" ");
        char middleInitial = fullName.charAt(spaceSpot + 1);
        System.out.println(middleInitial);

        String justMiddleLast = fullName.substring(spaceSpot + 1);
        int spaceSpot2 = justMiddleLast.indexOf(" ");
        char lastInitial = justMiddleLast.charAt((spaceSpot2 + 1));
        System.out.println(lastInitial);
        System.out.println("Your intials are: " + firstInitial + middleInitial + lastInitial);
        */
        /*
        outside of scope

        char test = 97;
        System.out.println(test + 1);
        System.out.println((char) (test + 1));
        */

        //Tip Calculator


        //Total -> subtotal + taxAmount
        //ask for subtotal
        System.out.println("What is your subtotal?");
        String subtotalSTRING = scan.nextLine();
        double subtotal = Double.parseDouble(subtotalSTRING);
        //ask for the tax percent/decimal
        System.out.println("What is the tax percentage?");
        double taxPercentage = Double.parseDouble(scan.nextLine());
        double total = taxPercentage/100 * subtotal + subtotal;

        //ask how much we want to tip (20% 22% 15%)
        System.out.println("What percentage would you like to tip?");
        int tipPercentage = Integer.parseInt(scan.nextLine());
        double tipAmount = total * (tipPercentage / 100.0);
        double finalTotal = total + tipAmount;
    }
}
