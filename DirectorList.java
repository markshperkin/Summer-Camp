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


} 
