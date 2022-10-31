import java.util.ArrayList;

public class CabinList {
    private static CabinList cabinList;
    private static ArrayList<Cabin> cabins;

    private CabinList(){}

    public static CabinList getInstance(){
        if (cabinList == null){
            cabinList = new CabinList();
        }
        return cabinList;
    }
    

    public Cabin getCabin() {
        return null;
        
    }

    public static ArrayList<Cabin> getAllCabins() {
        return cabins;
    }


}