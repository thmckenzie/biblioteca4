import java.io.PrintStream;
import java.util.List;


public class Biblioteca {
    private List<Book> books;
    private PrintStream printStream;

    public Biblioteca(List<Book> books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void listBooks() {
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
