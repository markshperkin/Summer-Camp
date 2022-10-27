import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    public void randomAction() { //static Action

        int r = RANDOM.nextInt(1);
        if(r==0)
        {
            System.out.println(Action.ARTS_AND_CRAFTS);
            
        }
        
    }

    public boolean hasAction(Action Action) {
        return true;
    }
    public String toString() {
        return "";
    }
}
