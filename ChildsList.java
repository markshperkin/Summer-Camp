import java.util.ArrayList;

public class ChildsList {
    private static ChildsList childsList;
    private ArrayList<Child> children;

    private ChildsList(){
        children = DataReader.getAllChild();
    }
    
    public static ChildsList getInstance(){
        if (childsList == null){
            childsList = new ChildsList();
        }
        return childsList;
    }
   public ArrayList<Child> getAllChild()
   {
       return children;
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

    
}
