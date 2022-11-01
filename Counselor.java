import java.util.ArrayList;
import java.util.UUID;

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
    private UUID id;


    public Counselor(UUID id, String fName, String lName, String email, String password, String phoneNum, String gender, String birthday,String shirtSize,String street,String town,String state, String zipCode, String country, ArrayList<Contact> contacts, ArrayList<Medication> medications, ArrayList<String> allergies) {
        super(fName, lName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
        this.shirtSize = shirtSize;
        this.id = id;
        contacts = new ArrayList();
        medications = new ArrayList();        
        allergies = new ArrayList();
    }

    public String getshirtSize(){
        return shirtSize; 
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

    public UUID getUUID() {
        return id;
        
    }

}
