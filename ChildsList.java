import java.util.ArrayList;

/**
 * Singleton list of children
 */
public class ChildsList {
    private static ChildsList childsList;
    private ArrayList<Child> children;
    /**
     * Creates an instance of child list
     */
    private ChildsList(){
        children = DataReader.getAllChild();
    }
    /**
     * Gets a child list and makes sure if it's null
     * @return This returns an instance of the child list
     */
    public static ChildsList getInstance(){
        if (childsList == null){
            childsList = new ChildsList();
        }
        return childsList;
    }
    /**
     * This looks to see if there is a child with a specific id in the child list
     * @param id The id being revised
     * @return Return true or false depending on if statement
     */
    public boolean haveChild(String id) {
        for(Child child : children) {
            if(child.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }
    /**
     * The arraylist of all childrent
     * @return Returns the child array list
     */
    public ArrayList<Child> getAllChild()
    {
       return children;
    }
    /**
     * adds a child to the list of children
     * @param child child in parameter being added
     * @return true or false depending on if statement
     */
    public boolean addChild(Child child) {
        if(child == null || haveChild(child.getID())){
            return false;
        }
        else
        children.add(child);
        save();
        return true;
    }
    public void showAllChildren() {
        for(Child c: children) {
            System.out.println(c);
        }
    }

    public Child showChild(String UUID) {
        for(Child c: children) {
            if(c.id.equals(UUID)) {
                return c;
            }
        }
        return null;
    }
    
    /**
     * Saves a child list to JSON file
     */
    public void save() {
        DataWriter.saveChild();
    }
    
}
