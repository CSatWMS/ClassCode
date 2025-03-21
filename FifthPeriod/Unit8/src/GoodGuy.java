import java.util.ArrayList;

public class GoodGuy extends MainCharacter{
    private String teamName;
    private ArrayList<MainCharacter> teamMembers;
    private boolean hasSideKick;

    public GoodGuy(String name, String franchise, String placeOfBirth, int strength, int defense,
                   ArrayList<String> powers, String secretIdentity, String catchPhrase, String color,
                   MainCharacter nemesis, boolean hasSideKick, String teamName){
        super(name, franchise, placeOfBirth, strength, defense, powers, secretIdentity, catchPhrase, color, nemesis);
        this.hasSideKick = hasSideKick;
        this.teamName = teamName;
        teamMembers = new ArrayList<MainCharacter>();
    }

    public void interactWith(ComicCharacter other){
        if (other instanceof BadGuy) {
            ((BadGuy) other).becomeCaptured();
        } else {
            System.out.println(this.getName() + " smiles and waves at " + other.getName());
        }
    }

    public String fight(Fighter other){
        String result = super.fight(other);
        if (result.equals("TIE!")){
            if (Math.random() > .7){
                return this.getName();
            } else {
                return ((ComicCharacter) other).getName();
            }
        } else {
            return result;
        }
    }
}
