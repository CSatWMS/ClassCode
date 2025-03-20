public abstract class ComicCharacter {
    //Finish all the instance variables, the constructor, and make a toString()
    private String name, series, placeOfBirth;
    private int age, strength, charisma, health;

    public ComicCharacter(String name, int age, String series, String placeOfBirth, int strength, int health, int charisma){
        this.name = name;
        this.age = age;
        this.series = series;
        this.placeOfBirth = placeOfBirth;
        this.strength = strength;
        if (strength > 10) {
            this.strength = 10;
        } else if (strength < 0){
            this.strength = 0;
        }
        this.health = health;
        this.health = Math.min(100, this.health);
        this.health = Math.max(0, this.health);
        this.charisma = charisma;
        this.charisma = Math.min(10, this.charisma);
        this.charisma = Math.max(0, this.charisma);
    }

    public void sleep(){
        System.out.println("ZZZZzzzZZZZzzz");
    }

    public abstract void interactWith(ComicCharacter other);

    public String toString(){
        String toReturn = name + ", from " + series + ", was born in " + placeOfBirth + " and is " + age + " years old.";
        toReturn += "\nTheir strength, charisma, and health scores are " + strength + ", " + charisma + ", and " + health + " respectively.";
        return toReturn;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public int getStrength() {
        return strength;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHealth() {
        return health;
    }
}
