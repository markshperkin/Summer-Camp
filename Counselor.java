import java.util.ArrayList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.UUID;
/**
 * Creates a child
 */
public class Counselor {
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String medName;
    public String medtime;
    public String medDose;
    public String allergy;
    public String Aboutme;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<Medication> medications;
    public ArrayList<String> allergies;
    public String UUid;
    public String email;
    public String password;

public Counselor (String firstName, String lastName, String birthday, String gender, String shirtSize, String medName, String medtime, String medDose,String email,String password,String allegery, String allergy2){
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.gender = gender;
    this.shirtSize = shirtSize;
    this.medName = medName;
    this.medtime = medtime;
    this.medDose = medDose;
    this.email= email;
    this.password=password;
    this.UUid = UUID.randomUUID().toString();
    contacts = new ArrayList<Contact>();
    medications = new ArrayList<Medication>();
    allergies = new ArrayList<String>();

}
    
    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public String getBirthday() {
        return birthday;
    }



    public String getGender() {
        return gender;
    }



    public String getMedName() {
        return medName;
    }



    public String getMedtime() {
        return medtime;
    }



    public String getMedDose() {
        return medDose;
    }



    public String getAllergy() {
        return allergy;
    }



    public String getAboutme() {
        return Aboutme;
    }



    public ArrayList<Contact> getContacts() {
        return contacts;
    }



    public ArrayList<Medication> getMedications() {
        return medications;
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

    public String getUUID() {
        return UUid.toString();
    }
}


