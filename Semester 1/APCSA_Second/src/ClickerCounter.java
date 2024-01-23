public class ClickerCounter {
    //instance variables
    private int maxNumDigits, currNumber;

    //constructor(s)
    public ClickerCounter(int m, int c){
        maxNumDigits = m;
        currNumber = c;
    }

    public ClickerCounter(int m){
        maxNumDigits = m;
        currNumber = 0;
    }

    public String toString(){
        String toReturn = currNumber + "";
        while (toReturn.length() < maxNumDigits){
            toReturn = "0" + toReturn;
        }
        return toReturn;
    }

    public void reset(){
        currNumber = 0;
    }

    public void click(){
        currNumber++;
        wraparound();
    }

    public void click(int amountOfClicks){
        currNumber += amountOfClicks;
        wraparound();
    }

    public void wraparound(){
        //GOAL: get rid of extra digits
        String strVersion = currNumber + "";
        if (strVersion.length() > maxNumDigits){
            strVersion = strVersion.substring(strVersion.length() - maxNumDigits);
            currNumber = Integer.parseInt(strVersion);
        }
    }


}
