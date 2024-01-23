public class Library {
    private Book[] books;

    public Library(){
        books = new Book[10];
    }

    public String toString(){
        String toReturn = "";
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                toReturn += "Empty Slot";
            } else {
                toReturn += books[i].toString();
            }
            toReturn += "\n------------------\n";
        }
        return toReturn;
    }

    public boolean addBook(Book toAdd){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                books[i] = toAdd;
                return true;
            }
        }
        return false;
    }

    public String listTitles(String author){
        String toReturn = "";
        for (Book b : books){
            if (b != null){
                if (b.getAuthor().equals(author)){
                    toReturn += b.getTitle() + ", ";
                }
            }
        }
        return toReturn;
    }

    public String listTitles(){
        String toReturn = "";
        for (Book b : books){
            if ( b != null){
                toReturn += b.getTitle() + ", ";
            }
        }
        return toReturn;
    }

    public Book findBookByTitle(String targetTitle){
        for (Book b : books){
            if (b != null){
                if (b.getTitle().equals(targetTitle)){
                    return b;
                }
            }
        }
        return null;
    }
}
