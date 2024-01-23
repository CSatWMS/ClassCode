public class Library {
    private Book[] books;

    public Library(){
        books = new Book[10];
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

    public Book locateByTitle(String targetTitle){
        for (Book b : books){
            if (b != null){
                if (b.getTitle().equals(targetTitle)){
                    return b;
                }
            }
        }
        return null;
    }

    public String toString(){
        String toReturn = "";
        for (Book b : books){
            toReturn += b;
            toReturn += "\n-------------------\n";
        }
        return toReturn;
    }
}
