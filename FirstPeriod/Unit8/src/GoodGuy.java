import java.util.ArrayList;

public class GoodGuy extends MainCharacter {
    private String teamName;
    private ArrayList<MainCharacter> teamMembers;

    public GoodGuy(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                   String secretIdentity, String catchPhrase, ArrayList<String> powers, boolean hasSideKick,
                   String teamName){
        super(name, age, series, placeOfBirth, strength, health, charisma, secretIdentity, catchPhrase, powers, hasSideKick);
        this.teamName = teamName;
        teamMembers = new ArrayList<MainCharacter>();
    }

    public void interactWith(ComicCharacter other){
        //with another teamMember
            //loop over teamMembers
            //compare teamNames
        if (other instanceof GoodGuy){
            if ( ((GoodGuy) other).teamName.equals(this.teamName)){
                System.out.println("HUGS ALL AROUND");
            } else{
                System.out.println("A fist bump for you <3");
            }
        } else {
            System.out.println("Head Nod");
        }
        //if he's another goodGuy
        //otherwise
    }

}
