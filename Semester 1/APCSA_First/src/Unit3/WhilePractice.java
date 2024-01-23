package Unit3;

public class WhilePractice {
    public static void main(String[] args) {
        String sentence = "Poison Is Bad";


        char letter = 'X';
        boolean isCapital = letter >= 'A' && letter <= 'Z';

        //access every letter
        int i = 0;
        String basket = "";
        while (i < sentence.length()){
            char let = sentence.charAt(i);
            if (let >= 'A' && let <= 'Z'){
                System.out.println(let);
                basket += let;
            }
            i++;
        }
        System.out.println("CAPS:" + basket);
        //test it for caps
        //save it if necessary

        

    }
}
