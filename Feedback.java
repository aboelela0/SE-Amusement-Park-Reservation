package group_7_online_amusement_park_reservation_system;

import java.util.Date;

public class Feedback {
    private int feedbackID;
    private String content;
    private Date date;
    private Customer customer;

    public Feedback(int feedbackID, String content, Date date, Customer customer) {
        this.feedbackID = feedbackID;
        this.content = content;
        this.date = date;
        this.customer = customer;
        Group_7_Online_Amusement_Park_Reservation_System.feedbackList.add(this);
    }

    public void submitFeedback() {
        FeedbackController.addFeedback(this);
    }

    public void editFeedback(String newContent) {
        this.content = newContent;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Feedback{" +
               "feedbackID=" + feedbackID +
               ", content='" + content + '\'' +
               ", date=" + date +
               ", customer=" + customer.getCustomerID() +
               '}';
    }
}