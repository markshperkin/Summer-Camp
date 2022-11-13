import java.util.ArrayList;
import java.util.UUID;

/**
 * Creates a counselor
 */
public class Counselor extends User{
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String aboutMe;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<Medication> medication;
    public ArrayList<String> allergies;
    public String UUid;
    public String email;
    public String password;
    public String phoneNum;

/**
 * Constructor for counselor in data reader
 * @param id A string of the counselor id
 * @param firstName A string of the counselor first name
 * @param lastName A string of the counselor last name
 * @param email A string of the counselor email
 * @param password A string of the counselor password
 * @param phoneNum A string of the counselor phone number
 * @param birthday A string of the counselor birthday
 * @param gender A string of the counselor gender
 * @param shirtSize A string of the counselor shirt size
 * @param street A string of the counselor street
 * @param town A string of the counselor town
 * @param state A string of the counselor state
 * @param zipCode A string of the counselor zip code
 * @param country A string of the counselor country 
 * @param aboutMe A string of the counselor about me
 * @param medications An arraylist of the counselors medication
 * @param allergies An arraylist of the counselors allergies
 */
public Counselor (String UUid, String firstName, String lastName, String email, String password, String phoneNum, String birthday, String gender, String shirtSize, String street, String town, String state,String zipCode,String country, String aboutMe, ArrayList<Contact> contacts, ArrayList<Medication> medication, ArrayList<String> allergies){
    super(firstName, lastName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
    this.contacts = contacts;
    this.medication = medication;
    this.UUid = UUid;
 }
 /**
  * Constructor for counselor
  * @param id A string of the counselor id
  * @param firstName A string of the counselor first name
  * @param lastName A string of the counselor last name
  * @param email A string of the counselor email
  * @param password A string of the counselor password
  * @param phoneNum A string of the counselor phone number
  * @param birthday A string of the counselor birthday
  * @param gender A string of the counselor gender
  * @param shirtSize A string of the counselor shirt size
  * @param street A string of the counselor street
  * @param town A string of the counselor town
  * @param state A string of the counselor state
  * @param zipCode A string of the counselor zip code
  * @param country A string of the counselor country 
  * @param aboutMe A string of the counselor about me
  */
 public Counselor (String id, String firstName, String lastName, String email, String password, String phoneNum, String birthday, String gender, String shirtSize, String street, String town, String state,String zipCode,String country, String aboutMe){
     super(firstName, lastName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
     contacts = new ArrayList<Contact>();
     medication = new ArrayList<Medication>();
     UUid = UUID.randomUUID().toString();
     allergies = new ArrayList<String>();
  } 
    
  /**
     * gets the first name of the counselor
     * @return String first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * gets the last name of the counselor
     * @return String last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * gets the birthday of the counselor
     * @return String birthday
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * gets the zip code of the counselor
     * @return String zip code
     */
    public String getZipCode(){
        return zipCode;
    }
    /**
     * gets the country of the counselor
     * @return String country
     */
    public String getCountry(){
        return country;
    }
    /**
     * gets the gender of the counselor
     * @return String gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * gets the email of the counselor
     * @return String email
     */
    public String getEmail(){
        return email;
    }
    /**
     * gets the password of the counselor
     * @return String password
     */
    public String getPassword(){
        return password;
    }
    /**
     * gets the phone number
     * @return String phone number
     */
    public String getPhoneNumber(){
        return phoneNum;
    }
    /**
     * gets street of counselor
     * @return String street
     */
    public String getStreet(){
        return street;
    }
    /**
     * gets the allergy
     * @return array list of allergy
     */
    public ArrayList<String> getAllergy() {
        return allergies;
    }
    
    
    /**
     * gets the contacts 
     * @return String contact
     */
    public ArrayList<Contact> getContacts() {
        return contacts;
    }
    /**
     * gets the arraylist of medication
     * @return String medication
     */
    public ArrayList<Medication> getMedications() {
        return medication;
    }
    /**
     * gets the shirt size
     * @return String shirt size
     */
    public String getshirtSize(){
        return shirtSize; 
    } 

    public void addMedication(String medName, String medTime, String medDose){
        
    }
    /**
     * adds an allergy to the arraylist
     * @param allergy takes in an allergy
     */
    public void addAllergy(String allergy){
        allergies.add(allergy);
    }
    /**
     * gets a counselor by its id
     * @param ID takes in an id
     * @return a counselor
     */
    public Counselor getCounselorByID (String ID) {
        for(int i = 0; i < DataReader.getAllCounselors().size();i++) {
            if(DataReader.getAllCounselors().get(i).getUUID().equals(ID))
                return DataReader.getAllCounselors().get(i);
        }
        return null;
    }
    /**
     * gets the id of counselor
     */
    public String getUUID() {
        return UUid.toString();
    }
    public static void add(Counselor counselor) {
    
    
    }


}