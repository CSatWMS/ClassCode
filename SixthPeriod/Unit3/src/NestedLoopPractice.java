public class NestedLoopPractice {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /*
        String start = "";
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                start = "*?*?*?*";
            } else {
                 start = "?*?*?*?";
                }
                for (int j = 0; j < 5; j++ ) {
                    System.out.print(start.charAt(j));
                }
            System.out.println();
            }
        }*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("?");
                }
            }
            System.out.println();
        }
    }
}
