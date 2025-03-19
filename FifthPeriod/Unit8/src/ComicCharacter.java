public abstract class ComicCharacter {
    private String name, franchise, placeOfBirth;
    private int strength, defense;
    private boolean isAlive;

    public ComicCharacter(String name, String franchise, String placeOfBirth, int strength, int defense){
        this.name = name;
        this.franchise = franchise;
        this.placeOfBirth = placeOfBirth;
        this.strength = strength;
        this.defense = defense;
        isAlive = true;
    }

    public String getName(){
        return name;
    }

    public void die(){
        isAlive = false;
    }

    public abstract void interactWith(ComicCharacter otherDude);

    public String toString(){
        String toReturn = name + ", born in " + placeOfBirth + " of " + franchise + ", \nis " + strength + "/10 strong and";
        toReturn += "\nhas a " + defense + "/10 defense score";
        toReturn += "\nThey are " + (isAlive ? "alive!" : "dead :(");
        return toReturn;
    }

    public String getFranchise() {
        return franchise;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
