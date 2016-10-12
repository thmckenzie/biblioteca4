import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        List<Book> books = new ArrayList<>();
        books.add(new Book(printStream, "Title1", "Author1", "Book 1"));
        books.add(new Book(printStream, "Title2", "Author2", "Book 2"));
        books.add(new Book(printStream, "Title3", "Author3", "Book 3"));

        Biblioteca biblioteca = new Biblioteca(books, printStream);
        Application application = new Application(printStream, biblioteca);

        application.start();
    }
}
