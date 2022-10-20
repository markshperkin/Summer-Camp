import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends DataConstants{
    
    public static ArrayList<Parent> getAllParents(){
        ArrayList<Parent> parents = new ArrayList<Parent>();

        try {
            FileReader parentReader = new FileReader(parentFile);
            JSONParser parser = new JSONParser();
            JSONArray parentJSON = (JSONArray)new JSONParser().parse(parentReader);
        }
        return null;
    }
    
    public static ArrayList<Child> getAllChilds() {
        return null;
    }

    public static ArrayList<Director> getAllDirectors() {
        return null;
    }

    public static ArrayList <Counselor> getAllConselors() {
        return null;
    }
}
