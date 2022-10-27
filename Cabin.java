import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    private ArrayList<Child> campersYoung;
    private ArrayList<Child> campersMid;
    private ArrayList<Child> campersOld;
    private ArrayList<Counselor> counselors;
    private Counselor counselor;
    private ArrayList<Cabin> allCabins ;
    private ArrayList<Activity> morningActivities;
    private ArrayList<Activity> midActivities;
    private ArrayList<Activity> afternoonActivities;
    private ArrayList<Activity> cabinActivities;
    private Activity activity;
    private Random rand;

    public Cabin (Counselor counselor, ArrayList<Child> campers, HashMap<Days,ArrayList<Activity>> schedule){
        this.counselor = counselor;
        schedule = new HashMap<Days,ArrayList<Activity>>();
        campers = new ArrayList<Child>();
        activity = new Activity();
        rand = new Random();
    }


    public Cabin(){}

    public void CreateSchedule(Activity activity){
        schedule.put(Days.MONDAY, new ArrayList<Activity>());
        schedule.put(Days.TUESDAY, new ArrayList<Activity>());
        schedule.put(Days.WEDNESDAY, new ArrayList<Activity>());
        schedule.put(Days.THURSDAY, new ArrayList<Activity>());
        schedule.put(Days.FRIDAY, new ArrayList<Activity>());
    }

    public void addCamper(Child camper){
        campers.add(camper); 
    }

    public void setCampers(){
        for (int x = 0; x < campers.size(); x++){
            if (campers.get(x).getYear() > 2014){
                campersYoung.add(campers.get(x));
            }
            else if (campers.get(x).getYear() < 2014 && campers.get(x).getYear() > 2011){
                campersMid.add(campers.get(x));
            }
            else if (campers.get(x).getYear() < 2011){
                campersOld.add(campers.get(x));
            }
        }
    }

    public ArrayList<Child> getYoungCampers(){
        return campersYoung;
    }

    public ArrayList<Child> getMidCampers(){
        return campersMid;
    }

    public ArrayList<Child> getOldCampers(){
        return campersOld;
    }

    public void addCounselor(Counselor counselor){
        counselors.add(this.counselor);
    }

    public ArrayList<Counselor> getCounselor() {
        return counselors;
    }

    public void addActivities(Activity activity){
        morningActivities.add(new Activity("Kayaking", "Lake", 9,30, Action.KAYAKING));
        morningActivities.add(new Activity("Zipliing", "Forest", 9,30, Action.KAYAKING));
        midActivities.add(new Activity("Arts and Crafts", "Communal Cabin", 12,30, Action.KAYAKING));
        midActivities.add(new Activity("Field Games", "Field", 12,30, Action.KAYAKING));
        afternoonActivities.add(new Activity("Rock Wall", "West Camp", 4,30, Action.KAYAKING));
        afternoonActivities.add(new Activity("Hiking", "Forest", 4,30, Action.KAYAKING));
        afternoonActivities.add(new Activity("Scavenger Hunt", "Field", 4,30, Action.KAYAKING));
    }

    public ArrayList<Activity> getActions(){
        cabinActivities.clear();
        int max = 7;
        int randNum = rand.nextInt(max);
        cabinActivities.add(morningActivities.get(randNum));
        cabinActivities.add(midActivities.get(randNum));
        cabinActivities.add(afternoonActivities.get(randNum));
        return cabinActivities;
    }

    public void createSchedule(){
        schedule.put(Days.MONDAY, getActions());
        schedule.put(Days.TUESDAY, getActions());
        schedule.put(Days.WEDNESDAY, getActions());
        schedule.put(Days.THURSDAY, getActions());
        schedule.put(Days.FRIDAY, getActions());
    }

    public HashMap<Days,ArrayList<Activity>> getSchedule(){
        return schedule;
    }

    public ArrayList<Cabin> getCabins(){
        for (int x = 0; x < 3; x++){
            Cabin newCabin = new Cabin (counselors.get(x), getYoungCampers(), getSchedule());
            allCabins.add(newCabin);
        }
        for (int x = 3; x < 6; x++){
            Cabin newCabin = new Cabin (counselors.get(x), getMidCampers(), getSchedule());
            allCabins.add(newCabin);
        }
        for (int x = 6; x < 9; x++){
            Cabin newCabin = new Cabin (counselors.get(x), getOldCampers(), getSchedule());
            allCabins.add(newCabin);
        }
        return allCabins;
    }

}
