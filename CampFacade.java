import java.util.ArrayList;
import java.util.HashMap;

public class CampFacade {
    private Counselor counselor;
    private Parent parent;
    private Child child;
    private Contact contact;
    private Activity activity;
    private FAQ faq;
    private static Cabin cabin;

    public CampFacade(Counselor counselor, Parent parent, Child child, Contact contact, Activity activity, FAQ faq, Cabin cabin){
        this.counselor = counselor;
        this.parent = parent;
        this.child = child;
        this.contact = contact;
        this.activity = activity;
        this.faq = faq;
        this.cabin = cabin;
    }

    public static boolean login(String email, String password){
        if(User.getEmail().equalsIgnoreCase(email) && User.getPassword().equalsIgnoreCase(password))
            return true;
        else 
            return false;
    }

    public static void signUp (String firstName, String lastName, String email, String password, String phoneNum, String birthday,String street, String town, String state, String zipCode, String country, String gender ){
        //UserList.addUser(firstName, lastName, email, password, phoneNum, birthday);
    }

    public static String getActivityByKeyWord (String word){
        return SummerCamp.Search(word);
    }

    public static HashMap<Days,ArrayList<Activity>> viewSchedule(){
        return cabin.getSchedule();  
    }

    public void sendNotif(){
        
    }

    public static void addChild(){
        
    }

    public static void registerChild(){
        
    }

    public static void addReview(String review){
        
    }

    public static void readReviews(){
        
    }

    
}
