package group_7_online_amusement_park_reservation_system;

public class Staff {

    private int staffID;
    private String name;
    private String jobTitle;
    private String department;
    private String username;
    private char[] password;

    // Constructor with all staff details
    public Staff(int staffID, String name, String jobTitle, String department) {
        this.staffID = staffID;
        this.name = name;
        this.jobTitle = jobTitle;
        this.department = department;
        Group_7_Online_Amusement_Park_Reservation_System.staff.add(this);
    }

    // No-arg constructor
    public Staff() {
    }

    // Setters
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    // Getters
    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    // toString method
    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", username='" + username + '\'' +
                ", password=" + (password != null ? String.valueOf(password) : "null") +
                '}';
    }
}
