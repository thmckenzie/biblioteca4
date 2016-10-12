import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaTest {
    private List<Book> books;
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private Book book1;

    @Before
    public void setUp() throws Exception {
        books = new ArrayList<>();
        book1 = mock(Book.class);
        books.add(book1);
        printStream = mock(PrintStream.class);

        biblioteca = new Biblioteca(books, printStream);
    }

    @Test
    public void shouldDisplayBooksDetailsWhenListingBooksForListOfSizeOne() throws Exception {
        //action
        biblioteca.listBooks();

        //assert
        verify(book1).displayBookDetails();
    }

    @Test
    public void shouldDisplayBookDetailsWhenListingBooksForListOfSizeTwo() throws Exception {
        //arrange
        Book book2 = mock(Book.class);
        books.add(book2);

        //action
        biblioteca.listBooks();

        //assert
        verify(book1).displayBookDetails();
        verify(book2).displayBookDetails();
    }
}