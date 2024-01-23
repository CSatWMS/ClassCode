public class ClickerCounter {
    //instance variables
    private String color;
    private int currCount, numDigits;

    //constructor(s)
    public ClickerCounter(String c, int nD){
        color = c;
        numDigits = nD;
        currCount = 0;
    }

    public ClickerCounter(String c, int cc, int nD){
        color = c;
        currCount = cc;
        numDigits = nD;
    }


    //instance methods
    public String toString(){
        String str = currCount + "";
        while (str.length() < numDigits){
            str = "0" + str;
        }
        return color + ": " + str;
    }

    public void click(){
        currCount++;
    }

    public void click(int amtOfClicks){
        currCount += amtOfClicks;
    }

    public void reset(){
        currCount = 0;
    }
}
