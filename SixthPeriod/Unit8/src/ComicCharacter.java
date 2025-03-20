public abstract class ComicCharacter {
    private String name, gender, occupation, universe;
    private int age;

    public ComicCharacter(String name, String gender, int age, String universe, String occupation){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.universe = universe;
        this.occupation = occupation;
    }

    public abstract void interactWith(ComicCharacter other);

    public void says(String message){
        System.out.println(name + " says " + message);
    }

    public String toString(){
        String toReturn = name + " , from " + universe + " is " + age + " years old.";
        toReturn += "\nThey work as a " + occupation + " and are a " + gender;
        return toReturn;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getUniverse() {
        return universe;
    }

    public int getAge() {
        return age;
    }
}
