package q5_library;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem book = new Book("B100", "Clean Code", "Robert C. Martin");
        LibraryItem dvd = new DVD("D200", "Inception", "Christopher Nolan");

        LibraryService svc = new LibraryService();
        svc.printLoanInfo(book);
        System.out.println();
        svc.printLoanInfo(dvd);
    }
}
