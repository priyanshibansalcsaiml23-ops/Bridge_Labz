package q2_library;

public class LibraryMain {
    public static void main(String[] args) {
        Book.setLibraryName("Egmore Library");
        Book.displayLibraryName();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        LibraryService service = new LibraryService();
        service.showBook(book1);
    }
}
