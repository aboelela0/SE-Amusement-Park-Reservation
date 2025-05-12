package group_7_online_amusement_park_reservation_system;

import java.util.List;

public class MapSystem {
    private List<Customer> users;
    private boolean isOnline;

    public MapSystem(List<Customer> users, boolean isOnline) {
        this.users = users;
        this.isOnline = isOnline;
    
    }

    public boolean validateCredentials(int customerID, String password) {
        for (Customer user : users) {
            if (user.getCustomerID() == customerID && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSystemStatus() {
        return isOnline;
    }


    public void setOnline(boolean online) {
        isOnline = online;
    }
}