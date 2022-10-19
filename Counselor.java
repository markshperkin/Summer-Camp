import java.util.ArrayList;

public class Counselor extends User{
    private String aboutMe;
    private String gender;
    private String allergy;
    private String shirtSize;
    private int strike;
    public String medName;
    public String medtime;
    public String medDose;
    private ArrayList<Contact> contacts;

    public Counselor(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String street
    , String town, String state, int zipCode, String country, String gender, String allergy, String shirtSize) {
        super(firstName, lastName, email, password, phoneNum, birthday, street, town, state, zipCode, country);
        this.gender = gender;
        this.allergy = allergy;
        this.shirtSize = shirtSize;
    }

    public void addMedication(String medName, String medTime, String medDose){
        
    }

    public void addStrike (String firstName, String lastName, int strike){

    }

    public void receiveCampers(){

    }

    public String addAddress(String street, String town, String state, int zipCode, String country){
        return "";
    }
}
