public class CounselorList {

    private static CounselorList counselorsList;

    private CounselorList(){}

    public static CounselorList getInstance(){
        if (counselorsList == null){
            counselorsList = new CounselorList();
        }
        return counselorsList;
    }

}