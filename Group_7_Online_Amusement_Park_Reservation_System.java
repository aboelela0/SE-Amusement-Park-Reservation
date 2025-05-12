/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group_7_online_amusement_park_reservation_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Group_7_Online_Amusement_Park_Reservation_System {
    public static ArrayList<Ticket> tickets = new ArrayList<>();
public static ArrayList <Customer> customers = new ArrayList<> ();
public static ArrayList<Staff> staff = new ArrayList<>();
public static ArrayList<Admin> admins = new ArrayList<>();
public static ArrayList<Reservation> reservations = new ArrayList<>();
public static ArrayList<Child> children = new ArrayList<>();
public static ArrayList<RFIDsystem> bracelets = new ArrayList<>();
public static ArrayList<Feedback> feedbackList = new ArrayList<>();
public DB db;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DB.getInstance();
    }
}
