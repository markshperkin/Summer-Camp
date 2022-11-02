import java.util.UUID;
import java.util.*;

public class Director extends User {

    private Child camper;
    public String id;
    public SummerCamp summerCamp = new SummerCamp();

<<<<<<< HEAD
    public Director(String fname, String lname, String email, String password, String phoneNum, String street,
            String town, String zipCode, String state, String country, String birthday, String gender) {

        super(fname, lname, email, password, phoneNum, street, town, zipCode, state, country, birthday, gender);
=======
    public Director(String id, String fname, String lname, String email, String password, String phoneNum, String street, String town, String zipCode, String state, String country, String birthday,String gender) {
    
        super(fname,lname,email,password,phoneNum,street,town,zipCode,state,country,birthday,gender);
>>>>>>> 3e4807157f72f62fc5164db2ae2dcf2d79161ea4
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
}
