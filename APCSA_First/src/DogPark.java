public class DogPark {
    //this is called a client, runner, or driver class
    public static void main(String[] args) {
        //ClassName varName = new ClassName(data);
        Dog dog1 = new Dog("Bandit", 5, 4, 2);
        dog1.setName("Boston");
        dog1.greet();

        Dog dog2 = new Dog("Copper", 4, 2, 1);
        dog2.greet();

        dog1.run();
        dog2.run();

        dog1.bark();
        dog2.bark();

        System.out.println(dog1.getAge());
    }
}
