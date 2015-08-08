import java.util.ArrayList;

/**
 * Created by iamis_000 on 8/8/2015.
 */
public class LibrarySystem {
    //properties
    ArrayList libCollection = new ArrayList();


    //constructor
    public LibrarySystem() {
        Book book1 = new Book("To Kill A Mockingbird", "Harper Lee", true);
        libCollection.add(book1);

        Book book2 = new Book("Divergent", "Veronica Roth", true);
        libCollection.add(book2);

        Book book3 = new Book("Harry Potter", "J.K. Rowling", true);
        libCollection.add(book3);

        Book book4 = new Book("The Second Machine Age", "Andrew McAfee and Erik Brynjolfsson", false);
        libCollection.add(book4);

        Book book5 = new Book("I Am Malala", "Malala Yousafzai", false);
        libCollection.add(book5);

        Video video1 = new Video("Mission: Impossible- Ghost Protocol", "Tom Cruise", "Brad Bird", VideoCategories.MOVIE);
        libCollection.add(video1);

        Video video2 = new Video("Star Trek- Into Darkness", "Chris Pine", "J.J. Abrams", VideoCategories.MOVIE);

    }
}


