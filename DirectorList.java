import java.util.ArrayList;
import java.util.UUID;

/**
 * Created the DirectorList of class
 */
public class DirectorList {
    private static DirectorList directorList;
    private ArrayList<Director> directors;

    /**
     * creating the Director the DirectorList of the datareader
     */
    private DirectorList() {

        // directors = DataReader.getAllDirectors();
        directors = new ArrayList<Director>();
    }

    /**
     * creating the directorList of the getinstance methods
     * 
     * @return directorlist
     */

    public static DirectorList getInstance() {
        if (directorList == null)
            directorList = new DirectorList();
        return directorList;
    }

    public void clear() {
        directors = new ArrayList<Director>();
    }

    public boolean addDirector(String fname, String lname, String email, String password, String phoneNum,
            String street, String town, String zipCode, String state, String country, String birthday, String gender) {
        Director director = new Director(fname, lname, email, password, phoneNum, street, town, zipCode, state, country,
                birthday, gender);

        directors.add(director);
        return true;
    }

    /**
     * creating the director getAll directors
     * 
     * @return directors
     */
    public ArrayList<Director> getAllDirectors() {
        return directors;
    }

    /**
     * this is boolean the login
     * 
     * @param username
     * @param password
     * @return true or false
     * 
     */
    public boolean login(String username, String password) {
        for (Director d : directors) {
            if (d.email.equals(username) && d.password.equals(password))
                return true;
        }
        return false;
    }

    /**
     * the method of the save directors
     */
    public void save() {
        DataWriter.saveDirector();
    }

    /**
     * the method of save Parents
     */
    public void save1() {
        DataWriter.saveParents();
    }

    /**
     * the method of the save Counselors
     */
    public void save2() {
        DataWriter.saveCounselors();
    }
}
