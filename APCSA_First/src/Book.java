public class Book {
    private String title, author, coverColor, dateOfPub;
    private int currPage, totalPages;
    private boolean isOpen;

    private static int totalNumPagesReadEVER = 0;
    public static int totalNumBOOKS = 0;

    public Book(String title, String author, String coverColor, String dateOfPub, int currPage, int totalPages, boolean isOpen){
        this.title = title;
        this.author = author;
        this.coverColor = coverColor;
        this.dateOfPub = dateOfPub;
        this.currPage = currPage;
        this.totalPages = totalPages;
        this.isOpen = isOpen;
        //System.out.println("**** IN THE CONSTRUCTOR ***");
        //System.out.println(this.toString());
        totalNumBOOKS++;
    }

    public Book(String title, String author, String coverColor, int totalPages, boolean isOpen){
        this(title, author, coverColor, "Unknown", 0, totalPages, isOpen);
    }

    public String toString(){
        String toReturn = title + " by " + author;
        toReturn += "\n";
        toReturn += currPage + "/" + totalPages + " pages read so far";
        return toReturn;
    }

    //public void setIV(dataType newIV) {IV = newIV;}
    //public void setIV(dataType IV) {this.IV = IV; }
    public void setTitle(String title){
        this.title = title;
    }

    public void setCurrPage(int currPage){
        this.currPage = currPage;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public boolean isDone(){
        return currPage == totalPages;
    }

    //GOAL: to say: "Turning from page 1 to page 2"
    public void flipPage(){
        System.out.println("Turning from page " + currPage + " to page " + (currPage + 1));
        currPage++;
        totalNumPagesReadEVER++;
    }

    public static int getTotalNumPagesReadEVER(){
        //System.out.println(title);
        //instance variables CANNOT EVER BE in static methods
        //Static varibales CAN be in instance methods
        return totalNumPagesReadEVER;
    }

    public void read(){
        while (!this.isDone()){
            this.flipPage();
        }
    }


}
