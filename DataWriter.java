import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants{
    
    public static void saveChild(String firstName, String lastName, String birthday, String gender, String strikeCount,
    String shirtSize, ArrayList<Contact> contacts, ArrayList<Medication> medication)
    {
       JSONObject newChild = new JSONObject();
       newChild.put(FIRSTNAME, firstName);
       newChild.put(LASTNAME, lastName);
       newChild.put(BIRTHDAY, birthday);
       newChild.put(GENDER,gender);
       newChild.put(STRIKE, strikeCount);
       
       JSONArray list = new JSONArray();
       for(int i = 0; i < medication.size(); i++) {
        list.add(medication.get(i));
       }

       JSONArray list2 = new JSONArray();
       for(int j = 0; j < contacts.size(); j++) {
        list2.add(contacts.get(j));
       }

       newChild.put(MEDICATION, list);
       newChild.put(CONTACTS, list2);

       try {
        FileWriter file = new FileWriter(CHILDS_FILE);
        file.write(newChild.toString());
       } catch (Exception e) {
        e.printStackTrace();
       }
       System.out.println(newChild);
    }
}


