package Biblioteca;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library( List<Book> books){
        this.books = books;
    }

    public String printListOfAvailableBooks(){
        String list = "";
        for ( Book book: books ) {
            if (book.getAvailability()){
                list+= book.toString() + "\n";
            }
        }
        return list;
    }

    public String printListOfUnavailableBooks(){
        String list = "";
        for ( Book book: books ) {
            if (!book.getAvailability()){
                list+= book.toString() + "\n";
            }
        }
        return list;
    }

    public Boolean libraryAction(String id, String action){
        for ( Book book: books ) {
            if (book.getId().equals(id) ) {
                if (action.equals("checkOut")){
                    checkOut(book);
                }
                if (action.equals("return")) {
                    returnBooks(book);
                }

            }
        }
        return false;
    }

    public String checkOut(Book book){
        if (book.getAvailability()) {
            book.setAvailable(false);
            return "Thank you! Enjoy the book";
        } else {
            return "Sorry, that book is not available";
        }
    }

    public String returnBooks(Book book){
        if (!book.getAvailability()) {
            book.setAvailable(true);
            return "Thank you for returning the book!";
        } else {
            return "That is not a valid book to return";
        }
    }

    public Boolean returnElement(){
        return false;
    }
}

