package Unit1;

public class FunctionPractice {

    public static void main(String[] args) {
        System.out.println(far2Cel(32));
    }

    static double far2Cel(double far){
        double cel = (far - 32) * 5 / 9;
        return cel;
    }
}
