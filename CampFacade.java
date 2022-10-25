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

    public static boolean login(String email, String password){
        if(User.getEmail().equalsIgnoreCase(email) && User.getPassword().equalsIgnoreCase(password))
            return true;
        else 
            return false;
    }

    public static void signUp (String firstName, String lastName, String email, String password, String phoneNum, String birthday){
        UserList.addUser(firstName, lastName, email, password, phoneNum, birthday);
    }

    public static String getActivityByKeyWord (String word){
        return SummerCamp.Search(word);
    }

    public static String viewSchedule(){
        return Cabin.viewSchedule();  
    }

    public void sendNotif(){
        
    }

    public static void addChild(){
        
    }

    public static void registerChild(){
        
    }

}
