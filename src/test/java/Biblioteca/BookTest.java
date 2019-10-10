package Biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book = new Book("1","Test","2019","Author");

    @Test
    public void shouldReturnTheBookId(){
        assertEquals("1",book.getId());
    }

    @Test
    public void shouldReturnTrueIfTheBookIsAvailable(){
        assertEquals(true,book.getAvailability());
    }

    @Test
    public void shouldReturnFalseIfTheBookIsUnavailable(){
        book.setAvailable(false);
        assertEquals(false,book.getAvailability());
    }
}
