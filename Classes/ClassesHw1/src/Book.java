import java.util.Enumeration;

public class Book {
    String title ;
    String author;
    int pages;


    Book(String title , String author , int pages){
            this.title = title;
            this.author = author;
            this.pages = pages;
    }

    Book(String title , String author ){
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public void displaybookinfo(){
        System.out.println("Book title : " + title);
        System.out.println("Author of book : " + author);
        System.out.println("Book pages : " + pages);
    }
}
