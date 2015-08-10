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

        Video video1 = new Video("Mission: Impossible- Ghost Protocol", "Brad Bird", "Tom Cruise", VideoCategories.MOVIE);
        libCollection.add(video1);

        Video video2 = new Video("Star Trek- Into Darkness", "J.J. Abrams", "Chris Pine", VideoCategories.MOVIE);
        libCollection.add(video2);

        Video video3 = new Video("Fringe", "J.J. Abrams", "Anna Torv, Joshua Jackson", VideoCategories.SHOW);
        libCollection.add(video3);

        Video video4 = new Video("Psych", "Mel Damski", "James Roday, Dule Hill, Maggie Lawson", VideoCategories.SHOW);
        libCollection.add(video4);

        Video video5 = new Video("Super Size Me", "Morgan Spurlock", "Morgan Spurlock", VideoCategories.DOCUMENTARY);
        libCollection.add(video5);

        Video video6 = new Video("Blackfish", "Gabriela Cowperthwaite", "Tilikum the whale, John Hargrove, Samantha Berg", VideoCategories.DOCUMENTARY);
        libCollection.add(video6);

    }
}


