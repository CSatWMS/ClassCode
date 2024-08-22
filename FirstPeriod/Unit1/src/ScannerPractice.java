import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        //Make our scanner
        Scanner scan = new Scanner(System.in);
        /*
        //prompt
        System.out.println("What is your full name (First Middle Last)");
        //retrieve the name
        String fullName = scan.nextLine();
        System.out.println("Your name is: " + fullName);
        char firstInitial = fullName.charAt(0);
        int spaceSpot = fullName.indexOf(" ");
        char middleInitial = fullName.charAt(spaceSpot + 1);
        String middleAndLast = fullName.substring(spaceSpot + 1);

        int secondSpace = middleAndLast.indexOf(" ");
        char lastInitial = middleAndLast.charAt(secondSpace + 1);
        System.out.println("" + firstInitial + middleInitial + lastInitial);
        */

        //TIP Calculater
        //subtotal
        System.out.println("What is your subtotal?");
        //how do we convert from String -> Double?
            //Double.parseDouble()

        double subtotal = Double.parseDouble(scan.nextLine());
        //tax
        System.out.println("What is your tax percentage?");
        double taxPercentage = Double.parseDouble(scan.nextLine());
        //calculate the total

        double total = subtotal * (taxPercentage/100) + subtotal;
        System.out.println("Your total is $" + total);
        //what's the tip percentage

        System.out.println("What percentage would you like to tip?");

        int tipPercentage = Integer.parseInt(scan.nextLine());
        //calculate the tip amount
        double tipAmount = tipPercentage / 100.0 * total;
        //our final total
        double finalTotal = total + tipAmount;

        System.out.println(finalTotal);

        System.out.println(Math.round(finalTotal*100) / 100.0);

        //Math Methods
        //Math.sqrt(num)
        //Math.round(num)
        //Math.abs(num) -> absolute value
        //Math.pow(base, exponent) -> performs base ^ exponent
        System.out.println(Math.pow(2, 5));
    }

}
