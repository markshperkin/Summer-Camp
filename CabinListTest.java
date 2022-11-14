import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CabinListTest{

    Counselor counselor;
    ArrayList<String> camper;
    HashMap<Days,ArrayList<Activity>> schedule;
    Cabin cabin;
    
    public void CabinListTest(){
        counselor = new Counselor("sfjlsdjf", "ava", "turner", "usc123", "usc1234", "123-456-7890", "08/01/03", "female", "m", "1015 assembly street", "columbia", "south caroline", "29201", "usa", "i'm a new counselor");
        camper = new ArrayList<String>();
        schedule = new HashMap<Days,ArrayList<Activity>> ();
        cabin = new Cabin(counselor, camper, schedule);
    }

    public void testCabinAddValid() {
        boolean result = CabinList.getInstance().addCabin(cabin);
        assertTrue(result);
    }

    @Test
    public void testCabinAddDuplicate() {
        boolean result = CabinList.getInstance().getAllCabins().equals(CabinList.getInstance().getAllCabins());
        assertFalse(result);
    }

    public void testCabinAddNullCounselor() {
        boolean result = CabinList.getInstance().addCabin(new Cabin (null, camper, schedule));
        assertFalse(result);
    }

    public void testCabinAddNullCampers() {
        boolean result = CabinList.getInstance().addCabin(new Cabin (counselor, null, schedule));
        assertFalse(result);
    }

    public void testCabinAddNullSchedule() {
        boolean result = CabinList.getInstance().addCabin(new Cabin (counselor, camper, null));
        assertFalse(result);
    }

    public void testGetAllCabinsValid() {
        int size = CabinList.getInstance().getAllCabins().size();
        assertEquals(2, size);
    }

    public void testGetAllCabinsZero() {
        CabinList.getInstance().clear();
        int size = CabinList.getInstance().getAllCabins().size();
        assertEquals(0, size);
    }

    
}