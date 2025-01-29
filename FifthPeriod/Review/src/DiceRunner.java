public class DiceRunner {
    public static void main(String[] args) {
        PairODice dice1 = new PairODice(1, 1);
        System.out.println(dice1);
        System.out.println(dice1.getDie1());
        System.out.println(dice1.getDie2());
        dice1.roll();
        System.out.println(dice1);

        PairODice dice2 = new PairODice();
        System.out.println(dice2);

        //How many turns until JAIL?
        int turnCounter = 0;
        int doubleStreak = 0;
        while (doubleStreak < 3){
            //roll
            dice2.roll();
            //test
            if (dice2.isDoubles()){
                doubleStreak++;
            } else {
                doubleStreak = 0;
            }
            //update turn counter
            turnCounter++;
        }
        System.out.println(turnCounter);
    }
}
