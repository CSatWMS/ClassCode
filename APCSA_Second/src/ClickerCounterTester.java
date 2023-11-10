public class ClickerCounterTester {
    public static void main(String[] args) {
        ClickerCounter c1 = new ClickerCounter(6);
        ClickerCounter c2 = new ClickerCounter(14, 300);

        System.out.println(c1);
        System.out.println(c2);
        c2.reset();
        c2.click();
        c2.click(7);
        System.out.println(c2);

        ClickerCounter c3 = new ClickerCounter(2, 99);
        c3.click(996);
        System.out.println(c3);
    }
}
