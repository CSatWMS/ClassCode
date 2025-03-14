public class WorldClock extends Clock{
    private int offset;

    public WorldClock(int offset){
        //implied call to super();
        this.offset = offset;
    }

    public String getHours(){
        int hours = Integer.parseInt(super.getHours()) + offset;
        //hours %= 12;
        if (hours > 12){
            hours -= 12;
        }
        return hours + "";
    }

    public String getMinutes(){
        return "" + (Integer.parseInt(super.getMinutes()) + 5);
    }
}
