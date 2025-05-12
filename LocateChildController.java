package group_7_online_amusement_park_reservation_system;

import java.util.List;

public class LocateChildController {
    private boolean availability;
    private List<Customer> customers;
    private List<RFIDsystem> bracelets;

    public LocateChildController(List<Customer> customers, List<RFIDsystem> bracelets) {
        this.customers = customers;
        this.bracelets = bracelets;
    }

    public boolean checkIDAvailability(int childID) {
        for (Customer customer : customers) {
            if (customer.getChildID() == childID) {
                availability = true;
                return true;
            }
        }
        availability = false;
        return false;
    }

    public boolean checkBraceletAvailability(int braceletID) {
        for (RFIDsystem bracelet : bracelets) {
            if (bracelet.getBraceletID() == braceletID) {
                availability = true;
                return true;
            }
        }
        availability = false;
        return false;
    }

    public String searchLocation(int childID, int braceletID) {
        for (RFIDsystem bracelet : bracelets) {
            Customer customer = bracelet.getCustomer();
            if (customer != null &&
                customer.getChildID() == childID &&
                bracelet.getBraceletID() == braceletID) {
                System.out.println("Child with ID " + childID + " is located at: " + bracelet.getLocation());
                return bracelet.getLocation();
            }
        }
        System.out.println("Child with ID " + childID + " is not found in the system.");
        return "NOT FOUND";
    }
}
