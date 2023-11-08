public class DogPark {

    //AKA a "client class" or a "runner class"
    public static void main(String[] args) {
        //ClassName objectName = new ClassName(parameter data);
        Dog calebsDog = new Dog("Toby", 4, "French Bulldog", true);
        calebsDog.greet();


        Dog myDog = new Dog("Carrie", 4, "Mutt", true);
        myDog.greet();


        System.out.println(calebsDog.getIsHungry());

        calebsDog.eat();
        calebsDog.eat();

        //System.out.println(calebsDog.isHungry);
        System.out.println(calebsDog.getIsHungry());

        calebsDog.setName("Joe");
        calebsDog.greet();
        calebsDog.escape();
    }
}
