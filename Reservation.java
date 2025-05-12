package group_7_online_amusement_park_reservation_system;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Reservation {
    private String date;
    private String time;
    private double price;
    private Customer customer;
    private int reservationID;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    public static ArrayList<Reservation> reservations = new ArrayList<>();
    private static Random random = new Random();
    private static Set<Integer> generatedIds = new HashSet<>();

    public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }

    // Updated constructor
    public Reservation(String date, String time, double price, Customer customer, Ticket ticket) {
        this.date = date;
        this.time = time;
        this.price = price;
        this.customer = customer;
        this.reservationID = generateUniqueRandomId(1, 999999999);
        this.tickets.add(ticket);
        reservations.add(this);
    }

    public Reservation(String ride123, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters/setters
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }
    public void setPrice(double price) { this.price = price; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public void setReservationID(int reservationID) { this.reservationID = reservationID; }
    
    public String getDate() { return date; }
    public String getTime() { return time; }
    public double getPrice() { return price; }
    public Customer getCustomer() { return customer; }
    public int getReservationID() { return reservationID; }
    
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
    
    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                ", reservationID=" + reservationID +
                ", tickets=" + tickets +
                '}';
    }
}