import java.util.ArrayList;
import java.util.HashMap;

public class CampFacade {
    private Counselor counselor;
    private Parent parent;
    private Child child;
    private Contact contact;
    private Activity activity;
    private SummerCamp summerCamp;
    private FAQ faq;
    private static Cabin cabin;
    public static ParentsList parentList = ParentsList.getInstance();

    public CampFacade(Counselor counselor, Parent parent, Child child, Contact contact, Activity activity, FAQ faq, Cabin cabin, SummerCamp summerCamp){
        this.counselor = counselor;
        this.summerCamp = summerCamp;
        this.parent = parent;
        this.child = child;
        this.contact = contact;
        this.activity = activity;
        this.faq = faq;
        this.cabin = cabin;
    }

    public static boolean login(String email, String password){
        return parentList.login(email, password);
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

    public static void addChild(Child childChild){
        SummerCamp.campers.add(childChild);
    }

    public static void viewChild (String viewFirstName, String viewLastName){

    }

    public static void registerChild(String registerFirstName, String registerLastName, int sessionChoice){
        
    }

    public static void addReview(String review){
        
    }

    public static void readReviews(){
        
    }

    
}
