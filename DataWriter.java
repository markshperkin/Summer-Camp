import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants{
    
    public static void saveChild(){

        ChildsList child =ChildsList.getInstance();
        ArrayList<Child> ChildsList = child.getAllChild();
        JSONArray JSONChilds =new JSONArray();

        for(int i=0;i<ChildsList.size(); i++){
            JSONChilds.add(getChildsJSON(ChildsList.get(i)));

        }
        try(FileWriter file =new FileWriter(CHILDS_FILE))
        {
             file.write(JSONChilds.toJSONString());
             file.flush();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
      
    }
    public static void saveParents(){

        ParentsList parent =ParentsList.getInstance();
        ArrayList<Parent> ParentsList = parent.getAllParents();
        JSONArray JSONParents =new JSONArray();

        for(int i=0;i<ParentsList.size(); i++){
            JSONParents.add(getParentsJSON(ParentsList.get(i)));

        }
        try(FileWriter file =new FileWriter(PARENT_FILE))
        {
             file.write(JSONParents.toJSONString());
             file.flush();

        } 
        catch(IOException e){
            e.printStackTrace();
        }
}
public static void saveDirector(){

    DirectorList directors =DirectorList.getInstance();
    ArrayList<Director> DirectorList = directors.getAllDirectors();
    JSONArray JSONDirectors =new JSONArray();

    for(int i=0;i<DirectorList.size(); i++){
        JSONDirectors.add(getDirectorsJSON(DirectorList.get(i)));

    }
    try(FileWriter file =new FileWriter(DIRECTOR_FILE))
    {
         file.write(JSONDirectors.toJSONString());
         file.flush();

    } 
    catch(IOException e){
        e.printStackTrace();
    }
}
public static void saveCounselors(){

    CounselorList counselors =CounselorList.getInstance();
    ArrayList<Counselor> CounselorList = counselors.getAllCounselors();
    JSONArray JSONCounselors =new JSONArray();

    for(int i=0;i<CounselorList.size(); i++){
        JSONCounselors.add(getCounselorsJSON(CounselorList.get(i)));

    }
    try(FileWriter file =new FileWriter(COUNSELOR_FILE))
    {
         file.write(JSONCounselors.toJSONString());
         file.flush();

    } 
    catch(IOException e){
        e.printStackTrace();
    }
}
public static void saveCabins(){

    CabinList cabins =CabinList.getInstance();
    ArrayList<Cabin> CabinList = cabins.getAllCabins();
    JSONArray JSONCabins =new JSONArray();

    for(int i=0;i<CabinList.size(); i++){
        JSONCabins.add(getCabinsJSON(CabinList.get(i)));

    }
    try(FileWriter file =new FileWriter(CABIN_FILE))
    {
         file.write(JSONCabins.toJSONString());
         file.flush();

    } 
    catch(IOException e){
        e.printStackTrace();
    }
}

public static JSONObject getChildsJSON(Child child){

    HashMap<String,Object> Childinfo =new HashMap<String,Object>();
    Childinfo.put(CHILD_ID,child.getID().toString());
    Childinfo.put(CHILD_FIRST,child.getFirstName());
    Childinfo.put(CHILD_LAST,child.getLastName());
    Childinfo.put(CHILD_BIRTH,child.getBirthday());
    Childinfo.put(CHILD_GENDER,child.getgender());
    Childinfo.put(CHILD_SHIRTSIZE,child.getShirtSize());
    Childinfo.put(CHILD_STRIKE,child.getStrike());
    Childinfo.put(CHILD_ALLEGERY,child.getAllergies());

    JSONArray JSONmedication =new JSONArray();

    for(int i=0;i<child.getMedications().size();i++){
        HashMap<String, Object> Childmed =new HashMap<String, Object>();
        Medication medication=child.getMedications().get(i);
        Childmed.put(CHILD_MEDNAME,medication.getMedName());
        Childmed.put(CHILD_MEDTIME,medication.getMedTime());
        Childmed.put(CHILD_MEDDOSE,medication.getMedDose());
        JSONObject ChildmedJSON =new JSONObject();

        JSONmedication.add(ChildmedJSON);
    }

    Childinfo.put(CHILD_MEDICATION,JSONmedication);

    JSONArray JSONcontacts = new JSONArray();
    for(int i=0; i<child.getContacts().size();i++){
        HashMap<String, Object> childcon= new HashMap<String, Object>();
        Contact contact =child.getContacts().get(i);
        childcon.put(CHILD_CONTACT_FIRST,contact.getFirstName());
        childcon.put(CHILD_CONTACT_LAST,contact.getLastName());
        childcon.put(CHILD_CONTACT_EMAIL,contact.getEmail());
        childcon.put(CHILD_CONTACT_PHONEN,contact.getPhoneNum());
        childcon.put(CHILD_CONTACT_RELAT,contact.getRelationship());
        JSONObject childconJSON = new JSONObject(childcon);

       JSONcontacts.add(childconJSON);
    }
       Childinfo.put(CHILD_CONTACT,JSONcontacts);

       JSONObject ChildinfoJSON= new JSONObject(Childinfo);
       return ChildinfoJSON;

}
public static JSONObject getParentsJSON(Parent parent){
    HashMap<String, Object> ParentsInfo= new HashMap<String, Object>();
    ParentsInfo.put(ID,UUID.randomUUID().toString());
    ParentsInfo.put(FIRSTNAME,parent.getfirstname());
    ParentsInfo.put(LASTNAME,parent.getlastname());
    ParentsInfo.put(EMAIL,parent.getEmail());
    
    ParentsInfo.put(PHONENUMBER,parent.getphonenum());
    ParentsInfo.put(STREET,parent.getstreet());
    ParentsInfo.put(TOWN,parent.gettown());
    ParentsInfo.put(ZIPCODE,parent.getstate());
    ParentsInfo.put(COUNTRY,parent.getcountry());
    ParentsInfo.put(GENDER,parent.getGender());
    //ParentsInfo.put(PARENT_CHILD,parent.getUUID().toString()); //TODO FIX THIS THIS JUST GETS AN EXISTING USERS ID

    JSONObject ParentInfoJSON = new JSONObject(ParentsInfo);
    
    return ParentInfoJSON;

}   

public static JSONObject getCounselorsJSON(Counselor counselor) {
    HashMap<String,Object> Counselorsinfo = new HashMap<String,Object>();
    Counselorsinfo.put(ID, counselor.getUUID().toString());
    Counselorsinfo.put(FIRSTNAME, counselor.getFirstName());
    Counselorsinfo.put(LASTNAME, counselor.getLastName());
    Counselorsinfo.put(EMAIL, counselor.getEmail());
    Counselorsinfo.put(PASSWORD, counselor.getPassword());
    Counselorsinfo.put(PHONENUMBER, counselor.getPhoneNumber());
    Counselorsinfo.put(STREET, counselor.getStreet());
    Counselorsinfo.put(ZIPCODE, counselor.getZipCode());
    Counselorsinfo.put(COUNTRY, counselor.getCountry());
    Counselorsinfo.put(BIRTHDAY, counselor.getBirthday());
    Counselorsinfo.put(ABOUTME, counselor.getAboutme());
    Counselorsinfo.put(GENDER, counselor.getGender());
    Counselorsinfo.put(ALLERGY, counselor.getAllergy());
    Counselorsinfo.put(MEDICATION, counselor.getMedications());
    Counselorsinfo.put(SHIRSIZE, counselor.getshirtSize());

    JSONArray JSONcontacts = new JSONArray();
    for(int i=0; i<counselor.getContacts().size();i++){
        HashMap<String, Object> counselorcon= new HashMap<String, Object>();
        Contact contact = counselor.getContacts().get(i);
        counselorcon.put(FIRSTNAME,contact.getFirstName());
        counselorcon.put(LASTNAME ,contact.getLastName());
        counselorcon.put(EMAIL,contact.getEmail());
        counselorcon.put(PHONENUMBER,contact.getPhoneNum());
        counselorcon.put(RELATIONSHIP,contact.getRelationship());
        JSONObject counselorconJSON = new JSONObject(counselorcon);

       JSONcontacts.add(counselorconJSON);
    }

    Counselorsinfo.put(CONTACTS, JSONcontacts);

    JSONObject CounselorsinfoJSON = new JSONObject(Counselorsinfo);
    return CounselorsinfoJSON;
}
public static JSONObject getDirectorsJSON(Director director)
{
    HashMap<String, Object>Directorsinfo=new HashMap<String,Object>();
    Directorsinfo.put(ID,director.getUUID());
    Directorsinfo.put(FIRSTNAME, director.getfirstname());
    Directorsinfo.put(LASTNAME, director.getlastname());
    Directorsinfo.put(EMAIL, director.getEmail());
    Directorsinfo.put(PASSWORD, director.getPassword());
    Directorsinfo.put(PHONENUMBER,director.getphonenum());
    Directorsinfo.put(STREET,director.getstreet());
    Directorsinfo.put(TOWN,director.gettown());
    Directorsinfo.put(ZIPCODE,director.getzipCode());
    Directorsinfo.put(COUNTRY,director.getCountry());
    Directorsinfo.put(BIRTHDAY, director.getbirthday());

    JSONObject DirectorinfoJSON =new JSONObject(Directorsinfo);
    return DirectorinfoJSON;
}
 public static JSONObject getCabinsjson(Cabins cabin){
    HashMap<String, Object>Cabininfo=new HashMap<String, Object>();
    Cabinsinfo.put()
 }

}