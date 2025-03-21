public class SideKick extends SideCharacter implements Fighter{
    private MainCharacter boss;

    //all sidekicks are 10/10 important
    public SideKick(String name, String gender, int age, String occupation, MainCharacter boss){
        super(name, gender, age, boss.getUniverse(), occupation, 10);
        this.boss = boss;
    }

    public Fighter fight(Fighter other){
        //other is not a comic character
        if ( ! (other instanceof ComicCharacter)){
            System.out.println("You don't belong here");
            return null;
        }
            //
        //other is another side kick
        else if (other instanceof SideKick){
            //we wanted their bosses to fight
            return this.boss.fight( ((SideKick) other).boss);
        }else {
            //other is a MainCharacter
            if (((ComicCharacter) other).getName().equals(boss.getName())){
                return boss;
            } else if (other instanceof GoodGuy){
                return this;
            } else if (other instanceof BadGuy){
                return other;
            } else{
                return this;
            }
        }
            //if theyre my boss
            //if theyre a goodguy
            //if theyre a badguy
    }


}
