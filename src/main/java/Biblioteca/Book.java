package Biblioteca;

public class Book {
    private String id;
    private String name;
    private String year;
    private String author;
    private Boolean available;

    @Override
    public String toString() {
        return id + '\'' + "-" + name + '\'' + "-" + year + '\'' + "-" +  author + '\'';
    }

    public Book(String id, String name, String year, String author) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }


    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
