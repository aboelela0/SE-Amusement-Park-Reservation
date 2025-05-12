package group_7_online_amusement_park_reservation_system;

import java.util.*;

public class Schedule {
    private List<Activity> activities = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private Map<Integer, Integer> reservations = new HashMap<>();
    private Map<Integer, Integer> maxCapacityPerActivity = new HashMap<>();

    public boolean checkCredentials(int customerID, String password) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID && customer.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<Activity> retrieveActivities() {
        return activities;
    }

    public boolean isActivityAvailable(int activityID) {
        long reserved = reservations.values().stream().filter(id -> id == activityID).count();
        return reserved < maxCapacityPerActivity.getOrDefault(activityID, 0);
    }

    public boolean reserveSlot(int customerID, int activityID) {
        if (!isActivityAvailable(activityID)) return false;
        reservations.put(customerID, activityID);
        return true;
    }

    public boolean changeReservation(int customerID, int newActivityID) {
        if (!isActivityAvailable(newActivityID)) return false;
        reservations.put(customerID, newActivityID);
        return true;
    }

    public void addActivity(Activity activity, int capacity) {
        activities.add(activity);
        maxCapacityPerActivity.put(activity.getActivityID(), capacity);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
