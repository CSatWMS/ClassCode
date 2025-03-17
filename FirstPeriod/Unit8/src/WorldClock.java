public class WorldClock extends Clock{
    private int offset;

    public WorldClock(int offset){
        //super(); implied call to super.
        this.offset = offset;
    }

    public String getHours(){
        int newHours = Integer.parseInt(super.getHours()) + offset;
        if (newHours > 12){
            newHours -= 12;
        }
        return newHours + "";
    }
}
