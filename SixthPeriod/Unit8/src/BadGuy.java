public class BadGuy extends MainCharacter {
    private int numCrimes;
    private boolean isOnTheLoose;

    public BadGuy(){
        super("BadGuyName", "BadGuyGender",  -2 , "Bad Place", "Bad Job", "DO EVIL", "Evil pwoers", "ur mom", "Bad Guys rule");
        numCrimes =0;
        isOnTheLoose = false;
    }

    public void interactWith(ComicCharacter other){

    }

    public Fighter fight(Fighter other){
        if (Math.random() < 0.5){

            return this;
        } else {
            return other;
        }
    }
}
