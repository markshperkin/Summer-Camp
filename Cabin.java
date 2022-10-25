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

    }

    public void CreateSchedule(Activity activity){

    }

    public void addCamper(Child camper){

    }

    public static String viewSchedule(){
        return "schedule";
    }
    public boolean hasTheme(Theme theme) {
        return true;
    }
    public void addTheme(Theme theme) {
        
    }
}
