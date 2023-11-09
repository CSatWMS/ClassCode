import java.util.Scanner;
public class DogPark {

    //AKA a "client class" or a "runner class"
    public static void main(String[] args) {
        //ClassName objectName = new ClassName(parameter data);
        Dog calebsDog = new Dog("Toby", 4, "French Bulldog", true);
        calebsDog.greet();


        Dog myDog = new Dog("Carrie", 4, "Mutt", true);
        myDog.greet();

        Dog myOtherDog = new Dog("BlackMutt", "Bandit", true);
        Dog stray = new Dog("Lab", 4, false);


        System.out.println(calebsDog.getIsHungry());

        calebsDog.eat();
        calebsDog.eat();

        //System.out.println(calebsDog.isHungry);
        System.out.println(calebsDog.getIsHungry());

        calebsDog.setName("Joe");
        calebsDog.greet();
        calebsDog.escape();

        System.out.println(calebsDog.toString());
        calebsDog.eat();
        System.out.println(calebsDog);
        System.out.println(myOtherDog);
        System.out.println(stray);


       // Scanner scan = new Scanner(System.in);
       // System.out.println(scan);
    }
}
