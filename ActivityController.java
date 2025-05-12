package group_7_online_amusement_park_reservation_system;

import java.util.*;

public class ActivityController {
    private Activity activity;

    public ActivityController(Activity activityManager) {
        this.activity = activityManager;
    }

    public boolean verifyLogin() {
        return true; // placeholder
    }

    public void createActivity(Map<String, String> details) {
        int id = Integer.parseInt(details.get("activityID"));
        String name = details.get("name");
        String type = details.get("type");
        int childID = Integer.parseInt(details.get("childID"));

        Activity newActivity = new Activity(id, name, type, childID); // no Schedule passed
        activity.addActivity(newActivity);
    }

    public List<Activity> requestChildActivityList(int childID) {
        return activity.getScheduledActivities(childID);
    }

    public void deleteActivity(int activityID) {
        activity.removeActivity(activityID);
    }

    public void updateActivity(int activityID, Map<String, String> newDetails) {
        Activity targetActivity = activity.getActivityByID(activityID);
        if (targetActivity != null) {
            // Example: update name or type if needed
            if (newDetails.containsKey("name")) {
                targetActivity.setName(newDetails.get("name"));
            }
            if (newDetails.containsKey("type")) {
                targetActivity.setType(newDetails.get("type"));
            }
        }
    }

    public List<Activity> fetchAllActivities() {
        return activity.listAllActivities();
    }

    public List<Activity> filterActivitiesByType(String type) {
        List<Activity> filtered = new ArrayList<>();
        for (Activity a : activity.listAllActivities()) {
            if (a.getType().equalsIgnoreCase(type)) {
                filtered.add(a);
            }
        }
        return filtered;
    }

    public void removeActivity(int activityID) {
        activity.removeActivity(activityID);
    }

    // Removed updateSchedule method since it's no longer needed

    void updateSchedule(int activityID, Schedule newSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
