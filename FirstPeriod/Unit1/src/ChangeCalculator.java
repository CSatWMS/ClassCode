public class ChangeCalculator {
    public static void main(String[] args) {
        //Our task is to make a change calculator

        //Random cost between 50 and 80, rounded to 2 decimal places

        //You always pay with a $100 bill


        int minAmount = 50;
        int maxAmount = 80;

        double unrounded = Math.random() * (maxAmount - minAmount) + minAmount;

        double cost = Math.round(unrounded * 100) / 100.0;
        System.out.println("$" + cost);

        double changeAmount = 100 - cost;

        System.out.println("I owe you $" + changeAmount);

        int num20s = (int) (changeAmount / 20);

        changeAmount = changeAmount % 20; //all the leftovers after I divide by 20

        //calculate the number of 10s, 5s, and 1s
        //print it out


        int num10s = (int) (changeAmount / 10);
        changeAmount = changeAmount % 10;

        int num5s = (int)(changeAmount / 5);
        changeAmount = changeAmount % 5;

        int num1s = (int) changeAmount;
        changeAmount = changeAmount - num1s;

        System.out.println("20s: " + num20s);
        System.out.println("10s: " + num10s);
        System.out.println("5s: " + num5s);
        System.out.println("1s: " + num1s);



    }
}
