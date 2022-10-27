public class ParentsList {
    private static ParentsList parentsList;

    private ParentsList(){}

    public static ParentsList getInstance(){
        if (parentsList == null){
            parentsList = new ParentsList();
        }
        return parentsList;
    }
}
