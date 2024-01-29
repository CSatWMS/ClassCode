public class PairODiceRunner {
    public static void main(String[] args) {
        PairODice roller = new PairODice();
        System.out.println(roller);
        roller.roll();
        System.out.println(roller);
        roller.roll();
        System.out.println(roller);
        int count = 0;
        int totalCount = 0;
        while (count < 3){
            totalCount++;
            roller.roll();
            if (roller.isDoubles()){
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println("It took " + totalCount + " rolls to get three doubles in a row");

    }
}
