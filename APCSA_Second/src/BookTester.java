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

    }
}
