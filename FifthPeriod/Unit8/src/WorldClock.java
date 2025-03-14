public class WorldClock extends Clock{
    private int offset;

    public WorldClock(int offset){
        //super() is still happening
        this.offset = offset;
    }

    public int getHours(){
        int newHour = super.getHours() + offset;
        if (newHour > 12){
            newHour -= 12;
        }
        return newHour;
    }
}
