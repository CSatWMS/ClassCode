public class SwitchIntro {
    public static void main(String[] args) {
        String dayOfWeek = "R";
        switch (dayOfWeek){
            case "M" , "T" , "W":
                System.out.println("Bored");
                break;
            case "R", "F":
                System.out.println("Happy");
                break;
            case "Sa", "Su":
                System.out.println("Excited!");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }

        String month = "";
        
    }
}
