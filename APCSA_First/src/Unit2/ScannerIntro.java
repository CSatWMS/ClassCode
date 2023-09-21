package Unit2;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        //1. Make the Scanner
        Scanner scan = new Scanner(System.in);
        //2. Prompt the user for a response (a printed question)
        System.out.println("What is your name?");
        //3. Retrieve their response
        String name = scan.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("What is your favorite color?");
        String favColor = scan.nextLine();
        System.out.println(favColor + " is my favorite color too!");

        //GOAL: Calculate number of pets
        System.out.println("How many dogs do you have?");
        String dogs = scan.nextLine();
        System.out.println("How many cats do you have?");
        String cats = scan.nextLine();
        System.out.println("How many fish do you have?");
        String fish = scan.nextLine();

        String pets = dogs + cats + fish;
        System.out.println("You have " + pets + " pets");

        int numDogs = Integer.parseInt(dogs);
        int numCats = Integer.parseInt(cats);
        int numFish = Integer.parseInt(fish);
        int numPets = numDogs + numCats + numFish;
        System.out.println("You have " + numPets + " pets");
            //for doubles -> Double.parseDouble()

        //GOAL: I want to calculate the number of siblings you have
        System.out.println("How many sisters do you have?");
        int numSisters = scan.nextInt();
        System.out.println("How many brothers do you have?");
        int numBrothers = scan.nextInt();
        int numSiblings = numBrothers + numSisters;
        System.out.println("You have " + numSiblings + " siblings");
        scan.nextLine(); //this CLEARS the leftover return
        System.out.println("What is your mom's name?");
        String momsName = scan.nextLine();
        System.out.println("Hi " + momsName);


    }
}
