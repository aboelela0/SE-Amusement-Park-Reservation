package group_7_online_amusement_park_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Ticket {

    private int ticketID;
    private String ticketDate;
    private String themeName;

    // Static data
    private static Set<Integer> generatedIds = new HashSet<>();
    private static Random random = new Random();
    public static ArrayList<Ticket> tickets = new ArrayList<>();

    // Constructor
    public Ticket(String ticketDate, String themeName) {
        this.ticketID = generateUniqueRandomId(1, 999_999_999);
        this.ticketDate = ticketDate;
        this.themeName = themeName;
    }

    // Unique ID Generator
    public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }

    // Setters
    public void setID(int ID) {
        this.ticketID = ID;
    }

    public void setDate(String date) {
        this.ticketDate = date;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    // Getters
    public int getID() {
        return ticketID;
    }

    public String getDate() {
        return ticketDate;
    }

    public String getThemeName() {
        return themeName;
    }

    // Display info
    public void showInfo() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Ticket Date: " + ticketDate);
        System.out.println("theme: " + themeName);
    }

   
}
