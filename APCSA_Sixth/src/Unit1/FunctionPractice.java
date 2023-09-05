package Unit1;

public class FunctionPractice {
    public static void main(String[] args) {
        double boiling = f2c(212);
        System.out.println(boiling);

        System.out.println(c2f(100));

        convert(10000);
    }

    static double f2c(double f){
        return (f - 32) * (5.0/ 9);
    }
    public static double c2f(double c){
        return (c * 9 / 5) + 32;
    }
    public static void convert(double feet){
        System.out.println(feet * 12);
        System.out.println(feet / 5280);
        System.out.println(feet / 3.28);
    }
}

