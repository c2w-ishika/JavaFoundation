import java.util.Calendar;
import java.util.Date;

/**
 * Created by iamis_000 on 8/8/2015.
 */
public class libraryItem {

    //properties
    public boolean isCheckedOut;
    public String itemTitle;
    public Date checkoutDate;
    public Date dueDate;

    //constructor
    public libraryItem(String title){
        itemTitle = title;
        isCheckedOut = false;
        checkoutDate = null;
        dueDate = null;
    }

        //methods
    public boolean checkOut() {
   boolean success = false;

    if (isCheckedOut == false) {
       checkoutDate = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 14);
        dueDate = c.getTime();
        isCheckedOut = true;
        success = true;
    }
        return success;
 }
    public boolean checkIn(){
        boolean success = false;
    if (isCheckedOut){
        isCheckedOut = false;
        checkoutDate = null;
        dueDate = null;
        success = true;
    }
        return success;
    }

    public void isAvailable(){
    if (isCheckedOut = false){
        System.out.println("This object is available.");
    }
        else {
        System.out.println("This object is unavailable.");
    }
    }

}