public class ChildsList {
    private static ChildsList childsList;

    private ChildsList(){}

    public static ChildsList getInstance(){
        if (childsList == null){
            childsList = new ChildsList();
        }
        return childsList;
    }
}
