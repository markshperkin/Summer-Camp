import java.util.ArrayList;

public class SummerCamp{

    public ArrayList<Activity> activities ;
    public static ArrayList<String> reviews;
    public Sessions sessions = new Sessions();
    public static ArrayList<Child> campers;
    public static ArrayList<Counselor> counselors;
    public String campAddress;
    public int campNumber;
    public String campEmail;
    public String email;
    public ArrayList<Cabin> cabins;
    public Cabin cabin;

    public SummerCamp( String campAddress, String campEmail, int campNumber ){
        cabin = new Cabin();
        this.campAddress = campAddress;
        this.campEmail = campEmail;
        this.campNumber = campNumber;
    }

    public SummerCamp(){}

    public void addActivity(Activity activity){
        
    }

    public ArrayList<Sessions> getAllSessions(){
        return sessions.createSessions();
    }

    public static void addReview(String review){
        reviews.add(review);
    }

    public ArrayList<Child> getAllCampers(){
        return campers;
    }

    public void displayCampInfo (String campAddress, String campEmail, String campNumber){

    }

    public void getCabins(ArrayList<Cabin> cabinAdded){
        cabin.getCabins();
    }


    
}