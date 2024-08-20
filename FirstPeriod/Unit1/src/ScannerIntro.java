import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //Scanner Three Steps
        //1. Create the Scanner
        //2. Prompt the User for some info
        //3. Retrieve that info

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("What is your favorite food?");
        String favFood = scan.nextLine();
        System.out.println("YUM! " + favFood + " is a great food!");

        //how many sisters?
        //how many brothers?
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();

        System.out.println("How many brothers do you have?");
        String brothers = scan.nextLine();

        System.out.println("You have " + sisters + " sisters and " + brothers + " brothers");


        String siblings = sisters + brothers; //concatenation (not addition)
        System.out.println("You have " + siblings + " siblings");

        int numSisters = Integer.parseInt(sisters);
        int numBrothers = Integer.parseInt(brothers);
        int numSiblings = numBrothers + numSisters;
        System.out.println("You have " + numSiblings + " siblings");

        //how many cats
        //how many dogs
        //how many fish
        //calculate number of pets
    }
}
