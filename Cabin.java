import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    public Random rand;
    private Counselor counselor;
    private int ageRange;
    
    

    public Cabin (Counselor counselor, ArrayList<Child> campers, int ageRange){
        this.ageRange = ageRange;
        this.counselor = counselor;
        rand = new Random();
        schedule = new HashMap<Days,ArrayList<Activity>>();
    }

    public Counselor getCounselor() {
        return counselor;

    }

    public void CreateSchedule(Activity activity){



        schedule.put(Days.MONDAY, new ArrayList<Activity>());
        schedule.put(Days.TUESDAY, new ArrayList<Activity>());
        schedule.put(Days.WEDNESDAY, new ArrayList<Activity>());
        schedule.put(Days.THURSDAY, new ArrayList<Activity>());
        schedule.put(Days.FRIDAY, new ArrayList<Activity>());
    }

    public void addCamper(Child camper){
//up to nine campers
        campers.add(camper);
    }

    public static String viewSchedule(){
        return "Schedule";
    }
    
    public boolean withinAgeRange() {
        return true;
    }

}
