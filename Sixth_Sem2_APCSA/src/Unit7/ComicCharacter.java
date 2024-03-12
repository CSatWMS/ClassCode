package Unit7;

public abstract class ComicCharacter {
    private String name;
    private int strength, defense;
    private String favColor;
    private boolean isHungry;

    public ComicCharacter(String name, int strength, int defense, String favColor, boolean isHungry){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.favColor = favColor;
        this.isHungry = isHungry;
    }

    public String toString(){
        String toReturn = "My name is " +name;
        toReturn += ", my strength is " + strength + ", and my defense is " + defense;
        toReturn += "\n";
        toReturn += "I love the color " + favColor;
        String not = "not ";
        if (isHungry){
            not = "";
        }
        toReturn += " and I am " + not + "hungry";
        return toReturn;
    }

    public abstract void interactWith(ComicCharacter other);

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

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
