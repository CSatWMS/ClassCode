public class Book {
    private String title, author;
    private boolean isHardBack;
    private int numPages, currPage;

    public static int totalNumBooksCreated = 0;
    private static int totalNumPagesReadEVER = 0;

    public Book(String title, String author, boolean isHardBack, int numPages, int currPage){
        this.title = title;
        this.author = author;
        this.isHardBack = isHardBack;
        this.numPages = numPages;
        this.currPage = currPage;
        totalNumBooksCreated++;
    }

    public Book(String title, String author, boolean isHardBack, int numPages){
        this(title, author, isHardBack, numPages, 1);
    }

    //public void setIV(dataType newIV) { IV = newIV;}
    //public void setIV(dataType IV) { this.IV = IV; }
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setCurrPage(int currPage){
        this.currPage = currPage;
    }

    public String toString(){
        String toReturn = this.title + " by " + this.author;
        toReturn += "\n";
        toReturn += currPage + "/" + numPages + " pages read";
        return toReturn;
    }

    public boolean isDone(){
        return currPage == numPages;
    }

    //Turning from page 1 to page 2
    public void flipPage(){
        System.out.println("Turning from page " + currPage + " to page " + (currPage + 1));
        currPage++;
        totalNumPagesReadEVER++;
    }

    public static int getTotalNumPagesReadEVER(){
        //System.out.println(title);
        //Instance variable CANNOT be referenced in STATIC methods
        //Static variables can be used in instance methods
        return totalNumPagesReadEVER;
    }

    public void read(){
        while (!isDone()){
            this.flipPage();
        }
    }
}
