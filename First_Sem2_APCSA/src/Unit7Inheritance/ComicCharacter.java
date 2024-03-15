package Unit7Inheritance;

public abstract class ComicCharacter {
    public abstract void interactWith(ComicCharacter other);

    private String name;
    private int strength;
    private int defense;
    private String placeOfBirth;
    private boolean isHuman;

    public ComicCharacter(String name, int str, int def, String pOB, boolean iH){
        this.name = name;
        strength = str;
        defense = def;
        placeOfBirth = pOB;
        isHuman = iH;
    }

    public String toString(){
        String toReturn = "My name is " + name;
        toReturn += " and I was born in " + placeOfBirth;
        toReturn += ". My strength and defense scores are " + strength + " and " + defense;
        String not = " not";
        if (isHuman){
            not = "";
        }
        toReturn += ". I am" + not + " human!";
        return toReturn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }
}
