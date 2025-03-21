public class SideCharacter extends ComicCharacter{
    private int importance;

    public SideCharacter(String name, String gender, int age, String universe, String occupation, int importance){
        super(name, gender, age, universe, occupation);
        this.importance = importance;
        //to be limited between 1 and 10
        if (importance > 10){
            this.importance = 10;
        }
        this.importance = Math.max(1, this.importance);
    }

    public void interactWith(ComicCharacter other){
        //goodguys
            //WOW, you're so cool
        //badguys
            //bad guy calls us names
                //we cry
        //other sidecharacters
            //politely say howdy
        if (other instanceof GoodGuy){
            System.out.println("WOW, " + other.getName() + " is SO COOL");
        } else if (other instanceof BadGuy){
            System.out.println(other.getName() + " insults me :'''(");
        } else{
            System.out.println("Howdy neighbor!");
        }
    }

    public String toString(){
        String toReturn = super.toString();
        if (importance<4){
            toReturn += "\nI am trivial";
        } else if (importance < 7){
            toReturn += "\nSomtimes, ya need me";
        } else{
            toReturn += "\nI am vital to the story";
        }
        return toReturn;
    }
}
