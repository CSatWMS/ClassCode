public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("The Lorax", "Dr. Suess", "Rainbow", "Picture Book", 30, 10, false);
        Book b2 = new Book("The Bible", "The collective", "Religious", 1504, true);
        System.out.println(b1);
        System.out.println(b2);

        int numBooks = Book.getNumBooksInCollection();
        int totalPages = Book.getTotalNumPagesRead();
        System.out.println(numBooks);
        System.out.println(totalPages);

        while (!b1.isDone()){
            b1.read();
        }

        while (!b2.isDone()){
            b2.read();
        }

        System.out.println(Book.getTotalNumPagesRead());

        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        System.out.println(lib);
        System.out.println(lib.locateByTitle("The Lorax"));
        System.out.println(lib.locateByTitle("Harry Potter"));
    }
}
