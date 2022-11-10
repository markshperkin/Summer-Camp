import java.util.UUID;
import java.util.*;

public class Director extends User {

    private Child camper;
    public String id;
    public SummerCamp summerCamp = new SummerCamp();

    public Director(String id, String fname, String lname, String email, String password, String phoneNum, String street, String town, String zipCode, String state, String country, String birthday,String gender) {
    
        super(fname,lname,email,password,phoneNum,street,town,zipCode,state,country,birthday,gender);
        this.id = UUID.randomUUID().toString();

    }

    public Director(String fname, String lname, String email, String password, String phoneNum, String street, String town, String zipCode, String state, String country, String birthday,String gender) {
    
        super(fname,lname,email,password,phoneNum,street,town,zipCode,state,country,birthday,gender);
        this.id = UUID.randomUUID().toString();

    }

    public ArrayList<Child> viewCampers() {
        return summerCamp.getAllCampers();
    }

    public int checkMoney() {
        return 0;
    }
    public String getstreet(){
        return street;
    }
    public String gettown(){
        return town;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getzipCode() {
        return zipCode;
    }
    public boolean getdirector(){
        return true;
    }
}
