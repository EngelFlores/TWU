package Biblioteca;

public class App {

    public static void main(String[] args) {
        welcomeMessage();
        Menu menu = new Menu();
        menu.startLibrary();
    }

    public static void welcomeMessage(){
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

}