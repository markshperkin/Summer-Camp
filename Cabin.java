import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    public Random rand;
    private Counselor counselor;
    private String title;
    private String description;
    private String location;
    private int clockHour;
    private int clockMinute;
    

    public Cabin (String title, String description, String location, int clockHour, int clockMinute, Counselor counselor, ArrayList<Child> campers){
        
        this.title = title;
        this.description = description;
        this.location = location;
        this.clockHour = clockHour;
        this.clockMinute = clockMinute;
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
