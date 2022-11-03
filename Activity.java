import java.util.Random;
import java.util.*;

//import javax.swing.Action;
/**
 * Creates an activity class
 */

public class Activity {
    private String title;
    private String description;
    private String location;
    private int clockHour;
    private int clockMinute;
    private String timeofday;
    private String action;

    private static final Random RANDOM = new Random();
    /**
     * Constructor for activity
     * @param title A string of activity title
     * @param description A string of activity description
     * @param location A string of activity location
     * @param i A string of activity clock hour
     * @param j A string of activity clock minute
     * @param timeofday A string of activity time of day
     * @param action A string of activity action
     */
    public Activity(String title, String description, String location, int i, int j, String timeofday, String action) 
    {
        this.title = title;
        this.description = description;
        this.location = location;
        this.clockHour = i;
        this.clockMinute = j;
        this.timeofday = timeofday;
        this.action = action;
    }

    public Activity(){}
    /**
     * randomly chooses an action from the enum class
     * @return A string representation of the action
     */
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
    /**
     * sees if there is an action in activity
     * @param Action enum action
     * @return true or false of there being an activity
     */
    public boolean hasAction(Action Action) {
        return true;
    }
    /**
     * returns the title, location, clock hour, and clock minute
     */
    public String toString() {
        return title  + ", " + location + ", " + clockHour + ":" + clockMinute ;
    }
    /**
     * gets the title of the activity
     * @return String title
     */
    public String getTitle() {
        return title;
    }
}
