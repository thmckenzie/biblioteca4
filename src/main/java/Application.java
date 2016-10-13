import java.io.PrintStream;


public class Application {
    private final PrintStream printStream;
    private final Biblioteca biblioteca;
    private Menu menu;

    public Application(PrintStream printStream, Biblioteca biblioteca, Menu menu) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
        menu.listOptions();
        menu.performOption();
    }
}
