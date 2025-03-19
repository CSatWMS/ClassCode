import java.util.ArrayList;

public abstract class MainCharacter extends ComicCharacter implements Fighter{
    private ArrayList<String> powers;
    private String secretIdentity, catchPhrase, color;
    private MainCharacter nemesis;

    public MainCharacter(String name, String franchise, String placeOfBirth, int strength, int defense, ArrayList<String> powers, String secretIdentity, String catchPhrase, String color, MainCharacter nemesis){
        super(name, franchise, placeOfBirth, strength, defense);
        this.powers = powers;
        this.secretIdentity = secretIdentity;
        this.color = color;
        this.catchPhrase = catchPhrase;
        this.nemesis = nemesis;
    }

    public MainCharacter(String name, String franchise, String placeOfBirth, int strength, int defense, String secretIdentity, String catchPhrase, String color, MainCharacter nemesis){
        //no powers
        this(name, franchise, placeOfBirth, strength, defense, null, secretIdentity, catchPhrase, color, nemesis);
    }

    public MainCharacter(String name, String franchise, String placeOfBirth, int strength, int defense, ArrayList<String> powers, String catchPhrase, String color, MainCharacter nemesis){
        //no secret identity
        this(name, franchise, placeOfBirth, strength, defense, powers, name, catchPhrase, color, nemesis);
    }
    public MainCharacter(String name, String franchise, String placeOfBirth, int strength, int defense, ArrayList<String> powers, String secretIdentity, String catchPhrase, String color){
        //no nemesis
        this(name, franchise, placeOfBirth, strength, defense, powers, secretIdentity, catchPhrase, color, null);
    }

    public void sayCatchPhrase(){
        System.out.println(catchPhrase);
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nTheir secret identity is " + secretIdentity + ", and they like to wear " + color;
        if (powers == null){
            toReturn += "\nThey have no super powers";
        } else {
            toReturn += "\nTheir power" + (powers.size() > 1 ? "s are" : " is");
            for (int i = 0; i < powers.size(); i++){
                toReturn += powers.get(i);
                if (i < powers.size() - 1) {
                    toReturn += ", ";
                }
            }
            toReturn += ".";
        }
        toReturn += (nemesis == null ? "\nThey have no arch enemies" : "Their nemesis is " + nemesis.getName());
        return toReturn;
    }

    public String fight(Fighter other){
        if ( !(other instanceof ComicCharacter)){
            return "You have no business here!";
        }
        ComicCharacter otherDude = (ComicCharacter) other;
        //int otherStrength = ( (ComicCharacter) other).getStrength();
        if (this.getStrength() > otherDude.getStrength()){
            return this.getName();
        } else if (otherDude.getStrength() > this.getStrength()){
            return otherDude.getName();
        } else {
            if (this.getDefense() > otherDude.getDefense()){
                return this.getName();
            } else if (otherDude.getDefense() > this.getDefense()){
                return otherDude.getName();
            } else {
                return "TIE!";
            }
        }

    }
}
