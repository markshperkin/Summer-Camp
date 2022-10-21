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
                String birthday = (String)parentJSON.get("birthday");
                String street = (String)parentJSON.get("street");
                String town = (String)parentJSON.get("town"); 
                String state = (String)parentJSON.get("state"); 
                int zipCode = (int)parentJSON.get("zipCode"); 
                String country = (String)parentJSON.get("country");

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
                String birthday = (String)childJSON.get("birthday");
                String gender = (String) childJSON.get("gender");
                ArrayList <String> allergy = (ArrayList<String>) childJSON.get("allergy"); //TODO
                String medName = (String)childJSON.get("medName");
                String medTime = (String)childJSON.get("medTime");
                String medDose = (String)childJSON.get("medDose");
                String shirtSize = (String)childJSON.get("shirtSize");
                ArrayList <Contact> contacts = new ArrayList<Contact>(); //TODO
                
                children.add(new Child(fname, lname, birthday, gender, medDose, shirtSize));
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
                String street = (String) directorJSON.get("street");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}
