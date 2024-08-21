import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //Retrieve information from the USER using a Scanner

        //1. Make the Scanner
        //2. Prompt the user with a question
        //3. Retrieve the input

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!"); //concatenation (gluing things together)

        //ask what their favorite food is
        System.out.println("What is your favorite food?");
        //respond appropriately
        String favFood = scan.nextLine();
        System.out.println("Wow, " + favFood + " is awesomeee");

        //ask about number of brothers
        //and number of sisters
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();
        System.out.println("How many brothers do you have?");
        String brothers = scan.nextLine();

        System.out.println("You have " + sisters + " sisters and " + brothers + " brothers");
        String siblings = sisters + brothers;
        System.out.println("You have " + siblings + " siblings");

        int numSisters = Integer.parseInt(sisters);
        int numBrothers = Integer.parseInt(brothers);
        int numSiblings = numBrothers + numSisters;
        System.out.println("You have " + numSiblings + " siblings");


        //how many cats
        System.out.println("How many cats do you have?");
        String cats = scan.nextLine();
        int numCats = Integer.parseInt(cats);
        //ask for how many dogs
        System.out.println("How many dogs do you have?");
        int numDogs = Integer.parseInt(scan.nextLine());
        //how many fish
        System.out.println("How many fish do you have?");
        int numFish = scan.nextInt(); //DANGER
        //calculate number of pets
        int pets = numDogs + numCats + numFish;
        System.out.println("You have " + pets + " pets!");

        System.out.println("What's your favorite color");
        String color = scan.nextLine();
    }
}
