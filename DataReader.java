import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends DataConstants{
    
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
                String phoneNum;
                String birthday;
                String street;
                String town; 
                String state; 
                int zipCode; 
                String country;
            }
        }
        return null;
    }
}
