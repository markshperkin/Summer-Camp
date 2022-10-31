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
}
