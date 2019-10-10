package Biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    private List<Book> books;
    private Book testBook;
    private Library library;


    @Before
    public void createListOfBooks() {
        books = new ArrayList<>();
        testBook = new Book("1","Teste","2019","Author");
        books.add(testBook);
        library = new Library(books);
    }

    @Test
    public void userShouldBeAbleToCheckoutBook(){
        assertThat(library.checkOut(testBook), containsString("Thank you! Enjoy the book"));
    }

    @Test
    public void userShouldBeAbleToReturnBook(){
        library.checkOut(testBook);
        assertThat(library.returnBooks(testBook), containsString("Thank you for returning the book!"));
    }

    @Test
    public void shouldReturnListOfAvailableBooks(){
        assertThat(library.printListOfAvailableBooks(), containsString("1 - Teste - 2019 - Author"));
    }

    @Test
    public void shouldReturnListOfUnavailableBooksAfterCheckout(){
        library.checkOut(testBook);
        assertThat(library.printListOfUnavailableBooks(), containsString("1 - Teste - 2019 - Author"));
    }

}
