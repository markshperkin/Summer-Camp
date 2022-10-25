import java.util.ArrayList;

public class SummerCamp{

    public ArrayList<Activity> activities ;
    public ArrayList<FAQ> faqs;
    public String question;
    public String answer;
    public ArrayList<String> reviews;
    public ArrayList<Sessions> sessions;
    public String camperNeed;
    public ArrayList<String> camperNeeds;
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

    public void addActivity(Activity activity){
        
    }

    public void addSession(Sessions sessions){
        
    }

    public void addFAQ(String question, String answer){

    }

    public static void addReview(String review){

    }

    public void addCamperNeed(String camperNeed){

    }

    public void displayCampInfo (String campAddress, String campEmail, String campNumber){

    }

    public static String Search(String searchWord){
        return "activity by word";
    }
    public String sendNotif(String email, String notification) {
        return " ";
    }
    public int getWeek() {
        return WEEK;
    }
    public boolean withinWeek() {
        return true;
    }

    
}