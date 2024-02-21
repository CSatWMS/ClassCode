public abstract class Specials extends ComicCharacter implements Fighter{
    private boolean isOrphan;

    public Specials(String name, int str, int def, String pOB, String gender, boolean isOrphan){
        super(name, str, def, pOB, gender);
        this.isOrphan = isOrphan;
    }

    public boolean isOrphan() {
        return isOrphan;
    }

    public void setOrphan(boolean orphan) {
        isOrphan = orphan;
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

    public String toString(){
        String toReturn = super.toString();
        if (isOrphan){
            toReturn += " I have no parents :(";
        } else {
            toReturn += " My parent(s) LIVE";
        }
        return toReturn;
    }
}
