public class Book {
    private String title, author, color, genre;
    private int numPages, currPage;
    private boolean isPaperback;

    private static int numBooksInCollection = 0;
    private static int totalNumPagesRead = 0;

    private static final double taxRate = 0.075;
    

    public Book(String title, String author, String color, String genre, int numPages, int currPage, boolean isPaperback){
        this.title = title;
        this.author = author;
        this.color = color;
        this.genre = genre;
        this.numPages = numPages;
        this.currPage = currPage;
        this.isPaperback = isPaperback;
        numBooksInCollection++;
    }

    public Book(String title, String author,String genre, int numPages, boolean isPaperback){
        this(title, author, "N/A", genre, numPages, 0, isPaperback);
    }

    //public void setInstanceVariable(dataType newInstanceVariableName) { instVar = newInstVar; }
    //public void setIV(dataType IV) { this.IV = IV;}
    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setCurrPage(int currPage){
        this.currPage = currPage;
    }

    //public dataType getIV() {return IV; }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        String toReturn = this.title + " by " + this.author;
        toReturn += "\n";
        toReturn += currPage + "/" + numPages + " pages read";
        return toReturn;
    }

    //GOAL: read the book, say: turning from page 1 to page 2
    public void read(){
        System.out.println("Turning from page " + currPage + " to page " + (currPage + 1));
        currPage++;
        totalNumPagesRead++;
    }

    public static int getNumBooksInCollection(){
        return numBooksInCollection;
    }

    public static int getTotalNumPagesRead(){
        //System.out.println(currPage); No instance variables in static methods
        return totalNumPagesRead;
    }

    public boolean isDone(){
        return numPages == currPage;
    }
}
