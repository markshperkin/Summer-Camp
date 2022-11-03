import java.util.ArrayList;
import java.util.UUID;

/**
 * creating a class of the counselorList
 */
public class CounselorList {
/**
 * creating the creating the private for the counselorList 
 */
    private static CounselorList counselorsList;
    private static ArrayList<Counselor> counselors;
/**
 * creating of the conselorsList
 */
    private CounselorList(){
        counselors = DataReader.getAllCounselors();
    }
/**
 * creating a counselorList of the getinstance
 * @return counselors
 */
    public static CounselorList getInstance(){
        if (counselorsList == null)
            counselorsList = new CounselorList();
        return counselorsList;
    }
/**
 * publi
 * @param username
 * @param password
 * @return
 */

    public boolean login(String username, String password) {
        for(Counselor p: counselors) {
            if(p.email.equals(username) && p.password.equals(password))
                return true;
        }
        return false;
    }

    public ArrayList<Counselor> getAllCounselors() {
        for(Counselor c: counselors) 
            System.out.println(c);
            return counselors;
    }

    public Counselor getCounselorsByID(UUID id) {
        for (Counselor counselors : counselors) {
            if (counselors.getUUID().equals(id)) {
                return counselors;
            }
        }
     return  null;
    }

    public boolean addCounselor(Counselor counselor) {
        if(counselor == null)
            return false;
        counselors.add(counselor);
        save();
        return true;
    }

    public void save() {
        DataWriter.saveCounselors();
    }
}