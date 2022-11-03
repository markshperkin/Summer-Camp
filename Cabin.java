import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;


public class Cabin {
    private HashMap<Days,ArrayList<Activity>> schedule;
    private ArrayList<Child> campers;
    private ArrayList<Child> campers1;
    private ArrayList<Child> campers2;
    private ArrayList<Child> campers3;
    private ArrayList<Child> campers4;
    private ArrayList<Child> campers5;
    private ArrayList<Child> campers6;
    private ArrayList<Counselor> counselors;
    private Counselor counselor;
    public ArrayList<Cabin> allCabins ;
    private ArrayList<Activity> morningActivities;
    private ArrayList<Activity> midActivities;
    private ArrayList<Activity> afternoonActivities;
    private ArrayList<Activity> allActivities;
    private ArrayList<Activity> cabinActivities;
    private Activity activity;
    private Random rand;
    public String id;
    public String cMP;


    public Cabin (Counselor counselor, ArrayList<String> camper, HashMap<Days,ArrayList<Activity>> schedule){
        this.counselor = counselor;
        schedule = new HashMap<Days,ArrayList<Activity>>();
        activity = new Activity();
        rand = new Random();
        this.id = UUID.randomUUID().toString();
        this.cMP=cMP;
    }

    public String getID() {
        return id;
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
            if (campers.get(x).getYear() == 2014 || campers.get(x).getYear() == 2015){
                campers1.add(campers.get(x));
            }
            else if (campers.get(x).getYear() == 2013 || campers.get(x).getYear() == 2012){
                campers2.add(campers.get(x));
            }
            else if (campers.get(x).getYear() == 2011 || campers.get(x).getYear() == 2010){
                campers3.add(campers.get(x));
            }
            else if (campers.get(x).getYear() == 2009 || campers.get(x).getYear() == 2008){
                campers4.add(campers.get(x));
            }
            else if (campers.get(x).getYear() == 2007 || campers.get(x).getYear() == 2006){
                campers5.add(campers.get(x));
            }
            else if (campers.get(x).getYear() == 2005 || campers.get(x).getYear() == 2004){
                campers6.add(campers.get(x));
            }
        }
    }
    public String getcMP(){

        return cMP;
    }
    public ArrayList<Child> getCampers1(){
        return campers1;
    }

    public ArrayList<Child> getCampers2(){
        return campers2;
    }

    public ArrayList<Child> getCampers3(){
        return campers3;
    }

    public ArrayList<Child> getCampers4(){
        return campers4;
    }
    public ArrayList<Child> getCampers5(){
        return campers5;
    }
    public ArrayList<Child> getCampers6(){
        return campers6;
    }

    public void addCounselor(Counselor counselor){
        counselors.add(counselor);
    }

    public ArrayList<Counselor> getCounselor() {
        return counselors;
    }

    public void addActivities(Activity activity){
        morningActivities.add(new Activity("Kayaking", "fun in the lake", "Lake", 9,30, "AM", "KAYAKING"));
        morningActivities.add(new Activity("Zipliing", "fun in the forest", "Forest", 9,30, "AM", "ZIPLINING"));
        midActivities.add(new Activity("Arts and Crafts", "use your creativity", "Communal Cabin", 12,30, "PM", "ARTS AND CRAFTS"));
        midActivities.add(new Activity("Field Games", "use your energy", "Field", 12,30, "PM", "FIELD GAMES"));
        afternoonActivities.add(new Activity("Rock Wall", "do something new", "West Camp", 4,30, "PM", "ROCK WALL"));
        afternoonActivities.add(new Activity("Hiking", "fun in the forest", "Forest", 4,30, "PM", "HIKING"));
        afternoonActivities.add(new Activity("Scavenger Hunt", "search and find", "Field", 4,30, "PM", "SCAVENGER HUNT"));
    }

    public ArrayList<Activity> getAllActivities(){
        allActivities.add(new Activity("Kayaking", "fun in the lake", "Lake", 9,30, "AM", "KAYAKING"));
        allActivities.add(new Activity("Zipliing", "fun in the forest", "Forest", 9,30, "AM", "ZIPLINING"));
        allActivities.add(new Activity("Arts and Crafts", "use your creativity", "Communal Cabin", 12,30, "PM", "ARTS AND CRAFTS"));
        allActivities.add(new Activity("Field Games", "use your energy", "Field", 12,30, "PM", "FIELD GAMES"));
        allActivities.add(new Activity("Rock Wall", "do something new", "West Camp", 4,30, "PM", "ROCK WALL"));
        allActivities.add(new Activity("Hiking", "fun in the forest", "Forest", 4,30, "PM", "HIKING"));
        allActivities.add(new Activity("Scavenger Hunt", "search and find", "Field", 4,30, "PM", "SCAVENGER HUNT"));
        return allActivities;
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
        schedule.put(Days.SATURDAY,getActions());
        schedule.put(Days.SUNDAY,getActions());
    }

    public HashMap<Days,ArrayList<Activity>> getSchedule(){
        return schedule;
    }

    public ArrayList<Cabin> getCabins(){
        for (int x = 0; x < 6; x++){
            if (x == 1){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers1(), getSchedule());
                allCabins.add(newCabin);
            }
            else if (x == 2){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers2(), getSchedule());
                allCabins.add(newCabin);
            }
            else if (x == 3){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers3(), getSchedule());
                allCabins.add(newCabin);
            }
            else if (x == 4){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers4(), getSchedule());
                allCabins.add(newCabin);
            }
            else if (x == 5){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers5(), getSchedule());
                allCabins.add(newCabin);
            }
            else if (x == 6){
                Cabin newCabin = new Cabin (counselors.get(x), getCampers6(), getSchedule());
                allCabins.add(newCabin);
            }
        }
        return allCabins;
    }

}
