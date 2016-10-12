import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BookTest {
    Book book;
    PrintStream printStream;

    @Test
    public void shouldDisplayTitleAuthorDateWhenCallingBookDetails() throws Exception {
        //arrange
        printStream = mock(PrintStream.class);
        book = new Book(printStream, "Title", "Author", "Year");

        //action
        book.displayBookDetails();

        //assert
        verify(printStream).println("Title | Author | Year");
    }
}