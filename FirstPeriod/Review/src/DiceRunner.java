public class DiceRunner {
    public static void main(String[] args) {
        PairODice dice1 = new PairODice(6, 6);
        System.out.println(dice1);
        dice1.roll();
        System.out.println(dice1);

        PairODice dice2 = new PairODice();
        System.out.println(dice2);
        System.out.println(dice2.getDie1());
        System.out.println(dice2.getDie2());

        int totalCounter = 0;
        int doubleStreak = 0;
        while (doubleStreak < 3){
            dice2.roll();
            totalCounter++;
            if (dice2.isDoubles()){
                doubleStreak++;
            } else {
                doubleStreak = 0;
            }
        }
        System.out.println("It took: " + totalCounter + " rolls for Jail!");
    }
}
