public class ClockTester {
    public static void main(String[] args) {
        Clock c = new Clock();
        System.out.println(c.getTime());

        WorldClock wc = new WorldClock(6);
        System.out.println(wc.getTime());
        System.out.println(wc.getMinutes());
    }
}
