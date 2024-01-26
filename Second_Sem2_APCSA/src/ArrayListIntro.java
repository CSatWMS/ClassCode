import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Double> highScores = new ArrayList<Double>();
        System.out.println(highScores);
        //mini goal: populate my list with 10 random percentages
        for (int i = 0; i < 10; i++){
            double randomNumber = Math.random() * 100;
            highScores.add(randomNumber);
        }
        System.out.println(highScores);
        double lastHighScore = highScores.get(highScores.size() - 1);
        System.out.println(lastHighScore);
        System.out.println(calcAvg(highScores));
    }

    //GOAL: write a method to calculate an average highscore
    public static double calcAvg(ArrayList<Double> list){
        //init basket
        double basket = 0;
        //loop
        for (int i = 0 ; i < list.size() ; i++){
            //add to the basket
            basket += list.get(i);
        }
        //calc + return the avg
        return basket / list.size();

    }
}
