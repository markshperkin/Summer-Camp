import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    private Counselor counselor;
    public Theme theme;
    public Random rand;

    public Cabin (Counselor counselor){
        this.counselor = counselor;
        rand = new Random();
        campers = new ArrayList<Child>();
        this.theme = Theme.DINOSAUR_WEEK;
        schedule.put(Days.MONDAY, new ArrayList<Activity>());
        schedule.put(Days.TUESDAY, null);
        schedule.put(Days.WEDNESDAY, null);
        schedule.put(Days.THURSDAY, null);
        schedule.put(Days.FRIDAY, null);


    }

    public void CreateSchedule(Activity activity){

    }

    public void addCamper(Child camper){

        campers.add(camper);
    }

    public void viewSchedule(){

    }
    public Theme getTheme() {
        return this.theme;
    }

    public boolean hasTheme(Theme theme) {
        return true;
    }
    public void addTheme(Theme theme) {
        
    }
}
