
import java.util.ArrayList;
import java.util.UUID;


public class Parent extends User{
    private boolean waiver;
    private ArrayList<String> children = new ArrayList<String>();
    private int numOfWeeks;
    private int price;
    private String id;
    

    public Parent(String fName, String lName, String email, String password, String phoneNum, String birthday, String street, String town, String state, String zipCode, String country,String gender, ArrayList<String>children, String id) {
        super(fName, lName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
        this.children = children;
        this.id = id;
        
       
    }
 
    

    public void addChild(Child child){

    }

    public boolean signWaiver(boolean waiver){
        return waiver;
    }

    public void choseDates (int numOfWeeks){

    }

    public int displayPrice(){
        return 0;
    }

    public String getUUID() {
        return id;
    }

}
