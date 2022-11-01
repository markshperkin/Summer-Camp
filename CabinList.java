import java.util.ArrayList;

public class CabinList {
    private static CabinList cabinList;
    private ArrayList<Cabin> cabins;

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

    public ArrayList<Cabin> getAllCabins() {
        return cabins;
    }


}