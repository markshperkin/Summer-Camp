import java.util.ArrayList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.UUID;
/**
 * Creates a child
 */
public class Counselor extends User{
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String aboutMe;
    public String Aboutme;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<Medication> medications;
    public ArrayList<String> allergies;
    public String UUid;
    public String email;
    public String password;
    public String phoneNum;

public Counselor (String id, String firstName, String lastName, String email, String password, String phoneNum, String birthday, String gender, String shirtSize, String street,String town,String state,String zipCode,String country, String aboutMe, ArrayList<Contact> emergencyContacts, ArrayList<Medication> medications, ArrayList <String> allergies){
   super(firstName, lastName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
   
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.gender = gender;
    this.aboutMe = aboutMe;
    this.shirtSize = shirtSize;
    this.email= email;
    this.phoneNum = phoneNum;
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

    public String getZipCode(){
        return zipCode;
    }

    public String getCountry(){
        return country;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNum;
    }

    public String getStreet(){
        return street;
    }

    public ArrayList<String> getAllergy() {
        return allergies;
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
        allergies.add(allergy);
    }

    public Counselor getCounselorByID (String ID) {
        for
    }

    public String getUUID() {
        return UUid.toString();
    }
}


