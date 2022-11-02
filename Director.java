import java.util.UUID;
import java.util.*;
public class Director extends User {
   
    private Child camper;


    public Director(String fname, String lname, String email, String password, String phoneNum, String street,
            String town, String zipCode, String state, String country, String birthday,String gender,UUID id) {
    
                super(fname,lname,email,password,phoneNum,street,town,zipCode,state,country,birthday,gender);
                this.id=id;
                
    
            }

    


    public void setCamper(Child camper) {
        this.camper = camper;
    }

    public Child getCamper() {
        return camper;
    }

    public String viewCamper(Child camper) {
        return "";
    }


    public int checkMoney() {
        return 0;
    }
}
