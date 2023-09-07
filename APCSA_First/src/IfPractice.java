public class IfPractice {
    public static void main(String[] args) {

        /*
        if (cond1){
            do thing 1
        } else if (cond2){
            do thing 2
        } else if (cond3){
            do thing 3
        } else {
            catch all
        }

        sequential ifs
        if (cond1){
            do thing 1
        }
        if (cond2){
            do thing 2
        }
        if (cond3){
            do thing 3
        } else {
            "catch all" (but not really...)
        }

         */
        System.out.println(letterGrade1(85));
        System.out.println(letterGrade1(55));
        System.out.println(letterGrade2(85));
        System.out.println(letterGrade2(55));
    } //ends my main method

    //GOAL: determine if a number is pos/neg and even/odd
    static String numberType(int number){
        if (number >= 0){
            if (number % 2 == 0){
                return "POS and EVEN";
            } else {
                return "POS and ODD";
            } //ends the litte else
        } else {
            //I know I'm negative
            if (number % 2 == 0){
                return "NEG and EVEN";
            } else {
                return "NEG and ODD";
            } //ends the little else
        } //ends my big else
    }

    //GOAL: Given a number grade, determine the letter grade
        //else ifs
    static String letterGrade2(int number){
        String letter = "";
        if (number >= 90){
            letter = "A";
        } else if (number >= 80){
            letter = "B";
        } else if (number >= 70){
            letter = "C";
        } else {
            letter = "F";
        }
        return letter;
    }


    static int hurricanCat(int windSpeed){
        return -1;
    }
    //GOAL: Given a number grade, determine the letter grade
        //sequential ifs
    static String letterGrade1(int number){
        String letter = "";
        if (number >= 90){
            letter = "A";
        }
        if (number >= 80 && number < 90){
            letter = "B";
        }
        if (number >= 70 && number < 80) {
            letter = "C";
        }
        if (number < 70){
            letter = "F";
        }
        return letter;
    }

} //ends the file/class
