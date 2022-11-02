import java.util.ArrayList;

public class ActivitiesList {
    private static ActivitiesList activitiesList;
    private ArrayList<Activity> activities;

    private ActivitiesList() {
        // activities = DataReader.getAllActivities();
    }

    public static ActivitiesList getInstance() {
        if (activitiesList == null) {
            activitiesList = new ActivitiesList();
        }
        return activitiesList;
    }

    public boolean addActivity(Activity Activity) {
        if(Activity == null)
            return false;
        else
            activities.add(Activity);
        save();
        return true;
    }

    public Activity getActivity(String title) {
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).getTitle().equals(title))
                return activities.get(i);
        }
        return null;
    }

    public void getAllActivities() {
        for(int i=0;i<activities.size();i++) {
            System.out.println(activities.get(i));
        }
    }

    public void save() {
        // DataWriter.saveActivites();
    }
}
