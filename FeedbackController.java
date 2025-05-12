package group_7_online_amusement_park_reservation_system;


import static group_7_online_amusement_park_reservation_system.Group_7_Online_Amusement_Park_Reservation_System.feedbackList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackController {
    

    public static boolean verifyLogin(Customer customer, String password) {
        return customer.getPassword().equals(password);
    }

    public static void displayFeedbackForm() {
        System.out.println("Displaying feedback form...");
    }


    public static void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
    }

    public static void editFeedback(int id, String newContent) {
        for (Feedback f : feedbackList) {
            if (f.getFeedbackID() == id) {
                f.editFeedback(newContent);
                break;
            }
        }
    }

    public static void deleteFeedback(int id) {
        feedbackList.removeIf(f -> f.getFeedbackID() == id);
    }

    public static List<Feedback> listFeedbackByCustomer(Customer customer) {
        List<Feedback> result = new ArrayList<>();
        for (Feedback f : feedbackList) {
            if (f.getCustomer().equals(customer)) {
                result.add(f);
            }
        }
        return result;
    }
}