package Unit7Inheritance;

public class SuperHero extends Specials{
    private boolean hasSideKick;

    public SuperHero(String name, int str, int def, String pOB, boolean iH, String ability, int rating, String catchPhrase){
        super(name, str, def, pOB, iH, ability, rating, catchPhrase);
        hasSideKick = false;
    }

    public SuperHero(String name, int str, int def, String pOB, boolean iH, String catchPhrase){
        super(name, str, def, pOB, iH, catchPhrase);
        hasSideKick = false;
    }

    public void interactWith(ComicCharacter other){
        if (other instanceof Specials){
            Specials otherSpecialDude = (Specials) other;
            if (otherSpecialDude instanceof SuperHero){
                SuperHero otherSuperHero = (SuperHero) other;
                System.out.println("HI!");
                this.sayCatchPhrase();
                otherSuperHero.sayCatchPhrase();
            }
        }
    }
}









