public class VariablePractice {
    public static void main(String[] args) {
        int width = 8;
        int height = 4;
        int area = width * height;
        int perim = width + width + height + height;
            perim = 2*width + 2*height;
            perim = 2 * (width + height);

        System.out.println("The Area Is: " + area);
        System.out.println("The perimeter is: " + perim);

        //square roots
        double answer = Math.sqrt(16);
        System.out.println(answer);

        //square something
        int widthSquared = width * width;
            //width ^ 2 (THIS IS NOT EXPONENTS)
            // ^ is the bitwise XOR

        int x = 3;
        int y = 4;
        int xSquared = x*x;
        int ySquared = y*y;
        int underTheRoot = xSquared + ySquared;
        double z = Math.sqrt(underTheRoot);
        System.out.println("Z: " + z);
        z = Math.sqrt(x*x + y*y);

        int A = 2;
        int B = 2;
        int C = -12;

        int underRoot = B * B - 4*A*C;
        double topPlus = -B + Math.sqrt(underRoot);
        double topMinus = -B - Math.sqrt(underRoot);
        double answerPlus = topPlus / ( 2 * A) ;
        double answerMinus = topMinus / ( 2 * A );

        System.out.println("(" + answerPlus + ", " + answerMinus + ")");


    }
}
