public class DiceRunner {
    public static void main(String[] args) {
        PairODice d1 = new PairODice(1, 1);
        System.out.println(d1);
        d1.roll();
        System.out.println(d1);
    }
}
