package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Library library;
    private Boolean shouldShowMenu = true;

    public void createListOfBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("1","Teste","2019","Author"));
        books.add(new Book("2","Teste","2019","Author"));
        books.add(new Book("3","Teste","2019","Author"));
        books.add(new Book("4","Teste","2019","Author"));
        books.add(new Book("5","Teste","2019","Author"));
        library = new Library(books);
        while( shouldShowMenu ) {
            showMenu();
        }
    }

    public void showMenu(){
        System.out.println("Please select a option!");
        System.out.println("1 - List of available books");
        System.out.println("2 - List of unavailable books");
        System.out.println("3 - Quit");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        chooseOption(option, scanner );
    }

    public  void chooseOption(String option, Scanner scanner) {
        if (option.equals("1") || option.equals("2")){
            System.out.println("Id - Name - Year - Author");
        }
        switch (option){
            case "1":
                System.out.println(library.printListOfAvailableBooks());
                System.out.println("You can checkout a book");
                String idCheckout = scanner.nextLine();
                library.libraryAction(idCheckout, "checkOut");
                break;
            case "2":
                System.out.println(library.printListOfUnavailableBooks());
                System.out.println("You can return a book");
                String idReturn = scanner.nextLine();
                library.libraryAction(idReturn, "return");
                break;
            case "3":
                System.out.println("Thank you for using our services");
                shouldShowMenu = false;
                break;
            default:
                System.out.println("Please select a valid option!");
        }
    }
}
