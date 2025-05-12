package group_7_online_amusement_park_reservation_system;

import java.util.List;

public class ReservationController {

    public void checkDetails(Customer customer) {
        List<Reservation> reservations = customer.listReservations();
        if (!reservations.isEmpty()) {
            for (Reservation reservation : reservations) {
                System.out.println("Customer Name: " + customer.getCustomerName());
                System.out.println("Reservation Date: " + reservation.getDate());
                System.out.println("Reservation Time: " + reservation.getTime());
                System.out.println("Price: " + reservation.getPrice());
                for (Ticket ticket : reservation.getTickets()) {
                    System.out.println("Theme: " + ticket.getThemeName());
                    System.out.println("Ticket Date: " + ticket.getDate());
                }
            }
        } else {
            System.out.println("No reservations found for customer.");
        }
    }

    public void saveReservation(Customer customer, String name, int ticketID, 
                               String ticketCategory, String date, String themeName) {
        Ticket ticket = new Ticket(date, themeName);
        Reservation reservation = new Reservation(
            date, 
            "12:00 PM", // Default time
            100.0,      // Default price
            customer, 
            ticket
        );
        customer.addReservation(reservation);
    }
}