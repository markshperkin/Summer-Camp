import javax.swing.Action;

public class Activities {
    private String title;
    private String description;
    private String location;
    private int clockHour;
    private int clockMinute;
    private Action action;

    public Activities(String title, String description, String location, int clockHour
    , int clockMinute, Action action) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.clockHour = clockHour;
        this.clockMinute = clockMinute;
        this.action = action;
    }

    public boolean hasAction(Action Action) {
        return true;
    }
    public String toString() {
        return "";
    }
}
