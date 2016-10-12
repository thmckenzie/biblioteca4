import java.io.PrintStream;

public class Book {
    private final String title;
    private final String author;
    private final String year;
    private final PrintStream printStream;

    public Book(PrintStream printStream, String title, String author, String year) {
        this.printStream = printStream;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayBookDetails() {
        printStream.println(title + " | " + author + " | " + year);
    }

}
