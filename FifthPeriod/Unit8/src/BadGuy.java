import java.util.ArrayList;

public class BadGuy extends MainCharacter{
    private boolean isOnTheLoose, hasFollowers;
    private int numVictims;

    //all bad guys are green
    public BadGuy(String name, String franchise, String placeOfBirth, int strength, int defense,
                  ArrayList<String> powers, String secretIdentity, String catchPhrase, MainCharacter nemesis,
                  boolean hasFollowers){
        super(name, franchise, placeOfBirth, strength, defense, powers, secretIdentity, catchPhrase, "Green", nemesis);
        this.hasFollowers = hasFollowers;
        isOnTheLoose = true;
        numVictims = 0;
    }

    public void becomeCaptured(){
        isOnTheLoose = false;
    }

    public boolean escape(){
        //50/50 a captured badguy escapes

        if (isOnTheLoose){
            System.out.println("You're already free!");
            return true;
        } else {
            //they are captured
            if (Math.random() < 0.5){
                System.out.println("HOORAY, " + getName() + " escaped");
                isOnTheLoose = true;
                return true;
            } else {
                System.out.println(getName() + "'s escape failed :(");
                return false;
            }
        }
    }

    public void interactWith(ComicCharacter other){
        //i am a badguy
            //i can interact with a goodguy -> We'll fight
            //i can interact with another badguy ->
                //if we're both in jail, we both try to escape
                //smile mischeviously
            //there's other people
                //victimize()

        if (other instanceof GoodGuy){
            System.out.println("FIGHT FIGHT FIGHT");
            this.fight((Fighter)other);
        } else if (other instanceof BadGuy){
            if (this.isOnTheLoose == false &&  ( (BadGuy)other).isOnTheLoose == false){
                this.escape();
                ( (BadGuy) other).escape();
            } else {
                System.out.println(this.getName() + " smiles at " + other.getName() + " mischievously");
            }
        } else {
            this.victimize(other);
        }

    }

    public void victimize(ComicCharacter other){
        numVictims++;
        System.out.println(this.getName() + " victimizes " + other.getName());
    }


}
