public class ChangeCalculator {
    public static void main(String[] args) {
        //our goal is to make change from a random cost, out of a $100

        //we need a random cost
            // between 50 and 80, rounded to 2 decimal places

        int minAmount = 50;
        int maxAmount = 80;

        double unrounded = Math.random() * (maxAmount - minAmount) + minAmount;
        double cost = Math.round(unrounded * 100) / 100.0;
        System.out.println("$" + cost);

        //the customer always pays with a $100 bill

        double changeAmount = 100 - cost;
        System.out.println("I owe you: $" + changeAmount);

        int num20s = (int) (changeAmount / 20);
        System.out.println("20s: " + num20s);
        changeAmount = changeAmount % 20;

        int num10s = (int) (changeAmount / 10);
        System.out.println("10s: " + num10s);
        changeAmount = changeAmount % 10;

        int num5s = (int) (changeAmount / 5);
        System.out.println("5s: " + num5s);
        changeAmount = changeAmount % 5;

        int num1s = (int) changeAmount;
        System.out.println("1s: " + num1s);


    }
}
