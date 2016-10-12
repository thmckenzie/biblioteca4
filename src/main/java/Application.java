import java.io.PrintStream;


public class Application {
    private final PrintStream printStream;
    private final Biblioteca biblioteca;

    public Application(PrintStream printStream, Biblioteca biblioteca) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
        biblioteca.listBooks();
    }
}
