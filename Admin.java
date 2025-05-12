package group_7_online_amusement_park_reservation_system;

import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Admin extends Staff {
    private String role;
    private char[] password;

    public Admin(int staffID, String name, String jobTitle, String department,
                 String role, char[] password) {
        super(staffID, name, jobTitle, department);
        this.role = role;
        this.password = password;
        // register self in the global list
        Group_7_Online_Amusement_Park_Reservation_System.admins.add(this);
    }

    public Admin() {
        super();
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public char[] getPassword() {
        return password;
    }

    public void addStaff(Staff s) {
        List<Staff> staffList = Group_7_Online_Amusement_Park_Reservation_System.staff;
        staffList.add(s);
        System.out.println("Staff " + s.getName() + " has been added.");
    }

    public void removeStaff(Staff s) {
        List<Staff> staffList = Group_7_Online_Amusement_Park_Reservation_System.staff;
        staffList.remove(s);
        System.out.println("Staff " + s.getName() + " has been removed.");
    }

    public void banUser(Customer c) {
        List<Customer> custList = Group_7_Online_Amusement_Park_Reservation_System.customers;
        custList.remove(c);
        System.out.println("Customer " + c.getCustomerName() + " has been banned.");
    }

    public Staff checkStaffExists(int ID, String name) {
        for (Staff s : Group_7_Online_Amusement_Park_Reservation_System.staff) {
            if (s.getStaffID() == ID && s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public Customer checkUserExists(int ID, String name) {
        for (Customer c : Group_7_Online_Amusement_Park_Reservation_System.customers) {
            if (c.getCustomerID() == ID && c.getCustomerName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Returns access level:
     *   0 = not an admin,
     *   1 = Senior,
     *   2 = other admin
     */
    public int checkAccess(int id, String name) {
        for (Admin a : Group_7_Online_Amusement_Park_Reservation_System.admins) {
            if (a.getStaffID() == id && a.getName().equals(name)) {
                if ("Senior".equals(a.getRole())) return 1;
                return 2;
            }
        }
        return 0;
    }

    //DB invoking
    public int saveAdminToDatabase() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DB.getInstance().getConnection();
            stmt = conn.createStatement();
            String sql = "INSERT INTO admins (staffID, name, jobTitle, department, username, password) VALUES (" +
                    "'" + getStaffID() + "', " +
                    "'" + getName() + "', " +
                    "'" + getJobTitle() + "', " +
                    "'" + getDepartment() + "', " +
                    "'" + getUsername() + "', " +
                    "'" + new String(getPassword()) + "')";
            return stmt.executeUpdate(sql);
        } finally {
           
        }
    }
    
//DB invoking
     public static boolean login(int id, String passwordStr) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getInstance().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM admins " +
                         "WHERE staffID = '" + id + "' " +
                         "AND password = '" + passwordStr + "'";
            rs = stmt.executeQuery(sql);
            return rs.first();
        } finally {
           
        }
    }
     
     //DB invoking
     public static boolean AdminCheck(int id, String dept) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getInstance().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM admins " +
                         "WHERE staffID = '" + id + "' " +
                         "AND department = '" + dept + "'";
            rs = stmt.executeQuery(sql);
            return rs.first();
        } finally {
           
        }
    }
    
    @Override
    public String toString() {
        return "Admin{" +
               "staffID=" + getStaffID() +
               ", name=" + getName() +
               ", role=" + role +
               '}';
    }}