public class BookTester {
    public static void main(String[] args) {
        System.out.println(Book.totalNumBooksCreated);
        Book b1 = new Book("The Lorax", "Dr. Suess", true, 30, 10);
        System.out.println(Book.totalNumBooksCreated);
        Book b2 = new Book("Harry Potter", "JK Rowling", false, 450);
        System.out.println(Book.totalNumBooksCreated);
        System.out.println(b1);
        System.out.println(b2);
        b1.read();
        System.out.println(Book.getTotalNumPagesReadEVER());
        b2.read();
        System.out.println(Book.getTotalNumPagesReadEVER());


        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        System.out.println(lib);
        System.out.println(lib.findBookByTitle("The Lorax"));
        System.out.println(lib.findBookByTitle("THe cat in the hat"));
    }
}
