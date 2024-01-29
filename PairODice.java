public class PairODice {

    private int die1, die2;

    public PairODice(){
        die1 = 1;
        die2 = 1;
    }

    public void roll(){
        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    public int getTotal(){
        return die1 + die2;
    }

    public String toString(){
        String toReturn = "";
        toReturn += "(" + die1 + ", " + die2 + ") -> " + getTotal();
        if (die1 == 1 && die2 == 1){
            toReturn += ", That's Snake Eyes!";
        } else if (die1 == 6 && die2 == 6){
            toReturn += ", That's Box Cars!";
        } else if (die1 == die2){
            toReturn += ", That's Doubles!";
        }
        return toReturn;
    }

    public boolean isDoubles(){
        return die1 == die2;
    }
}
