import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //using Scanner to retrieve information from a user

        //1. Make the Scanner
        //2. Prompt the user with a question
        //3. Retrieve that user input

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What is your favorite food?");
        String favFood = scan.nextLine();
        System.out.println("Yum! I love " + favFood + " too!");

        //ask how many sisters do you have?
        //how many brothers do you have?
        //write a sentence
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();
        System.out.println("How many brothers do you have?");
        String brothers = scan.nextLine();
        System.out.println("You have " + sisters + " sisters and " + brothers + " brothers");

        String siblings = sisters + brothers;
        System.out.println("You have " + siblings + " siblings");

        int numSisters = Integer.parseInt(sisters);
        int numBrothers = Integer.parseInt(brothers);
        int numSiblings = numSisters + numBrothers;
        System.out.println("You have " + numSiblings + " siblings");

        //how many dogs
        System.out.println("How many dogs do you have?");
        String dogs = scan.nextLine();
        int numDogs = Integer.parseInt(dogs);
        //how many cats
        System.out.println("How many cats do you have?");
        int numCats = Integer.parseInt(scan.nextLine());
        //how many fish
        System.out.println("How many fish do you have?");
        int numFish = scan.nextInt(); //DANGEROUS

        //calculate the number of pets
        int numPets = numDogs + numCats + numFish;
        System.out.println("You have " + numPets + " pets");


    }
}
