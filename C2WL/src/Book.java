/**
 * Created by iamis_000 on 8/8/2015.
 */
public class Book extends libraryItem

{
    //properties
    String bookAuthor;
    boolean isBookFiction;

    //methods
    public Book(String title, String author, boolean isFiction){
        super(title);
        bookAuthor = author;
        isBookFiction = isFiction;

        }

        // define methods
    @Override
    public String toString(){
        return "Book: " + itemTitle + " Author: " + bookAuthor + " Category: " + isBookFiction + " isCheckedOut: " + isCheckedOut;
    }


    }

