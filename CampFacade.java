public class CampFacade {
    private Counselor counselor;
    private Parent parent;
    private Child child;
    private Contact contact;
    private Activity activity;
    private FAQ faq;
    private Cabin cabin;

    public CampFacade(Counselor counselor, Parent parent, Child child, Contact contact, Activity activities, FAQ faq, Cabin cabin){
        this.counselor = counselor;
        this.parent = parent;
        this.child = child;
        this.contact = contact;
        this.activity = activity;
        this.faq = faq;
        this.cabin = cabin;
    }

    public void login(String username, String password){

    }

    public void signUp (String firstName, String lastName, String userName, String email, String password){

    }

    public void getActivityByKeyWord (String word){

    }

    public void getAllActivity(){

    }

    public void viewSchedule(){

    }

    public void createSchedule(){

    }

    public void addReview(){

    }

    public void sendNotif(){
        
    }

}
