import java.util.ArrayList;

public class SummerCamp{

    public ArrayList<Activity> activities ;
    public ArrayList<FAQ> faqs;
    public String question;
    public String answer;
    public static ArrayList<String> reviews;
    public Sessions sessions = new Sessions();
    public String camperNeed;
    public ArrayList<String> camperNeeds;
    public static ArrayList<Child> campers;
    public static ArrayList<Counselor> counselors;
    public String campAddress;
    public int campNumber;
    public String campEmail;
    public String email;
    public String notification;
    public String searchWord;
    public static final int WEEK=10;

    public SummerCamp(String question, String answer, String camperNeed, String campAddress, String campEmail, String notification, String searchWord, int campNumber ){
        this.question = question;
        this.answer = answer;
        this.camperNeed = camperNeed;
        this.campAddress = campAddress;
        this.campEmail = campEmail;
        this.notification = notification;
        this.searchWord = searchWord;
        this.campNumber = campNumber;


    }

    public SummerCamp(){}

    public void addActivity(Activity activity){
        
    }

    public ArrayList<Sessions> getAllSessions(){
        return sessions.createSessions();
    }

    public void addFAQ(String question, String answer){

    }

    public static void addReview(String review){
        reviews.add(review);
    }

    public void addCamperNeed(String camperNeed){

    }

    public ArrayList<Child> getAllCampers(){
        return campers;
    }

    public void displayCampInfo (String campAddress, String campEmail, String campNumber){

    }

    public static String Search(String searchWord){
        return "activity by word";
    }

    public String sendNotif(String email, String notification) {
        return " ";
    }


    
}