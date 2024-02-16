import java.util.ArrayList;
import java.util.Scanner;

public abstract class Specials extends ComicCharacter implements Fighter{
    private ArrayList<String> superPowers;
    private String catchPhrase;

    public Specials(String name, int strength, int defense, String favColor, boolean isHungry, String catchPhrase){
        super(name, strength, defense, favColor, isHungry);
        this.catchPhrase = catchPhrase;
        superPowers = new ArrayList<String>();
        System.out.println("TELL ME YOUR SUPER POWERS (or click return to quit)");
        Scanner scan = new Scanner(System.in);
        String power = scan.nextLine();
        while (power.length() > 0){
            superPowers.add(power);
            power = scan.nextLine();
        }
    }

    //sayCatchPhrase()
    //listSuperPowers()
    //overRide toString() to include... the number of superpowers? (and the catchphrase?)

    public void sayCatchPhrase(){
        System.out.println(catchPhrase);
    }

    public void listSuperPowers(){
        for (String power : superPowers){
            System.out.println(power);
        }
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nI have " + superPowers.size() + " super powers";
        toReturn += "\n" + catchPhrase;
        return toReturn;
    }

    public int getFightScore(){
        return getStrength() + getDefense();
    }

    public Boolean fight(Fighter other){
        //if MY strength is greater than other's defense, I win
        //when i defeat my opponent-> they get hungry
        if (this.getFightScore() > other.getFightScore()){
            // instanceof
            if (other instanceof ComicCharacter) {
                ComicCharacter comicOther = (ComicCharacter) other;
                comicOther.setHungry(true);

              //  ((ComicCharacter) other).setHungry(true);
            }
            return true;
        } else if (this.getFightScore() < other.getFightScore()) {
            //if (this instanceof ComicCharacter){
                this.setHungry(true);
            //}
            return false;
        } else {
            return null;
        }
    }
}
