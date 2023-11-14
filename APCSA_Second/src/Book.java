public class Book {
    private String title, author;
    private boolean isHardBack;
    private int numPages, currPage;

    public Book(String title, String author, boolean isHardBack, int numPages, int currPage){
        this.title = title;
        this.author = author;
        this.isHardBack = isHardBack;
        this.numPages = numPages;
        this.currPage = currPage;
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
}
