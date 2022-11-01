import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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


}