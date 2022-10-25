public class CampFacade {
    private Counselor counselor;
    private Parent parent;
    private Child child;
    private Contact contact;
    private Activity activity;
    private FAQ faq;
    private Cabin cabin;

    public CampFacade(Counselor counselor, Parent parent, Child child, Contact contact, Activity activity, FAQ faq, Cabin cabin){
        this.counselor = counselor;
        this.parent = parent;
        this.child = child;
        this.contact = contact;
        this.activity = activity;
        this.faq = faq;
        this.cabin = cabin;
    }

    public static boolean login(String username, String password){
        return true;
    }

    public static void signUp (String firstName, String lastName, String userName, String email, String password){

    }

    public static String getActivityByKeyWord (String word){
        return "activity";
    }

    public static String getAllActivity(){
        return "activities";
    }

    public static String viewSchedule(){
        return "schedule";  
    }

    public void createSchedule(){

    }

    public static void addReview(){

    }

    public void sendNotif(){
        
    }

    public static void addChild(){
        
    }

    public static void registerChild(){
        
    }

}
