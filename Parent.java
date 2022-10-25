
import java.util.ArrayList;


public class Parent extends User{
    private boolean waiver;
    private ArrayList<Child> children;
    private int numOfWeeks;
    private int price;

    public Parent(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String street, String town, String state, int zipCode, String country) {
        super(firstName, lastName, email, password, phoneNum, birthday);
    }

    public String addAddress(String street, String town, String state, int zipCode, String country){
        return "";
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

}
