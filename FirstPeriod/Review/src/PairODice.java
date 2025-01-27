public class PairODice {
    //instance variables
        //private DT varName;
    private int die1, die2;

    //constructor(s)
        //public ClassName(parameters)
    public PairODice(){
        //roll();
        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);
    }

    public PairODice(int die1, int die2){
        this.die1 = die1;
        this.die2 = die2;
    }

    //instance methods
        //public RT methodName(parameters)
    public void roll(){
        //TODO: Roll the dice
        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    //TODO: toString()
    public String toString(){
        String toReturn = "";
        toReturn += "Die 1 : " + die1;
        toReturn += ", Die 2: " + die2;
        if (die1 == 1 && die2 == 1){
            toReturn += ", Snakeyes!!";
        } else if (die1 == 6 && die2 == 6){
            toReturn += ", BoxCars!";
        }
        return toReturn;
    }

    //TODO: isDoubles()
    public boolean isDoubles(){
        return die1 == die2;
    }
    //static methods
        //can't play with instance variables
        //public static RT methodName(parameters)
}
