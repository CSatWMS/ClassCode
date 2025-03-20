public abstract class MainCharacter extends ComicCharacter implements Fighter{
    //instance variables
    private String motivation, powers, secretIdentity, catchPhrase;
    //appropriate constructor
    public MainCharacter(String name, String gender, int age, String universe, String occupation, String motivation, String powers, String secretIdentity, String catchPhrase){
        super(name, gender, age, universe, occupation);
        this.motivation = motivation;
        this.powers = powers;
        this.secretIdentity = secretIdentity;
        this.catchPhrase = catchPhrase;
    }

    public MainCharacter(String name, String gender, int age, String universe, String occupation, String motivation, String secretIdentity, String catchPhrase){
        //no powers
        this(name, gender, age, universe, occupation, motivation, null, secretIdentity, catchPhrase);
    }
/*
need unique parameter data types
    public MainCharacter(String name, String gender, int age, String universe, String occupation, String motivation, String powers, String catchPhrase){
        //no powers
        this(name, gender, age, universe, occupation, motivation, null, secretIdentity, catchPhrase);
    }
 */
    //sayCatchPhrase()
    public void sayCatchPhrase(){
        System.out.println(catchPhrase);
    }
    //update your toString()
    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nWith a motivation of " + motivation + ", " + secretIdentity + " says " + catchPhrase + "!";
        toReturn += "\n" + (powers == null ? "They have no super powers." : "Their powers are " + powers + ".");
        return toReturn;
    }

}
