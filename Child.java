import java.util.ArrayList;

public class Child {
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String medName;
    public String medtime;
    public String medDose;
    public String allergy;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<String> allergies;
    public ArrayList<Medication> medications;


    public Child (String firstName, String lastName, String birthday, String gender, String shirtSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        contacts = new ArrayList<>();
        allergies = new ArrayList<>();

    }

    public void addContact (Contact contact){
        contacts.add(contact);

    }

    public void addMedication(Medication medication){
        medications.add(medication);
        
    }

    public void addAllergy(String allergy){
        allergies.add(this.allergy);
    }

}
