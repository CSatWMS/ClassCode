public class BookTester {
    public static void main(String[] args) {
        System.out.println(Book.totalNumBOOKS);
        Book b1 = new Book("The Lorax", "Dr. Suess", "Mainly Blue", "06/23/1971", 10, 30, true);
        System.out.println(b1);
        System.out.println(Book.totalNumBOOKS);
        Book b2 = new Book("Harry Potter and the chamber of secrets", "JK Rowling", "Mostly Red", 300, true);
        System.out.println(b2);
        System.out.println(Book.totalNumBOOKS);

        System.out.println(Book.getTotalNumPagesReadEVER());
        b1.read();
        System.out.println(Book.getTotalNumPagesReadEVER());
        b2.read();
        System.out.println(Book.getTotalNumPagesReadEVER());

        Library lib = new Library();

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(new Book("The cat and the hat", "Dr. Suess", "blue", 30, true));
        System.out.println(lib);

        Book test1 = lib.findBookByTitle("The Lorax");
        Book test2 = lib.findBookByTitle("The cat in the hat");
        System.out.println(test1);
        System.out.println(test2);
        //System.out.println(test2.getTitle());
        System.out.println(lib.listTitles());
        System.out.println(lib.listTitles("Dr. Suess"));


    }
}
