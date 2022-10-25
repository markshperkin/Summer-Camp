import java.util.ArrayList;

public class Child {
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String medName;
    public String medtime;
    public String medDose;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<String> allergy;


    public Child (String firstName, String lastName, String birthday, String gender, String shirtSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        contacts = new ArrayList<>();
        allergy = new ArrayList<>();

    }

    public void addContact (Contact contact){

    }

    public void addMedication(String medName, String medTime, String medDose){
        
    }

}
