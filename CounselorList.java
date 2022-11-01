import java.util.ArrayList;
import java.util.UUID;


public class CounselorList {

    private static CounselorList counselorsList;
    private static ArrayList<Counselor> counselors;

    private CounselorList(){

        counselors = DataReader.getAllCounselors();
    }

    public static CounselorList getInstance(){
        if (counselorsList == null){
            counselorsList = new CounselorList();
        }
        return counselorsList;
    }
    public ArrayList<Counselor> getAllCounselors()
    {
        return counselors;
    }
    public boolean login(String username, String password) {
        for(Counselor co: counselors) {
            if(co.email.equals(username) && co.password.equals(password))
                return true;
        }
        return false;
    }
    public Child addChildren(){


    }
    public Counselor getCounselorsByID(UUID id) {
        for (Counselor counselors : counselors) {
            if (counselors.getUUID().equals(id)) {
                return counselors;
            }
        }
        return null;
    }

}