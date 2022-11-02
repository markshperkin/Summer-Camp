import java.util.UUID;
import java.util.*;

public class Director extends User {

    private Child camper;
    public String id;

    public Director(String fname, String lname, String email, String password, String phoneNum, String street,
<<<<<<< HEAD
            String town, String zipCode, String state, String country, String birthday,String gender,String id) {
    
                super(fname,lname,email,password,phoneNum,street,town,zipCode,state,country,birthday,gender);
                this.id=id;
                
    
            }
=======
            String town, String zipCode, String state, String country, String birthday, String gender) {
>>>>>>> 90ffe374077f7b00899ef9a51e5a9aa5577d353d

        super(fname, lname, email, password, phoneNum, street, town, zipCode, state, country, birthday, gender);
        this.id = UUID.randomUUID().toString();


    }

    public void setCamper(Child camper) {
        this.camper = camper;
    }

    public Child getCamper() {
        return camper;
    }

    public String viewCampers(Child camper) {
        return "";
    }

    public int checkMoney() {
        return 0;
    }
}
