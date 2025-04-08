public class SideCharacter extends ComicCharacter{
    private int importance;

    public SideCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma, int importance){
        super(name, age, series, placeOfBirth, strength, health, charisma);
        this.importance = importance;
    }

    public void interactWith(ComicCharacter other){
        if (other instanceof GoodGuy){
            System.out.println("Let's high five");
        } /*else if (other instanceof BadGuy){
            System.out.println("Let's run and hide");
        } */ else {
            System.out.println("Smile and Wave");
        }
    }
}
