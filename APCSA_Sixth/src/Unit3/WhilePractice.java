package Unit3;

public class WhilePractice {
    public static void main(String[] args) {
        /*
        int w = 1;
        while (w > 0){
            System.out.println(w);
            w+=1000;
        }
        */
        //System.out.println(Integer.MAX_VALUE + 1);
        //System.out.println(Integer.MIN_VALUE);

        String sentence = "Will you turn the lights on? Will you please, youth?";
        int i = 0;
        int counter = 0;
        String word = "you";
        while (i < sentence.length() - (word.length() - 1)){
            String window = sentence.substring(i, i + word.length());
            if (window.equals(word)){
                System.out.println(window);
                counter++;
            }
            i++;
        }
        System.out.println(counter);
    }
}
