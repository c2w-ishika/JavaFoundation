/**
 * Created by iamis_000 on 8/8/2015.
 */
public class Video extends libraryItem
{

    //properties
        public String videoLeadActor;
        public String videoDirector;
        public VideoCategories videoCategory;

    //constructor
    public Video(String title, String director, String actor, VideoCategories category){
        super(title);
        videoLeadActor = actor;
        videoDirector = director;
        videoCategory = category;
        }
    @Override
    public String toString() {
        return "Video: " + itemTitle + " Lead Actor: " + videoLeadActor + " Director: " +
                videoDirector + "Category: " + videoCategory + " isCheckedOut" + isCheckedOut;

    }


}
