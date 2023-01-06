import java.util.*;

public class Application {
    public static void main(String[] args) {
        Book theBook1 = new Book("The 100", "Kass Morgan", 2013);
        Book theBook2 = new Book("Think again", "Adam Grant", 2021);
        Book theBook3 = new Book("TommyInnit Says...", "Tom Simons, Will Gold", 2022);
        Book theBook4 = new Book("The Great Gatsby", "F.Scott Fitzgerald", 2017);
        Book theBook5 = new Book("If We Were Villains", "M. L. Rio", 2017);

        Queue<Book> theBooks = new ArrayDeque<>();
        theBooks.offer(theBook1);
        theBooks.offer(theBook2);
        theBooks.offer(theBook3);
        theBooks.offer(theBook4);
        theBooks.offer(theBook5);

        System.out.println("Queue size is: " + theBooks.size());
        System.out.println();

        Book lastBook;

        lastBook = theBooks.poll();
        lastBook = theBooks.poll();
        lastBook = theBooks.poll();
        lastBook = theBooks.poll();
        lastBook = theBooks.poll();

        System.out.println("Queue size is: " + theBooks.size());
        System.out.println();
        System.out.println("Last book taken from queue is: \n" + lastBook);
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "title: \"" + title + "\"\n" + "author: " + author + "\n" + "year: " + year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
