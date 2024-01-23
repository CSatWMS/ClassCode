public class DogPark {
    public static void main(String[] args) {
        //The file where you create objects is often called:
            //client class, a runner class, or a driver class/ tester

        //To create an object:
            //ClassName objName = new ClassName(data for IV);
        Dog littleDog = new Dog("Copper", 4, "ChiDascMix", 10, 0.01, true);
        littleDog.greet();

        Dog bigDog = new Dog("Bruce", 8, "PitBull", 35, .98, false);
        bigDog.greet();

        littleDog.chew();
        bigDog.chew();

        System.out.println(littleDog.getAge());
        System.out.println(bigDog.getAge());

        littleDog.setName("Candy");
        littleDog.greet();

        Dog dude = new Dog(2, "lab", 25, .2, true);
        dude.greet();

        System.out.println(littleDog);
        System.out.println(bigDog);

    }
}
