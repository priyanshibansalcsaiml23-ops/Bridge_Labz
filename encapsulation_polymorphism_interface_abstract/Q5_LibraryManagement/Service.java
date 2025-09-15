package q5_library;

public class LibraryService {
    public void printLoanInfo(LibraryItem item) {
        item.getItemDetails();
        System.out.println("Loan duration (days): " + item.getLoanDuration());
        if (item instanceof Reservable) {
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
        }
    }
}
