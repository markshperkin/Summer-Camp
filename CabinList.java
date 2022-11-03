import java.util.ArrayList;

/**
 * Singleton list of cabin
 */
public class CabinList {
    private static CabinList cabinList;
    private ArrayList<Cabin> cabins;
    /**
     * Creates an instance of cabin list
     */
    private CabinList(){
        cabins = DataReader.getAllCabins();
    }
    /**
     * gets a cabin list and checks if its null
     * @return Returns an instance of cabin list
     */
    public static CabinList getInstance(){
        if (cabinList == null){
            cabinList = new CabinList();
        }
        return cabinList;
    }
    /**
     * adds a cabin to array list cabins
     * @param cabin takes in a cabin
     * @return returns true or false
     */
    public boolean addCabin(Cabin cabin) {
        if(cabin == null) 
            return false;
        cabins.add(cabin);
        save();
        return true;
    }
    /**
     * gets a cabin through its id
     * @param id takes in an id of a cabin
     * @return arraylist cabin
     */
    public Cabin getCabin(String id) {
        for(Cabin c: cabins) {
            if(c.getID().equals(id))
                return c;
        }
        return null;
        
    }

    /**
     * gets all cabins
     * @return cabins arraylist
     */
    public ArrayList<Cabin> getAllCabins() {
        for(Cabin c: cabins) {
            System.out.println(c);
        }
        return cabins;
    }

    
    /**
     * saves cabins
     */
    public void save() {
        DataWriter.saveCabins();
    }


}
