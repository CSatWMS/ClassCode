public class GoodGuy extends MainCharacter{
    private boolean hasSideKick;

    public GoodGuy(String name, String gender, int age, String universe, String occupation, String motivation, String powers, String secretIdentity, String catchPhrase, boolean hasSideKick){
        super(name, gender, age, universe, occupation, motivation, powers, secretIdentity, catchPhrase);
        this.hasSideKick = hasSideKick;
    }

    public void saveLives(){
        System.out.println("Another life saved, hooray!");
    }

    public void interactWith(ComicCharacter other){
        // variable instanceof ClassName
        if (other instanceof GoodGuy){
            //we want to high five
            System.out.println(this.getName() + " high fives " + other.getName());
        } else {
            System.out.println("I haven't met you yet");
        }
    }

    public Fighter fight(Fighter other){
        //the this is ALWAYS a good guy
        if (other instanceof GoodGuy){
            System.out.println("Don't fight, we're friends :(");
            return null;
        }  /*
        else if (other instanceof SideKick){
            //ten percent chance, SideKick wins
            if (Math.random() < 0.10){
                return other;
            } else {
                return this;
            }
        }
        */
        else {
            return this;
        }
    }
}
