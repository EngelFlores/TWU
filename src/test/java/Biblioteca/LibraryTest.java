package Biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void userShouldBeAbleToCheckoutBook(){
        List<Book> books = new ArrayList<>();
        Book testBook = new Book("1","Teste","2019","Author");
        books.add(testBook);
        Library library = new Library(books);
        assertThat(library.checkOut(testBook), containsString("Thank you! Enjoy the book"));
    }
}
