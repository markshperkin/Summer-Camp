import java.util.Random;
import java.util.*;

//import javax.swing.Action;

public class Activity {
    private String title;
    private String description;
    private String location;
    private int clockHour;
    private int clockMinute;
    private Action action;
    
    
    private static final Random RANDOM = new Random();


    public Activity(String title, String description, String location, int clockHour
    , int clockMinute, Action action) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.clockHour = clockHour;
        this.clockMinute = clockMinute;
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
        return title + ", " + description + ", " + location + ", " + clockHour + ":" + clockMinute ;
    }
}
