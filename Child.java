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
    public ArrayList<String> medication;
  


    public Child (String firstName, String lastName, String birthday, String gender, String shirtSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.shirtSize = shirtSize;
        contacts = new ArrayList<>();
        medication= new ArrayList<>();

    }

    public Child(){
        
    }

    public void addContact (Contact contact){
        contacts.add(contact);

    }

    public void strikeCount(){

    }

    public void addAllergy(String allergy){
        medication.add(this.allergy);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
