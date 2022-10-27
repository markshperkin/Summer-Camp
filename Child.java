import java.io.Console;
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
    public int strikeCount;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<Medication> medication;
    public ArrayList<String> allergies;
  


    public Child (String firstName, String lastName, String birthday, String gender, String shirtSize, ArrayList<Contact> contacts, ArrayList<Medication> medication){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        this.contacts = contacts;
        this.medication = medication;

    }

    public Child(){
        
    }

    public void addContact (Contact contact){
        contacts.add(contact);

    }

    public void strikeCount(){

    }

    public void addAllergy(String allergy){
        allergies.add(this.allergy);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
