package Unit7;

public class SuperHero extends Specials {
    private boolean hasSideKick;

    public SuperHero(String name, int strength, int defense, String favColor, String catchPhrase){
        super(name, strength, defense, favColor, true, catchPhrase);
        hasSideKick = false;
    }

    public void interactWith(ComicCharacter other){
        if (other instanceof SuperHero){
            System.out.println(this.getName() + " TEAMS UP WITH " + other.getName());
            this.setStrength(this.getStrength() + 1);
            other.setStrength(other.getStrength() + 1);
            this.sayCatchPhrase();
            ( (SuperHero) other).sayCatchPhrase(); //( (Unit7.Specials) other).sayCatchPhrase(); also okay
        }
    }
}
