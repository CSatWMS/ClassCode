public class PairODice {
    //instance variables
        //private dt varName;
    private int die1, die2;

    //constructors
        //public ClassName(parameters)
    public PairODice(int die1, int die2){
        this.die1 = die1;
        this.die2 = die2;
    }

    public PairODice(){
        //TODO: Random!
        roll();
    }

    //instance methods
        //public returnType methodName(parameters)
            //can play with instance variables
    public void roll(){
        //TODO: Random!
        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    //getTotal
    public int getTotal(){
        return die1 + die2;
    }

    //isDoubles
    public boolean isDoubles(){
        return die1 == die2;
    }

    //toString
    public String toString(){
        String toReturn = "";
        toReturn += "Die1: " + die1;
        toReturn += ", Die2: " + die2;
        if (die1 == 1 && die2 == 1){
            toReturn += ", SNAKE EYES!";
        } else if (die1 == 6 && die2 == 6){
            toReturn += ", Box Cars!!";
        }
        return toReturn;
    }

    //static methods
        //public static returnType methodName(params)
            //cannot play with instance variables
}
