
public class SideKick extends SideCharacter implements Fighter{
    private MainCharacter mentor;

    public SideKick(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma,
                    int importance, MainCharacter mentor){
        super(name, age, series, placeOfBirth, strength, health, charisma, importance);
        this.mentor = mentor;
    }

    public Fighter fight(Fighter other){
        //sidekick v sidekick
        if (other instanceof SideKick){
            if (this.getStrength() >= ((SideKick) other).getStrength()){
                return this;
            } else {
                return other;
            }
        }
        if (other instanceof MainCharacter) {
            //what if the other is our mentor?
            if (mentor.getName().equals(((MainCharacter) other).getName())) {
                return other;
            }
            //sidekick v goodguy
            if (other instanceof GoodGuy){
                return this;
            }
            //sidekick v badguy
            /*
            if (other instanceof BadGuy){
                return other;
            }
            */
        }

        return null;
    }

}
