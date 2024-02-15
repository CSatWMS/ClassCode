public class BankAccount implements Measurable{
     private double balance;
     private String ownerName;

     public BankAccount(String ownerName, double balance){
         this.ownerName = ownerName;
         this.balance = balance;
     }

     public BankAccount(String ownerName){
         this(ownerName, 0);
     }

     public BankAccount(){
         this("Unknown", 0);
     }

     public double getMeasure(){
         return balance;
     }

     public void deposit(double amt){
         balance += amt;
     }

     public void withdraw(double amt){
         balance -= amt;
     }

     public String toString(){
         return ownerName + " has $" + balance;
     }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
