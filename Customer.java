package group_7_online_amusement_park_reservation_system;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Customer {
    private int customerID;
    private String customerName;
    private String username;
    private String password;
    private String childName;
    private int childID;
private List<Reservation> reservations = new ArrayList<>();
    private Reservation reservation;
    private Admin admin;
    private Child child;
    private RFIDsystem bracelet;
    private Payment payment;

    Customer(int i, String john_Doe, String johndoeexamplecom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChildID(int childID) {
        this.childID = childID;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Child getChild() {
        return child;
    }

    public Payment getPayment() {
        return payment;
    }

    public static Set<Integer> getGeneratedIds() {
        return generatedIds;
    }

    public static Random getRandom() {
        return random;
    }

    private static final Set<Integer> generatedIds = new HashSet<>();
    private static final Random random = new Random();

    public Customer(String customerName, String username, String password, Child child) {
        this.customerID = generateUniqueRandomId(1, 999_999_999);
        this.customerName = customerName;
        this.username = username;
        this.password = password;
        this.child = child;
        this.childName = child.getChildName();
        this.childID = child.getChildID();
         Group_7_Online_Amusement_Park_Reservation_System.customers.add(this);
    }
public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }
    // Setters
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setChildName(Child child) {
        this.childName = child.getChildName();
    }

    public void setChildID(Child child) {
        this.childID = child.getChildID();
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void setBracelet(RFIDsystem bracelet) {
        this.bracelet = bracelet;
    }

    // Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getChildName() {
        return childName;
    }

    public int getChildID() {
        return childID;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public RFIDsystem getBracelet() {
        return bracelet;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "customerID=" + customerID +
               ", customerName='" + customerName + '\'' +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", childName='" + childName + '\'' +
               ", childID=" + childID +
               ", reservation=" + reservation +
               ", admin=" + admin +
               ", child=" + child +
               ", bracelet=" + bracelet +
               '}';
    }

    public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> listReservations() {
        return reservations;
    }
    
    //DB invoking SignUp
     public boolean saveToDatabase() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DB.getInstance().getConnection();
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            String sqlChild = "INSERT INTO child (childID, childName, age) VALUES (" +
                              childID + ", '" + child.getChildName() + "', " + child.getAge() + ")";
            String sqlCustomer = "INSERT INTO customer (customerID, customerName, username, password, childName, childID) VALUES (" +
                                 customerID + ", '" + customerName + "', '" + username + "', '" + password + "', '" + childName + "', " + childID + ")";

            int rowsChild = stmt.executeUpdate(sqlChild);
            int rowsCust = stmt.executeUpdate(sqlCustomer);

            if (rowsChild > 0 && rowsCust > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }
        } finally {
            
        }
    }

    /**
     * Authenticates a customer by username and password.
     */
    public static boolean login(String username, String password) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getInstance().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM customer WHERE username = '" + username + "' AND password = '" + password + "'";
            rs = stmt.executeQuery(sql);
            return rs.first();
        } finally {
            
        }
    }
    
    
    
}
