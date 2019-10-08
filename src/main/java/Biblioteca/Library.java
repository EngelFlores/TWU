package Biblioteca;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library( List<Book> books){
        this.books = books;
    }

    public String printList(){
        String list = "";
        for ( Book book: books ) {
            if (book.getAvailable()){
                list+= book.toString() + "\n";
            }
        }
        return list;
    }

    public Boolean checkOut(String id){
        for ( Book book: books ) {
            if (book.getId().equals(id) ) {
                if (book.getAvailable()) {
                    book.setAvailable(false);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public Boolean returnElement(){
        return false;
    }
}

