package Biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book = new Book("1","Teste","2019","Author");

    @Test
    public void shouldReturnTheBookId(){
        assertEquals("1",book.getId());
    }
}
