import java.util.ArrayList;
import java.util.UUID;

public class Child {
    public String firstName;
    public String lastName;
    public String birthday;
    public String gender;
    public String medName;
    public String medtime;
    public String medDose;
    public String allergy;
    public String strikeCount;
    public String shirtSize;
    public ArrayList<Contact> contacts;
    public ArrayList<Medication> medication;
    public ArrayList<String> allergies;
    public int monthInt;
    public int dayInt;
    public int yearInt;
    private UUID id;
  


    public Child (String firstName, String lastName, String birthday, String gender, String shirtSize, ArrayList<Contact> contacts, ArrayList<Medication> medication){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        this.contacts = contacts;
        this.medication = medication;
        this.id = UUID.randomUUID();

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

    public int getYear(){
        return yearInt;
    }

    public UUID getUUID() {
        return id;
    }

}
