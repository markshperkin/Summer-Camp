import java.util.ArrayList;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Schedule> schedule;
    public String title;
    public String descripton;
    public String location;
    public String clockhour;
    public String clockmin;
    public String timeofday;
    public String action;
    private ArrayList<String> Monday;
    private ArrayList<String>Tuesday;
    private ArrayList<String> Wednesday;
    private ArrayList<String>Thursday;
    private ArrayList<String>Friday;
    private ArrayList<String>Saturday;
    private ArrayList<String>Sunday;


/**
 * @param title
 * @param description
 * @param location
 * @param clockhour
 * @param clockmin
 * @param timeofday
 * @param action
 */
public Schedule(String title,String description,String location, String clockhour,String clockmin,String timeofday,String action)
{
     this.title=title;
     this.descripton=description;
     this.location=location;
     this.clockhour=0;
     this.clockmin=00;
     this.timeofday=timeofday;
     this.action=action;

    schedule= new ArrayList<>();
    Monday=new ArrayList<>();
    Tuesday= new ArrayList<>();
    Wednesday= new ArrayList<>();
    Thursday=new ArrayList<>();
    Friday=new ArrayList<>();
    Saturday=new ArrayList();
    Sunday=new ArrayList<>();
}

public ArrayList<String> getThursday() {
    return Thursday;
}

public ArrayList<String> getFriday() {
    return Friday;
}

public ArrayList<String> getSaturday() {
    return Saturday;
}

public ArrayList<String> getSunday() {
    return Sunday;
}

public ArrayList<Schedule> getSchedule() {
    return schedule;
}

public String getTitle() {
    return title;
}

public String getDescripton() {
    return descripton;
}

public String getLocation() {
    return location;
}

public String getClockhour() {
    return clockhour;
}

public String getClockmin() {
    return clockmin;
}

public String getTimeofday() {
    return timeofday;
}

public String getAction() {
    return action;
}

public String gettitle(){

    return title;
}
}
