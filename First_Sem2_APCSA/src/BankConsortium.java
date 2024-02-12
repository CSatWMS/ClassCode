public class BankConsortium {
    public static void main(String[] args) {
        BankAccount richGuy = new BankAccount(1000000);
        BankAccount lessRichGuy = new BankAccount();
        System.out.println(richGuy);
        System.out.println(lessRichGuy);

        SavingsAccount s1 = new SavingsAccount(300, 0.02);
        System.out.println(s1);
        s1.deposit(5000);
        s1.withdraw(20);
        System.out.println(s1);

        //GOAL: How many times do I have to compound
            //before I have $1,000,000
        int counter = 0;
        while (s1.checkBalance() < 1000000){
            counter++;
            s1.compoundInterest();
        }
        System.out.println(counter);

        //BankConsortium craziness = new BankConsortium();

    }
}
