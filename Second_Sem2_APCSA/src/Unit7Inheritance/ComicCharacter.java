package Unit7Inheritance;

public abstract class ComicCharacter {
    private String name;
    private int strength;
    private int defense;
    private String placeOfBirth;
    private String gender;

    public ComicCharacter(String name, int str, int def, String pOB, String gender){
        this.name = name;
        strength = str;
        defense = def;
        placeOfBirth = pOB;
        this.gender = gender;
    }

    public abstract void interactWith(ComicCharacter other);

    public String toString(){
        String toReturn = "My name is " + name + " and I am a " + gender;
        toReturn += ". My strength and defense scores are " + strength + " and " + defense;
        toReturn += ". I was born in " + placeOfBirth + "!";
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
