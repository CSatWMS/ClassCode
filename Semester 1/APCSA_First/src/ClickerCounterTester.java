public class ClickerCounterTester {
    public static void main(String[] args) {
        ClickerCounter c1 = new ClickerCounter(50, 15);
        ClickerCounter c2 = new ClickerCounter(6);


        System.out.println(c1);
        c1.click();
        c1.click(5);
        System.out.println(c1);
        c1.reset();

        System.out.println(c1);

        System.out.println(c2);

        ClickerCounter c3 = new ClickerCounter(999, 3);
        c3.click(6);
        System.out.println(c3);
    }
}
