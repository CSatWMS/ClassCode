public class IfPractice {

    public static void main(String[] args) {

        /*
        if (cond1){
            //do thing 1
        } else if (cond2){
            //do thing 2
        } else if (cond3){
            //do thing 3
        }
        ...
        else {
            //catch all
        }
         */

        /*
        sequential if satements
        if (cond1){
            //do thing 1
        }
        if (cond2){
            //do thing 2
        }
        if (cond3) {
            //do thing 3
        }
         */
        System.out.println(letterGrade1(85));
        System.out.println(letterGrade2(85));
    } //ends main method

    //GOAL: Given a windSpeed, determine the level of hurricane
    static int hurricane(int windSpeed){
        return -1;
    }

    //GOAL: Given a number grade, I want to determine the letter grade
    //second try: we're going to use else ifs
    static String letterGrade2(int grade){
        String letterGradeAnswer = "";

        if (grade >= 90){
            letterGradeAnswer = "A";
        } else if (grade >=80){
            letterGradeAnswer = "B";
        } else if (grade >= 70){
            letterGradeAnswer = "C";
        } else {
            letterGradeAnswer = "F";
        }

        return letterGradeAnswer;
    }

    //GOAL: Given a number grade, I want to determine the letter grade
    //first try: we're going to use sequential ifs
    static String letterGrade1(int grade){
        String letterGradeAnswer = "";
        if (grade >= 90){
            letterGradeAnswer = "A";
        }
        if (grade >= 80 && grade < 90){
            letterGradeAnswer = "B";
        }
        if (grade >= 70 && grade < 80){
            letterGradeAnswer = "C";
        }
        if (grade < 70){
            letterGradeAnswer = "F";
        }
        return letterGradeAnswer;
    }

} //ends the file/class
