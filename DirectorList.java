import java.util.ArrayList;
import java.util.UUID;

public class DirectorList {
    private static DirectorList directorList;
    private ArrayList<Director>directors;

private DirectorList(){

    directors = DataReader.getAllDirectors();
}
    

    public static DirectorList getInstance(){
        if (directorList == null){
            directorList = new DirectorList();
        }
        return directorList;
    }
 public ArrayList<Director> getAllDirectors()
    {
        return directors;
    }

public boolean login(String username, String password) {
    for(Director d: directors) {
        if(d.email.equals(username) && d.password.equals(password))
            return true;
    }
    return false;
}

public void save(){
    DataWriter.saveDirector();
}
public void save1(){
    DataWriter.saveParents();
}
public void save2(){
    DataWriter.saveCounselors();
}
} 
