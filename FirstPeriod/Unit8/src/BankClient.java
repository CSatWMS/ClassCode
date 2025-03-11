public class BankClient {
    public static void main(String[] args) {
        //BankClient weird = new BankClient();
        BankAccount b1 = new BankAccount("Billy", "BOA");
        b1.deposit(500);
        b1.withdraw(200);
        System.out.println(b1);

        SavingsAccount s1 = new SavingsAccount("Sally", "Chase", 0.08);
        s1.deposit(100);
        s1.withdraw(50);
        System.out.println(s1);
        System.out.println("Interest amount: " + s1.compoundInterest());
        System.out.println(s1);

        //how many times does sally need to compound before she has $1000
        int counter = 1;
        while (s1.checkBalance() < 1000){
            counter++;
            s1.compoundInterest();
        }
        System.out.println("to get to $" + String.format("%.2f", s1.checkBalance()) + " we compounded " + counter + " times");


        CheckingAccount c1 = new CheckingAccount("Kevin", "Truist");
        c1.deposit(9999);
        System.out.println(c1);
        c1.deposit(10000);
        System.out.println(c1);
        c1.withdraw(10000);
        System.out.println(c1);
    }
}
