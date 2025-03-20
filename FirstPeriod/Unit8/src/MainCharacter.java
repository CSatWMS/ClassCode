import java.util.ArrayList;

public abstract class MainCharacter extends ComicCharacter implements Fighter{
    private String secretIdentity, catchPhrase;
    private ArrayList<String> powers;
    private boolean hasSideKick;

    public MainCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                         String secretIdentity, String catchPhrase, ArrayList<String> powers, boolean hasSideKick){
        super(name, age, series, placeOfBirth, strength, health, charisma);
        this.secretIdentity = secretIdentity;
        this.catchPhrase = catchPhrase;
        this.powers = powers;
        this.hasSideKick = hasSideKick;
    }

    public MainCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                         String secretIdentity, String catchPhrase,  boolean hasSideKick){
        //no super powers
        this(name, age, series, placeOfBirth, strength, health, charisma, secretIdentity, catchPhrase, null, hasSideKick);
    }

    public MainCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                         String catchPhrase, ArrayList<String> powers, boolean hasSideKick){
        //no secret identity
        this(name, age, series, placeOfBirth, strength, health, charisma, name, catchPhrase, powers, hasSideKick);
    }

    /*
    overloading issues
    public MainCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                         String secretIdentity, ArrayList<String> powers, boolean hasSideKick){
        //no catchphrase
        this(name, age, series, placeOfBirth, strength, health, charisma, name, catchPhrase, powers, hasSideKick);
    }
     */

    public void sayCatchPhrase(){
        System.out.println(catchPhrase);
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nTheir secret identity is " + secretIdentity;
        if (powers == null){
            toReturn += " and they have no super powers";
        } else {
            toReturn += " and their super power" + (powers.size() == 1 ? " is" : "s are ");
            for (int i = 0; i < powers.size(); i++){
                toReturn += powers.get(i);
                if (i < powers.size() - 1){
                    toReturn += ", ";
                }
            }
            toReturn += ".";
        }
        toReturn += "They " + (hasSideKick ? "" : "don't ") + "have a side kick";
        return toReturn;
    }

    public Fighter fight(Fighter other){
        // variable instanceof ClassName
        if ( ! (other instanceof ComicCharacter)){
            System.out.println("You have no business here");
            return null;
        }
        ComicCharacter otherDude = (ComicCharacter) other;
        //strength
        if (this.getStrength() > otherDude.getStrength()){
            return this;
        } else if (otherDude.getStrength() > this.getStrength()){
            //return otherDude;
            return other; //return (Fighter) otherDude;
        }
        //strengths are tied
        //charisma
        if (this.getCharisma() > otherDude.getCharisma()){
            return this;
        } else if (otherDude.getCharisma() > this.getCharisma()){
            //return otherDude;
            return other; //return (Fighter) otherDude;
        }
        //charismas are tied

        //powers
        //we both have powers
            //50/50
        //neither of us have powers
            //50/50
        //only one of us has powers

        //if the other guy is not a main character, he CANNOT have powers
        if (! (otherDude instanceof MainCharacter)){
            //other dude no powers
            if (this.powers != null){
                return this;
            } else{
                //50/50
            }

        } else {
            //otherDude MUST BE mainCharacter
            MainCharacter otherMain = (MainCharacter) otherDude;
            if (this.powers == null && otherMain.powers == null){
                //50/50
            } else if (this.powers != null && otherMain.powers == null){
                return this;
            } else if (this.powers == null && otherMain.powers != null){
                return other;
            } else {
                //we both have powers
                //50/50
            }
        }

        if (Math.random() > 0.5){
            return this;
        } else {
            return other;
        }
    }
}
