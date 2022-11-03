import java.util.Random;
import java.util.*;


public class Activity {
    private String title;
    private String description;
    private String location;
    private String clockHour;
    private String clockMinute;
    private String timeofday;
    private String action;
 
    
    private static final Random RANDOM = new Random();


    public Activity(String title, String description, String location, String clockHour, String clockMinute, String timeofday, String action) 
    {
        this.title = title;
        this.description = description;
        this.location = location;
        this.clockHour = clockHour;
        this.clockMinute = clockMinute;
        this.timeofday = timeofday;
        this.action = action;
    }

    public Activity(){}


    public String randomAction() { //static Action

        String a = " ";
        int r = RANDOM.nextInt(9);
        if(r==0) {
            a += Action.ARTS_AND_CRAFTS;    
        }else if(r==1) {
            a += Action.BREAKFAST;
        }else if(r==2) {
            a += Action.DINNER;
        }else if(r==3) {
            a += Action.LUNCH;
        }else if(r==4) {
            a += Action.FIELD_GAMES;
        }else if(r==5) {
            a += Action.HIKING;
        }else if(r==6) {
            a += Action.ROCK_WALL;
        }else if(r==7) {
            a += Action.SCAV_HUNT;
        }else if(r==8) {
            a += Action.ZIPLINING;
        }

        
        return a;    
    }

    public boolean hasAction(Action Action) {
        return true;
    }
    public String toString() {
        return title  + ", " + location + ", " + clockHour + ":" + clockMinute ;
    }

    public String getTitle() {
        return this.title;
    }
}
