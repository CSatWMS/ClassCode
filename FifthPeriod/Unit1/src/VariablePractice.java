public class VariablePractice {
    public static void main(String[] args) {
        int width = 8;
        int height = 3;

        int area = width * height;
        int perim = width + width + height + height;
            perim = width * 2 + height * 2;
            perim = 2 * (width + height);

        System.out.println("My Area Is: " + area);
        System.out.println("The Perimeter is: " + perim);

        //square roots
        double root = Math.sqrt(16);
        System.out.println(root);

        // the ^ is not exponents (it's the bitwise XOR)
        int x = 3;
        int y = 4;
        int xSquared = x*x;
        int ySquared = y*y;
        int underTheRoot = xSquared + ySquared;
        double z = Math.sqrt(underTheRoot);
        System.out.println(z);
        z = Math.sqrt(x*x + y*y);


        int A = 2;
        int B = 2;
        int C = -12;
        double underRoot = B*B - 4*A*C;
        double topPlus = -B + Math.sqrt(underRoot);
        double topMinus = -B - Math.sqrt(underRoot);
        double answerPlus = topPlus / (2 * A);
        double answerMinus = topMinus / (2 * A);
        System.out.println("(" + answerPlus + ", " + answerMinus + ")");

        //Math.PI

    }
}
