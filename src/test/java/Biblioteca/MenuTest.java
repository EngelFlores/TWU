package Biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class MenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Menu menu;
    private Menu menuTest;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Before
    public void createMenu(){
        menu = new Menu();
        menuTest = Mockito.spy(menu);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldShowMessageWhenUserQuitApp(){
        Mockito.doReturn("3").when(menuTest).userInput();
        menuTest.showMenu();
        assertThat(outContent.toString(), containsString("Thank you for using our services"));
    }

    @Test
    public void showMenuOption(){
        Mockito.doNothing().when(menuTest).chooseOption();
        menuTest.showMenu();
        assertThat(outContent.toString(), containsString("Please select a option!"));
    }

    @Test
    public void shouldShowMessageWhenBookCanBeCheckout(){
        Mockito.doReturn("2").when(menuTest).userInput();
        menuTest.bookCheckout();
        assertThat(outContent.toString(), containsString("You can checkout a book"));
    }

    @Test
    public void shouldShowMessageWhenBookCanBeReturned(){
        Mockito.doReturn("3").when(menuTest).userInput();
        menuTest.returnBook();
        assertThat(outContent.toString(), containsString("You can return a book"));
    }
}
