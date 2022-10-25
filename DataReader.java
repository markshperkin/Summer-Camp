import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends DataConstants{
    
    private static final JSONObject JSONObject = null;

    public static ArrayList<Parent> getAllParents(){
        ArrayList<Parent> parents = new ArrayList<Parent>();

        try {
            FileReader parentReader = new FileReader(PARENT_FILE);
            JSONParser parser = new JSONParser();
            JSONArray parentsJSON = (JSONArray)new JSONParser().parse(parentReader);
            
            for(int i = 0; i < parentsJSON.size(); i++) {
                JSONObject parentJSON = (JSONObject) parentsJSON.get(i);
                String fname = (String)parentJSON.get(FIRSTNAME);
                String lname = (String)parentJSON.get(LASTNAME);
                String email = (String)parentJSON.get(EMAIL);
                String password = (String)parentJSON.get(PASSWORD);
                String phoneNum = (String)parentJSON.get(PHONENUMBER);
                String birthday = (String)parentJSON.get(BIRTHDAY);
                String street = (String)parentJSON.get(STREET);
                String town = (String)parentJSON.get(TOWN); 
                String state = (String)parentJSON.get(STATE); 
                int zipCode = (int)parentJSON.get(ZIPCODE); 
                String country = (String)parentJSON.get(COUNTRY);

                parents.add(new Parent(fname, lname, email, password, phoneNum, birthday, street, town, state, zipCode, country));
            }
            return parents;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Child> getAllChild(){
        ArrayList<Child> children = new ArrayList<Child>();

        try {
            FileReader childReader = new FileReader(CHILDS_FILE);
            JSONParser parser = new JSONParser();
            JSONArray childrenJSON = (JSONArray)new JSONParser().parse(childReader);
            
            for(int i = 0; i < childrenJSON.size(); i++) {
                JSONObject childJSON = (JSONObject) childrenJSON.get(i);
                String fname = (String)childJSON.get(FIRSTNAME);
                String lname = (String)childJSON.get(LASTNAME);
                String birthday = (String)childJSON.get(BIRTHDAY);
                String gender = (String) childJSON.get(GENDER);
                String shirtSize = (String)childJSON.get(SHIRSIZE);
                ArrayList <String> allergy = (ArrayList<String>) childJSON.get(ALLERGY); //TODO
                String medName = (String)childJSON.get(MEDNAME);
                String medTime = (String)childJSON.get(MEDTIME);
                String medDose = (String)childJSON.get(MEDDOSE);
                ArrayList <Contact> contacts = new ArrayList<Contact>(); //TODO
                String firstname =(String)childJSON.get(FIRSTNAME);
                String lastname=(String)childJSON.get(LASTNAME);
                String phonenumber=(String)childJSON.get(PHONENUMBER);
                String email=(String)childJSON.get(EMAIL);
                String relationship=(String)childJSON.get(RELATIONSHIP);

                
                children.add(new Child(fname, lname, birthday, gender, shirtSize));
            }

            return children;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Director> getAllDirectors() {
        ArrayList<Director> directors = new ArrayList<Director>();

        try {
            FileReader directorReader = new FileReader(DIRECTOR_FILE);
            JSONParser parser = new JSONParser();
            JSONArray directorsJSON = (JSONArray)new JSONParser().parse(directorReader);

            for(int i = 0; i < directorsJSON.size(); i++) {
                JSONObject directorJSON = (JSONObject) directorsJSON.get(i);
                String fname = (String)directorJSON.get(FIRSTNAME);
                String lname = (String)directorJSON.get(LASTNAME);
                String email = (String)directorJSON.get(EMAIL);
                String password = (String) directorJSON.get(PASSWORD);
                String phoneNum = (String) directorJSON.get(PHONENUMBER);
                String street = (String) directorJSON.get(STREET);
                String town =(String) directorJSON.get(TOWN);
                String zipCode =(String) directorJSON.get(ZIPCODE);
                String state =(String) directorJSON.get(STATE);
                String country=(String) directorJSON.get(COUNTRY);
                String birthday=(String) directorJSON.get(BIRTHDAY);
               

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Counselor> getAllCounselors() {
        ArrayList<Counselor> counselors = new ArrayList<Counselor>();

        try {
            FileReader counselorReader = new FileReader(COUNSELOR_FILE);
            JSONParser parser = new JSONParser();
            JSONArray counselorJSON = (JSONArray)new JSONParser().parse(counselorReader);

            for(int i = 0; i < counselorJSON.size(); i++) {
                JSONObject counselorsJSON = (JSONObject) counselorJSON.get(i);
                String fname = (String)counselorsJSON.get(FIRSTNAME);
                String lname = (String)counselorsJSON.get(LASTNAME);
                String email = (String)counselorsJSON.get(EMAIL);
                String password = (String) counselorsJSON.get(PASSWORD);
                String phoneNum = (String) counselorsJSON.get(PHONENUMBER);
                String street = (String) counselorsJSON.get(STREET);
                String town =(String) counselorsJSON.get(TOWN);
                String zipCode =(String) counselorsJSON.get(ZIPCODE);
                String state =(String) counselorsJSON.get(STATE);
                String country=(String) counselorsJSON.get(COUNTRY);
                String birthday=(String) counselorsJSON.get(BIRTHDAY);
                String aboutme=(String) counselorsJSON.get("aboutME");
                String gender=(String) counselorsJSON.get(GENDER);
                String allergy=(String) counselorsJSON.get(ALLERGY);
                String medication=(String) counselorsJSON.get("medication");
                String SSize=(String) counselorsJSON.get(SHIRSIZE);
                String str=(String)  counselorsJSON.get("strike");
                ArrayList <Contact> contacts = new ArrayList<Contact>(); 
                String firstname =(String)counselorsJSON.get(FIRSTNAME);
                String lastname=(String)counselorsJSON.get(LASTNAME);
                String phonenumber=(String)counselorsJSON.get(PHONENUMBER);
                String emails=(String)counselorsJSON.get(EMAIL);
                String relationship=(String)counselorsJSON.get(RELATIONSHIP);

               
        counselors.add(new Counselor(firstname, lastname, emails, password, phonenumber, birthday, street, town, state, i, country, gender, SSize));
            }
        return counselors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
}
}
