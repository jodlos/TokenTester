package pl.edu.wszib.jwd;

public class CompareBooks {
    String title;
    String author;
    String publisher;
    int year;

    public CompareBooks(String title, String author, String publisher, int year) {
        this.title= title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public static void main(String[] args) {


        CompareBooks compareBooks = new CompareBooks("Tytuł", "Autor", "Wydawnictwo", 2022);
        System.out.println(compareBooks);


    }

}
