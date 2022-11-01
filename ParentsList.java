import java.util.ArrayList;

public class ParentsList {
    private static ParentsList parentsList;
    private ArrayList<Parent> parents;

    private ParentsList(){}

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
}
