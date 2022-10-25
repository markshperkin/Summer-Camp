import java.util.ArrayList;

public class Counselor extends User{
    private String aboutMe;
    private String gender;
    private String shirtSize;
    private int strike;
    public String medName;
    public String medtime;
    public String medDose;
    private ArrayList<Contact> contacts;
    public ArrayList<String> allergy;


    public Counselor(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String gender, String shirtSize, String state, String country, String gender2, String sSize) {
        super(firstName, lastName, email, password, phoneNum, birthday);
        this.gender = gender;
        this.shirtSize = shirtSize;
        contacts = new ArrayList();
        allergy = new ArrayList();    
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
