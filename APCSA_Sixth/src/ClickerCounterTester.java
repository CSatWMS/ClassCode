public class ClickerCounterTester {
    public static void main(String[] args) {
        //ClassName varName = new ClassName(data);
        ClickerCounter c1 = new ClickerCounter("blue", 4);
        ClickerCounter c2 = new ClickerCounter("red", 1000, 15);

        c1.click();
        c2.click(15);
        c2.reset();
        System.out.println(c1);
        System.out.println(c2);
    }
}
