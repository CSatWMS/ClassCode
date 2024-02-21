public class SuperHero extends Specials {

    private boolean hasSideKick;

    public SuperHero(String name, int str, int def, String pOB, String gender, boolean isOrphan){
        super(name, str, def, pOB, gender, isOrphan);
        hasSideKick = false;
    }

    public void interactWith(ComicCharacter other){

        if (other instanceof SuperHero){
            //other.isOrphan();
            Specials specialVersion = (Specials) other;
            SuperHero heroVersion = (SuperHero) other;
           // String badIdea = (String) other; ClassCastExcpetion
            if (heroVersion.isOrphan() && this.isOrphan()){
                System.out.println(heroVersion.getName() + " and " + this.getName() + " TEAM UP!");
            } else if (heroVersion.isOrphan() && !this.isOrphan()){
                System.out.println(this.getName() + " HUGS orphan " + heroVersion.getName());
            } else if (this.isOrphan() && !heroVersion.isOrphan()){
                System.out.println(heroVersion.getName() + " HUGS orphan " + this.getName());
            } else {
                System.out.println(heroVersion.getName() + " and " + this.getName() + " TEAM UP!");
            }
        }
    }

}
