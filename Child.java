import java.util.ArrayList;
import java.util.UUID;
/**
 * Creates a child
 */
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
    public ArrayList<Medication> medications;
    public ArrayList<String> allergies;
    public int monthInt;
    public int dayInt;
    public int yearInt;
    public String id;
    /**
     * Creates a child with new UUID for UI
     * @param firstName string of the child first name
     * @param lastName string of the child last name
     * @param birthday string of the child birthday
     * @param gender string of the child gender
     * @param shirtSize string of the child shirt size
     * @param medName string of the med name
     * @param medtime string of the med time
     * @param medDose string of the med dose
     * @param allergy string of the child allergy
     */
     public Child (String firstName, String lastName, String birthday, String gender, String shirtSize, String medName, String medtime, String medDose, String allergy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        this.medName = medName;
        this.medtime = medtime;
        this.medDose = medDose;
        this.allergy = allergy;
        this.id = UUID.randomUUID().toString();
        contacts = new ArrayList<Contact>();
        medications = new ArrayList<Medication>();
        allergies = new ArrayList<String>();
    }
    /**
     * Creates a child with an existing UUID
     * @param id Id of a student
     * @param firstName string of the child first name
     * @param lastName string of the child last name
     * @param birthday string of the child birthday
     * @param gender string of the child gender
     * @param shirtSize string of the child shirt size
     * @param medName string of the med name
     * @param medtime string of the med time
     * @param medDose string of the med dose
     * @param allergy string of the child allergy
     * @param contacts an arraylist of contacts of the child
     * @param medications an arraylist of medications of the child
     * @param allergies an arraylist of allergies 
     */
    public Child(String id, String firstName, String lastName, String birthday, String gender, String shirtSize, ArrayList<Contact> contacts, ArrayList<Medication> medications, ArrayList<String> allergies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        this.medName = medName;
        this.medtime = medtime;
        this.medDose = medDose;
        this.allergy = allergy;
        this.contacts = contacts;
        this.medications = medications;
        this.allergies = allergies;

    }
    /**
     * gets the first name of child
     * @return String firstname
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * gets lastname of child
     * @return String lastname
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * gets the birthday of child
     * @return String birthday
     */
    public String getBirthday() {
        splitBirthday();
        return birthday;
    }
    /**
     * get the medication name
     * @return String medname
     */
    public String getMedName() {
        return medName;
    }
    /**
     * gets the medication time
     * @return String medtime
     */
    public String getMedTime() {
        return medtime;
    }
     /**
     * get the medication dose
     * @return medDose
     */
    public String getMedDose() {
         return medDose;
    }
    /**
     * get the allergy
     * @return string allergy
     */
    public String getAllergy() {

        return allergy;
    }
    /**
     * adds the allergy to the arraylist 
     */
    public void addAllergy(String allergy){
        allergies.add(this.allergy);
    }
    /**
     * gets the shirt size of the child
     * @return String shirtSize
     */
    public String getShirtSize() {
        return shirtSize;
    }
    /**
     * adds the contact to the array list 
     * @param contact from contact class
     */
    public void addContact (Contact contact){
        contacts.add(contact);
    }
    /**
     * adds medication to the arraylist of medication 
     * @param medication from medication class
     */
    public void addMedication(Medication medication) {

        medications.add(medication);
        
    }
    /**
     * splits up the month day and year from the string birthday
     */
    public void splitBirthday(){
        int f = birthday.indexOf("/");
		int l = birthday.lastIndexOf("/");
		String month = birthday.substring(0,f);
		String day = birthday.substring(f+1,l);
		String year = birthday.substring(l+1);
		monthInt = Integer.parseInt(month);
		dayInt = Integer.parseInt(day);
		yearInt = Integer.parseInt(year);
    }
    /**
     * get the year of the child 
     * @return int yearint
     */
    public int getYear(){
        return yearInt;
    }
    /**
     * gets id of the child
     * @return String id
     */
    public String getID() {
        return id;
    }

}
