public class Dog {
    //Instance Variables
        //private dataType varName;
    private String name;
    private int age;
    private int numLegs;
    private int amtOfFluffiness;


    //Constructor(s)
        //public ClassName(parameter data about IV)
    public Dog(String n, int a, int nL, int amt){
        name = n;
        age = a;
        numLegs = nL;
        amtOfFluffiness = amt;
    }

    //GOAL: write a greet method, for our dog
    public void greet(){
        System.out.println("Hello! My name is " + name + " and I AM SO HAPPY TO MEET YOU!");
    }

    //GOAL: Running as a behavior
        //4 -> run super fast
        //3 -> i'll get there eventually
        //2 -> i'm wheeling over there
        //1-> you come to me
    public void run(){
        if (numLegs == 4){
            System.out.println("I CAN RUN SO FAST!");
        } else if (numLegs == 3){
            System.out.println("I'll get there eventually...");
        } else if (numLegs == 2){
            System.out.println("I'm wheeling over there!");
        } else {
            System.out.println("You can come to me...");
        }
    }

    //code barking...
        //fluffiness -> 1 to 10
            // 2 or less
            // 3 to 6
            // 6 or more
    public void bark(){
        if (amtOfFluffiness <= 2){
            System.out.println("BARK!");
        } else if (amtOfFluffiness <= 6){
            System.out.println("Woof.");
        } else {
            System.out.println("**smiles**");
        }
    }

    //accessor methods
        //getters
    //mutator methods
        //setters

    //getter formula:
        //public DataType getInstanceVarName() { return instanceVarName; }
    public int getAge(){
        return age;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public int getAmtOfFluffiness(){
        return amtOfFluffiness;
    }

    public String getName(){
        return name;
    }

    //setter formula:
        //public void setInstVarName(dataType newInstVarName){
            //instVar = newInstVar;

    public void setName(String newName){
        name = newName;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }

    public void setNumLegs(int newNumLegs){
        numLegs = newNumLegs;
    }

    public void setAmtOfFluffiness(int newAmt){
        amtOfFluffiness = newAmt;
    }



}
