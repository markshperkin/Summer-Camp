import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class CampFacade {
    private Counselor counselor;
    private Parent parent;
    private Child child;
    private Contact contact;
    private Activity activity;
    private SummerCamp summerCamp;
    private FAQ faq;
    private static Cabin cabin;
    static ParentsList parentList = ParentsList.getInstance();
    static CounselorList counselorList = CounselorList.getInstance();
    static DirectorList directorList = DirectorList.getInstance();

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

    public static boolean login(String email, String password, String userType){
        boolean key = true;
        if(userType.equals("guardian")) {
            key = parentList.login(email, password);
        }
        if(userType.equals("counselor")) {
            key = counselorList.login(email, password);
        }
        if(userType.equals("admin")) { 
            key = directorList.login(email, password);
        }
        return key;
    }

    /** This is for creating new parent and counselor */
    public static void signUp(String firstName, String lastName, String email, String password, String phoneNum, String birthday,String street, String town, String state, String zipCode, String country, String gender, String userType ){
        if(userType.equals("guardian")) {
            Parent parent = new Parent(firstName, lastName, email, password, phoneNum, birthday, street, town, state, zipCode, country, gender, null, userType);
            DataWriter.getParentsJSON(parent);
            DataWriter.saveParents();
        }
        if(userType.equals("admin")) {
            Director director = new Director(UUID.randomUUID().toString(), firstName, lastName, email, password, phoneNum, street, town, zipCode, state, country, birthday, gender);
            DataWriter.getDirectorsJSON(director);
            DataWriter.saveDirector();
        }
    }

    /** This is for creating new Counselor as they have more information to add  */
    public static void signUpCounselor(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String gender, String shirtSize, String street, String town, String state, String zipCode, String country, ArrayList<Contact> emergencyContacts, ArrayList<Medication> medications, ArrayList <String> allergies ) {
        Counselor counselor = new Counselor(UUID.randomUUID().toString(), firstName, lastName, email, password, phoneNum, birthday, gender, shirtSize, street, town, state, zipCode, country, emergencyContacts, medications, allergies);
        DataWriter.getCounselorsJSON(counselor);
        DataWriter.saveCounselors();
    }

    public static String getActivityByKeyWord (String word){
        return SummerCamp.Search(word);
    }

    public static HashMap<Days,ArrayList<Activity>> viewSchedule(){
        return cabin.getSchedule();  
    }

    public static void addChild(Child childChild){
        SummerCamp.campers.add(childChild);
    }

    public static void addCounselor(Counselor counselorCounselor){
        SummerCamp.counselors.add(counselorCounselor);
    }

    public static void viewChild (String viewFirstName, String viewLastName){

    }

    public static void getOneCabin (int y){
        for (int x = 0; x<5; x++){
            if (y == x){
                cabin.allCabins.get(x);
            }
        }
    }

    public static void registerChild(String registerFirstName, String registerLastName, int sessionChoice){
        
    }

    public static ArrayList<String> readReviews(){
        return SummerCamp.reviews;
    }

    public static void viewAllActivities(){

    }

    public static void getCabin(){
        cabin.getCabins();
    }

    public static void getCabinCampers(){

    }
    
}
