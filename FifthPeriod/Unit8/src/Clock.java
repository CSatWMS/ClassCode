public class Clock {
    //java.time.LocalTime.now().toString()

    public int getHours(){
        int hours =  java.time.LocalTime.now().getHour();
        if (hours > 12){
            hours -= 12;
        }
        return hours;
    }

    public int getMinutes(){
        return java.time.LocalTime.now().getMinute();
    }

    public String getTime(){
        return "Hour: " + getHours() + ", Minutes: " + getMinutes();
    }

}
