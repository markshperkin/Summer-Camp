import java.util.ArrayList;
import java.util.UUID;

public class ParentsList {
    private static ParentsList parentsList;
    private ArrayList<Parent> parents;

    private ParentsList(){

        parents= DataReader.getAllParents();
    }

    public static ParentsList getInstance(){
        if (parentsList == null){
            parentsList = new ParentsList();
        }
        return parentsList;
    }

    public Parent getParent() {
        parents = DataReader.getAllParents();
        return null;
    }
    public Child addChildren()
    {
        
    }
    //Shows the parent Children
    public Child showChildren() {
        
       
    }
  
    public boolean login(String username, String password) {
        for(Parent p: parents) {
            if(p.email.equals(username) && p.password.equals(password))
                return true;
        }
        return false;
    }
    public void save(){
        DataWriter.saveParents();
    }
}
