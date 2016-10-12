import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ApplicationTest {

    private PrintStream printStream;
    private Application application;
    private Biblioteca biblioteca;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        application = new Application(printStream, biblioteca);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenStarting() throws Exception {
        //action
        application.start();

        //assert
        verify(printStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldCallListBooksWhenStarting() throws Exception {
        //action
        application.start();

        //assert
        verify(biblioteca).listBooks();
    }
}
