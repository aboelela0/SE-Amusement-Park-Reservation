package group_7_online_amusement_park_reservation_system;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class RFIDsystem {
    private int braceletID;
    private String location;
    private Customer customer;
    
    private static Set<Integer> generatedIds = new HashSet<>();
    private static Random random = new Random();

    // Constructor
    public RFIDsystem(String location, Customer customer) {
        this.braceletID = generateUniqueRandomId(1, 999999999);
        this.location = location;
        this.customer = customer;
         Group_7_Online_Amusement_Park_Reservation_System.bracelets.add(this);
    }

    // Generate unique random ID
    public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }

    // Setters
    public void setBraceletID(int ID) {
        this.braceletID = ID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getters
    public int getBraceletID() {
        return braceletID;
    }

    public String getLocation() {
        return location;
    }

    public Customer getCustomer() {
        return customer;
    }

    // For debug/printing
    @Override
    public String toString() {
        return "RFIDsystem{" + 
               "braceletID=" + braceletID + 
               ", location='" + location + '\'' + 
               ", customer=" + customer + 
               '}';
    }
}
