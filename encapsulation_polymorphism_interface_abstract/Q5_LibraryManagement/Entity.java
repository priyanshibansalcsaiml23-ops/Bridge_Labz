package q5_library;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item: " + title + " by " + author + " (ID: " + itemId + ")");
    }
}

interface Reservable {
    boolean reserveItem(String user);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 21; }

    @Override
    public boolean reserveItem(String user) {
        if (available) { available = false; return true; }
        return false;
    }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) { super(itemId, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) { super(itemId, title, author); }
    @Override public int getLoanDuration() { return 3; }
}
