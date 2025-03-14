public class Clock {
    //java.time.LocalTime.now().toString()

    public String getHours(){
        return java.time.LocalTime.now().toString().substring(0, 2);
    }

    public String getMinutes(){
        return java.time.LocalTime.now().toString().substring(3, 5);
    }

    public String getTime(){
        return getHours() + ":" + getMinutes();
    }
}
