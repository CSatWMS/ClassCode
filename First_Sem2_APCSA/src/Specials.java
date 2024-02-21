public abstract class Specials extends ComicCharacter implements Fighter{
    private Power superPower;
    private String catchPhrase;

    public Specials(String name, int str, int def, String pOB, boolean iH, String ability, int rating, String catchPhrase){
        super(name, str, def, pOB, iH);
        superPower = new Power(ability, rating);
        this.catchPhrase = catchPhrase;
    }

    public Specials(String name, int str, int def, String pOB, boolean iH, String catchPhrase){
        super(name, str, def, pOB, iH);
        superPower = null;
        this.catchPhrase = catchPhrase;
    }

    public String toString(){
        String toReturn = super.toString();
        if (superPower != null){
            toReturn += " My super power is " + superPower.getAbility();
        } else {
            toReturn += " I do not have super powers.";
        }
        return toReturn;
    }

    public void sayCatchPhrase(){
        System.out.println(catchPhrase);
    }

    public int getToughness(){
        return getStrength() + getDefense();
    }

    public boolean fight(Fighter other){
        if (this.getToughness() >= other.getToughness()){
            return true;
        } else {
            return false;
        }
    }

}
