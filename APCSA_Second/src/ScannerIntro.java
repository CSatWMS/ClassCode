import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //1. Make the Scanner
        Scanner scan = new Scanner(System.in);
        //2. Prompt for a response (ask a question)
        System.out.println("What is your name?");
        //3. Retrieve that response
        String name = scan.nextLine();
        System.out.println("Hello! " + name);

        System.out.println("What is your favorite color?");
        String favColor = scan.nextLine();
        System.out.println(favColor + " is my favorite color too!");

        //GOAL: find out how many pets you have
        System.out.println("How many dogs do you have?");
        String dogs = scan.nextLine();
        System.out.println("How many cats do you have?");
        String cats = scan.nextLine();
        System.out.println("How many fish do you have?");
        String fish = scan.nextLine();

        String pets = dogs + cats + fish; //concatenation

        int numDogs = Integer.parseInt(dogs);
        int numCats = Integer.parseInt(cats);
        int numFish = Integer.parseInt(fish);
        int numPets = numDogs + numCats + numFish;

        System.out.println("You have " + pets + " pets");
        System.out.println("You have " + numPets + " pets");

        //for doubles -> Double.parseDouble()

        System.out.println("How many sisters do you have?");
        int numSisters = scan.nextInt();
        System.out.println("How many brothers do you have?");
        int numBrothers = scan.nextInt();

        int numSiblings = numBrothers + numSisters;
        System.out.println("You have " + numSiblings + " siblings");

        scan.nextLine(); //clears the leftover return

        System.out.println("What is your mom's name");
        String mom = scan.nextLine();
        System.out.println("Mom: " + mom);

    } //ends main method
} //ends class
