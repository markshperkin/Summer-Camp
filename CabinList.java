import java.util.ArrayList;

public class CabinList {
    private static CabinList cabinList;
    private ArrayList<Cabin> cabins;

    private CabinList(){
        cabins = DataReader.getAllCabins();
    }

    public static CabinList getInstance(){
        if (cabinList == null){
            cabinList = new CabinList();
        }
        return cabinList;
    }
    
    public boolean addCabin(Cabin cabin) {
        if(cabin == null) 
            return false;
        cabins.add(cabin);
        save();
        return true;
    }
    public Cabin getCabin(String id) {
        for(Cabin c: cabins) {
            if(c.getID().equals(id))
                return c;
        }
        return null;
        
    }

    public void getAllCabins() {
        for(Cabin c: cabins) {
            System.out.println(c);
            
        }
    }

    public void save() {
        DataWriter.saveCabins();
    }


}