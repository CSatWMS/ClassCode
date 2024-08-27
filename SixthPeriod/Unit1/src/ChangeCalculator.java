public class ChangeCalculator {
    public static void main(String[] args) {
        //we are calculating change from a random cost between 50 and 80 dollars
            //the customer always pays with $100
            //we need 20s, 10s, 5s, 1s

        //calculate a random cost between 50 and 80, rounded to the nearest penny

        int minAmount = 50;
        int maxAmount = 80;

        double unrounded = Math.random() * (maxAmount - minAmount) + minAmount;
        double cost = Math.round(unrounded * 100) / 100.0;
        System.out.println("$" + cost);

        double changeAmount = 100 - cost;
        System.out.println("I owe you: " + changeAmount);

        int num20s = (int) (changeAmount / 20);
        System.out.println("20s: " + num20s);
        changeAmount = changeAmount % 20;
        

    }
}
