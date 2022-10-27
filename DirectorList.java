public class DirectorList {
    private static DirectorList directorList;

    private DirectorList(){}

    public static DirectorList getInstance(){
        if (directorList == null){
            directorList = new DirectorList();
        }
        return directorList;
    }
}
