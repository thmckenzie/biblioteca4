import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class MenuTest {
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Option> options;
    private Menu menu;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        options = new ArrayList<>();
        bufferedReader = mock(BufferedReader.class);

        menu = new Menu(options, printStream, bufferedReader);
    }

    @Test
    public void shouldPromptUserForOptionSelectionWhenMenuListsOptions() throws Exception {
        //action
        menu.listOptions();

        //assert
        verify(printStream).println("Please choose an option:");

    }

    @Test
    public void shouldDisplayListBooksOptionWhenMenuListsOptions() throws Exception {
        //arrange
        Option listBooksOption = new Option(biblioteca);
        options.add(listBooksOption);

        //action
        menu.listOptions();

        //assert
        verify(printStream).println("(1) List Books");
    }

    @Test
    public void shouldNotifyUserWithMessageWhenInvalidOptionIsSelectedToBePerformed() throws Exception {
        //action
        when(bufferedReader.readLine()).thenReturn("foo");
        menu.listOptions();
        menu.performOption();

        //assert
        verify(printStream).println("Please choose a valid option");
    }
}