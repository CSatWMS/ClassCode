public class BankConsortium {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jeff Be$o$", 35000000000.0);
        BankAccount b2 = new BankAccount("Bubba");
        b1.withdraw(100);
        b2.deposit(47);
        System.out.println(b1);
        System.out.println(b2);

        SavingsAccount s1 = new SavingsAccount("Ms Snyder", 50, 0.05);
        //s1.setOwnerName("Ms. Christina Snyder");
        //s1.deposit(50);
        System.out.println(s1);
        //how many times do I compound before I get $1000000
        int count = 0;
        //Loop?
        while (s1.getBalance() < 1000000){
            //compound?
            s1.compoundInterest();
            count++;
        }
        System.out.println(count);


    }
}
