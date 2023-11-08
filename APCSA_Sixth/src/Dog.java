public class Dog {
    //Instance Variables
        //private dataType varName;
    private String name;
    private int numLegs;
    private String breed;
    private boolean isHungry;

    //Constructor(s)
        //public ClassName(parameters related to instance variables)
    public Dog(String n, int nL, String b, boolean iH){
        name = n;
        numLegs = nL;
        breed = b;
        isHungry = iH;
    }

    //Instance methods

    //GOAL: greet a person
    public void greet(){
        System.out.println("Hello! My name is " + name + " and I am SO HAPPY TO MEET YOU");
    }

    //GOAL: Write an eat method
        //dogs should eat when theyre hungry
        //when they're done eating, they're no longer hungry
    public void eat(){
        if (isHungry){
            System.out.println("NOM NOM NOM");
            isHungry = false;
        } else {
            System.out.println("**runs away**");
        }
    }


    //Specific types of instance methods
        //accessor methods (getters)
        //mutator methods (setters)

    //getter formula:
        //public dataType getInstanceVarName() { return instanceVarName; }
    public boolean getIsHungry(){
        return isHungry;
    }

    //GOAL: create getters for all instance variables
    public String getName(){
        return name;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public String getBreed(){
        return breed;
    }

    //setter formula:
        //public void setInstVarName(dataType newInstanceVarName)
        //  { instanceVarName = newInstanceVarName;}

    public void setName(String newName){
        name = newName;
    }

    public void setNumLegs(int newLegs){
        numLegs = newLegs;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public void setIsHungry(boolean newHungry){
        isHungry = newHungry;
    }

    //GOAL: code escape()
        //should print something like "I'm FREE!"
        //and now they're hungry
    public void escape(){
        System.out.println("I'm FREE!");
        if (isHungry){
            System.out.println("I'm ALREADY SO HUNGRY :'(");
        } else {
            isHungry = true;
        }
    }
}
