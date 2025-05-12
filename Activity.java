package group_7_online_amusement_park_reservation_system;

import java.util.*;

public class Activity {
    private int activityID;
    private String name;
    private String type;
    private Schedule schedule;
    private int childID;

    private ArrayList<Activity> activities = new ArrayList<>();

    public Activity() {} // Default constructor

    public Activity(int id, String name, String type, int childID) {
    this.activityID = id;
    this.name = name;
    this.type = type;
    this.childID = childID;
}


    public int getActivityID() {
        return activityID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public int getChildID() {
        return childID;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void removeActivity(int activityID) {
        activities.removeIf(a -> a.getActivityID() == activityID);
        activityRemoved();
    }

    public Activity getActivityByID(int activityID) {
        for (Activity a : activities) {
            if (a.getActivityID() == activityID) return a;
        }
        return null;
    }

    public void updateActivitySchedule(int activityID, Schedule newSchedule) {
        Activity activity = getActivityByID(activityID);
        if (activity != null) {
            activity.setSchedule(newSchedule);
            scheduleUpdated();
        }
    }

    public List<Activity> listAllActivities() {
        return activities;
    }

    public List<Activity> searchActivities(String keyword) {
        List<Activity> result = new ArrayList<>();
        for (Activity a : activities) {
            if (a.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(a);
            }
        }
        return result;
    }

    public List<Activity> getScheduledActivities(int childID) {
        List<Activity> result = new ArrayList<>();
        for (Activity a : activities) {
            if (a.getChildID() == childID) {
                result.add(a);
            }
        }
        return result;
    }

    public void activityRemoved() {
        System.out.println("Activity has been removed.");
    }

    public void scheduleUpdated() {
        System.out.println("Activity schedule updated.");
    }

    void setType(String get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setName(String get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
