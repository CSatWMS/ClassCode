public class VariablePractice {
    public static void main(String[] args) {
        int width = 17;
        int height = 8;
        int area = width * height;
        int perim = width + width + height + height;
            perim = 2 * width + 2 * height;
            perim = 2 * (width + height);
        System.out.println("Area is: " + area);
        System.out.println("Perimter is: " + perim);

        double root = Math.sqrt(16);
        System.out.println(root);

        //x ^ 2 does not mean squared...
        int x = 5;
        int y = 7;
        int xSquared = x * x;
        int ySquared = y * y;
        int underRoot = xSquared + ySquared;
        double z = Math.sqrt(underRoot);
            z = Math.sqrt(x*x + y*y);

        int A = 1;
        int B = -2;
        int C = -15;

        int fourAC = 4 * A * C;
        double under = B * B - fourAC;
        double topPlus = -B + Math.sqrt(under);
        double topMinus = -B - Math.sqrt(under);
        double answerPlus = topPlus / (2 * A);
        double answerMinus = topMinus / (2 * A);
        System.out.println("(" + answerPlus + ", " + answerMinus + ")");
        //Math.PI

        int h = 7;
        int r  = 3;


    }

}
