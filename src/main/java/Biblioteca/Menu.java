package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Library library;

    public void createListOfBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("1","Teste","2019","Autor"));
        books.add(new Book("2","Teste","2019","Autor"));
        library = new Library(books);
        showMenu();
    }

    public void showMenu(){
        System.out.println("1 - List of books");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        chooseOption(option, scanner );
    }

    public  void chooseOption(String option, Scanner scanner) {
        switch (option){
            case "1":
                System.out.println(library.printList());
                System.out.println("You can checkout a book");
                String id = scanner.nextLine();
                if (library.checkOut(id)) {
                    System.out.println("Thank you! Enjoy the book");
                } else {
                    System.out.println("Sorry, that book is not available");
                }
                break;
            default:
                System.out.println("Please select a valid option!");
        }
    }
}
