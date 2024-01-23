package Unit2;

public class IfPractice {
    public static void main(String[] args) {
        /*
        else ifs vs sequential ifs

        if (cond1){
            do thing 1
        } else if (cond2){
            do thing 2
        } else if (cond3){
            do thing 3
        } else {
            catch all
        }

        if (cond1){
            do thing 1
        }
        if (cond2){
            do thing 2
        }
        if (cond3){
            do thing 3
        }else {
            catch all
        }
         */
        System.out.println(letterGrade1(85));
        System.out.println(letterGrade2(85));


    } //ends the main method

    static String numberType(int number){
        if (number == 0){
            return "ZERO IS EVEN";
        } else if (number > 0){
            if (number % 2 == 0){
                return "POS and EVEN";
            } else {
                return "POS and ODD";
            }
        } else if (number < 0){
            if (number % 2 == 0){
                return "NEG and EVEN";
            } else {
                return "NEG and ODD";
            }
        }
        return "SHOULD NEVER HAPPEN";
    }

    static int hurricaneCat(int windSpeed){
        return -1;//student demos
    }

    //GOAL: given a number grade, convert to a letter grade
        //using else ifs
    static String letterGrade2(int numberGrade){
        String letter = "";
        if (numberGrade >= 90){
            letter = "A";
        } else if (numberGrade >= 80){
            letter = "B";
        } else if (numberGrade >= 70){
            letter = "C";
        } else {
            letter = "F";
        }
        return letter;
    }

    //GOAL: given a number grade, convert to a letter grade
        //using sequential ifs
    static String letterGrade1(int numberGrade){
        String letter = "";
        if (numberGrade >= 90){
            letter = "A";
        }
        if (numberGrade >= 80 && numberGrade < 90){
            letter = "B";
        }
        if (numberGrade >= 70 && numberGrade < 80){
            letter = "C";
        }
        if (numberGrade < 70){
            letter = "F";
        }
        return letter;
    }


} //ends the file/class
