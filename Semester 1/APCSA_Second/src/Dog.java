public class Dog {
    //instance variables
        //private DataType varName;
    private String name;
    private int age;
    private String breed;
    private int weight;

    private double obedienceLevel;

    private boolean hasTail;

    //Constructor(s)
        //public ClassName(parameters related to the instance variables)
    public Dog(String n, int a, String b, int w, double oL, boolean hT){
        name = n;
        age = a;
        breed = b;
        weight = w;
        obedienceLevel = oL;
        hasTail = hT;
    }

    //overloading
    public Dog(int a, String b, int w, double oL, boolean hT){
        age = a;
        breed = b;
        weight = w;
        obedienceLevel = oL;
        hasTail= hT;
        name = "buddy";
    }

    public Dog(String n, int a, int w, double oL, boolean hT){
        age = a;
        breed = "mixed";
        weight = w;
        obedienceLevel = oL;
        hasTail= hT;
        name = n;
    }

    //GOAL: create a greet() method
    public void greet(){
        System.out.println("Hello, my name is " + name + " and I AM SO EXCITED TO MEET YOU!");
    }

    //GOAL: code chew() where less obedient dogs chew more
        //top third -> i know better
        //middle third -> if it's tasty, I chew.
        //bottom third -> chewing everything
    public void chew(){
        if (obedienceLevel >= .66){
            System.out.println("I know better, I don't chew things");
        } else if (obedienceLevel >= .33){
            System.out.println("If it's tasty, I will chew it.");
        } else {
            System.out.println("NOM NOM NOM");
        }
    }


    //accessor methods
        //getter
    //mutator methods
        //setter

    //getter formula:
        //public DataType getInstVarName() { return instVarName; }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getWeight(){
        return weight;
    }

    public double getObedienceLevel(){
        return obedienceLevel;
    }

    public boolean getHasTail(){
        return hasTail;
    }

    //setter formula:
        //public void setInstVarName(dataType newInstVarName){
            //instVarName = newInstVarName;

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setObedienceLevel(double newOL){
        obedienceLevel = newOL;
    }

    public void setHasTail(boolean newTail){
        hasTail = newTail;
    }


    //toString()
    public String toString(){
        String toReturn = "";
        toReturn += "Name: " + name;
        toReturn += "\nBreed: " + breed;
        return toReturn;
    }
}
