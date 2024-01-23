public class ClickerCounter {
    //instance variables
    private int numClicks, numDigits;

    //constructor(s)
    public ClickerCounter(int numC, int numD){
        numClicks = numC;
        numDigits = numD;
    }

    public ClickerCounter(int numD){
        numDigits = numD;
        numClicks = 0;
    }

    public String toString(){
        String str = numClicks + "";
        while (str.length() < numDigits){
            str = "0" + str;
        }
        return str;
    }

    //click!
    //reset!

    public void click(){
        numClicks+=1;
        wraparound();
    }

    public void reset(){
        numClicks=0;
    }

    public void click(int amountOfClicks){
        numClicks += amountOfClicks;
        wraparound();
    }

    private void wraparound(){
        //when we max digits, wraparound
        //when toString().length > numDigits
        if (toString().length() > numDigits){
            numClicks = Integer.parseInt(toString().substring(toString().length() - numDigits));
        }
    }

}
