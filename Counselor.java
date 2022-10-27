import java.util.ArrayList;

public class Counselor extends User{
    private String aboutMe;
    private String gender;
    private String shirtSize;
    public String medName;
    public String medtime;
    public String medDose;
    public String allergy;
    private ArrayList<Contact> contacts;
    public ArrayList<String> medications;
    public ArrayList<String> allergies;


    public Counselor(String fName, String lName, String email, String password, String phoneNum, String birthday,String shirtSize,String street,String town,String zipCode, String country,String gender) {
        super(fName, lName, email, password, phoneNum, birthday,street,town,zipCode,zipCode,country,gender);
        this.shirtSize = shirtSize;
        

        contacts = new ArrayList();
        medications = new ArrayList();    
    }

    public void addMedication(String medName, String medTime, String medDose){
        
    }

    public void addAllergy(String allergy){
        allergies.add(this.allergy);
    }

    public void addStrike (String firstName, String lastName, int strike){

    }

    public void receiveCampers(){

    }

    public String addAddress(String street, String town, String state, int zipCode, String country){
        return "";
    }
}
