import java.lang.reflect.Array;
import java.util.ArrayList;

public class InterfacePlayground {
    public static void main(String[] args) {
        BankAccount A = new BankAccount("A", "BankA");
        A.deposit(200);
        System.out.println(A.getMeasure());

        Measurable m = new BankAccount("M", "BankM");
        //m.deposit(200);
        System.out.println(m.getMeasure());

        ArrayList<Measurable> accounts = new ArrayList<Measurable>();
        accounts.add(new BankAccount("A", "BankA"));
        accounts.add(new BankAccount("B", "BankB"));
        accounts.add(new BankAccount("C", "BankC"));
        accounts.add(new BankAccount("D", "BankD"));

        //ArrayList<ZooAnimals> animals = new ArrayList...;
        System.out.println(getAverageMeasure(accounts));

    }

    public static void sort(ArrayList<Comparable> things){
        //do the sorting with compareTo
    }

    public static int getAverageMeasure(ArrayList<Measurable> things){
        int sum = 0;
        for (Measurable item : things){
            sum += item.getMeasure();
        }
        return sum / things.size();
    }

}
