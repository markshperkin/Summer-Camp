public class CabinList {
    private static CabinList cabinList;

    private CabinList(){}

    public static CabinList getInstance(){
        if (cabinList == null){
            cabinList = new CabinList();
        }
        return cabinList;
    }
}