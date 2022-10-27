import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    public Random rand;
    private Counselor counselor;
    
    

    public Cabin (Counselor counselor, ArrayList<Child> campers){
        
      
        this.counselor = counselor;
        rand = new Random();
    }

    public void CreateSchedule(Activity activity){


        schedule.put(Days.MONDAY, new ArrayList<Activity>());
        schedule.put(Days.TUESDAY, null);
        schedule.put(Days.WEDNESDAY, null);
        schedule.put(Days.THURSDAY, null);
        schedule.put(Days.FRIDAY, null);
    }

    public void addCamper(Child camper){

        campers.add(camper);
    }

    public static String viewSchedule(){
        return "schedule";
    }
    

}
