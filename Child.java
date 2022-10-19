import java.util.ArrayList;

public class Child {
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String allergy;
    public String medName;
    public String medtime;
    public String medDose;
    public String shirtSize;
    public ArrayList<Contact> contacts;

    public Child (String firstName, String lastName, String birthday, String gender, String allergy, String shirtSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.allergy = allergy;
        this.shirtSize = shirtSize;

    }

    public void addContact (Contact contact){

    }

    public void addMedication(String medName, String medTime, String medDose){
        
    }

}
