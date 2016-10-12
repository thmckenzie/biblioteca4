import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1"));
        books.add(new Book("Book 2"));
        books.add(new Book("Book 3"));

        Biblioteca biblioteca = new Biblioteca(books);
        Application application = new Application(printStream, biblioteca);

        application.start();
    }
}
