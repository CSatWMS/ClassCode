public abstract class ComicCharacter {
    //Finish all the instance variables, the constructor, and make a toString()
    private String name;
    private int age;

    public ComicCharacter(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("ZZZZzzzZZZZzzz");
    }

    public abstract void interactWith(ComicCharacter other);
}
