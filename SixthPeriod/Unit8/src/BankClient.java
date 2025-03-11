public class BankClient {
    public static void main(String[] args) {
        //BankClient wierd = new BankClient();
        BankAccount b1 = new BankAccount("Sally");
        b1.deposit(500);
        b1.withdraw(10.50);
        System.out.println(b1);

        SavingsAccount s1 = new SavingsAccount("Bob", 0.07);
        s1.deposit(300);
        System.out.println(s1);
        System.out.println("Interest Added: " + s1.compoundInterest());
        System.out.println(s1);

        //how many times do I need to compound before Bob has $5000
        int counter = 1;
        while (s1.checkBalance() < 5000){
            s1.compoundInterest();
            counter++;
        }
        System.out.println("With a balance of $" + String.format("%.2f", s1.checkBalance()) + " Bob compounded " + counter + " times");

        CheckingAccount c1 = new CheckingAccount("Louise");
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        c1.deposit(100);
        System.out.println(c1);
        c1.withdraw(500);
        System.out.println(c1);
        c1.withdraw(500);
    }
}
