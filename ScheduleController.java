package group_7_online_amusement_park_reservation_system;

import java.util.*;

public class ScheduleController {
    private Schedule schedule;

    public ScheduleController(Schedule schedule) {
        this.schedule = schedule;
    }

    public boolean verifyLogin(int customerID, String password) {
        return schedule.checkCredentials(customerID, password);
    }

    public List<Activity> getAvailableActivities() {
        return schedule.retrieveActivities();
    }

    public boolean checkActivityAvailability(int activityID) {
        return schedule.isActivityAvailable(activityID);
    }

    public boolean reserveActivity(int customerID, int activityID) {
        return schedule.reserveSlot(customerID, activityID);
    }

    public boolean updateReservation(int customerID, int newActivityID) {
        return schedule.changeReservation(customerID, newActivityID);
    }
}
