public class WhilePractice {
    public static void main(String[] args) {
        //basket = basket + something

        String sentence = "Will you dance with me? Will you please?";
        int i = 0;
        int counter = 0;
        while (i < sentence.length()){
            String letter = sentence.substring(i, i + 1);
            if (letter.equalsIgnoreCase("w")){
                counter++; //counter += 1 //counter = counter + 1
            }
            i++;
        }
        System.out.println(counter + " w's");

        int index = 0;
        int youCount = 0;
        while (index < sentence.length() - (3-1)){
            String piece = sentence.substring(index, index + 3);
            if (piece.equals("you")){
                youCount++;
            }
            System.out.println(piece);
            index++;
        }
        System.out.println(youCount);
    }
}
