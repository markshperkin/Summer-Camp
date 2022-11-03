import java.util.ArrayList;
import java.util.UUID;

/**
 * Singleton list of parent
 */
public class ParentsList {
    private static ParentsList parentsList;
    private ArrayList<Parent> parents;
    /**
     * Creates an instance of parent list
     */
    private ParentsList(){
        parents= DataReader.getAllParents();
    }
    /**
     * adds a parent to the arraylist of parents
     * @param parent takes in a parent
     */
    public void addParentToList(Parent parent) {
        parents.add(parent);
    }
    /**
     * gets a parent list and makes sure its null
     * @return This returns an instance of parents list
     */
    public static ParentsList getInstance(){
        if (parentsList == null)
            parentsList = new ParentsList();
        return parentsList;
    }
    /**
     * gets a parent
     * @return
     */
    public Parent getParent() {
        parents = DataReader.getAllParents();
        return null;
    }
        
    //Shows the parent Children
    public void showChildren() {
        
       
    }
    /**
     * gets all of the parents in array list
     * @return array list parent
     */
    public ArrayList<Parent> getAllParents()
    {
        return parents;
    }
    /**
     * logins in the parent
     * @param username takes in a username
     * @param password takes in a password
     * @return true or false
     */
    public boolean login(String username, String password) {
        for(Parent p: parents) {
            if(p.email.equals(username) && p.password.equals(password))
                return true;
        }
        return false;
    }
    /**
     * saves parents to data writer
     */
    public void save(){
        DataWriter.saveParents();
    }
}
