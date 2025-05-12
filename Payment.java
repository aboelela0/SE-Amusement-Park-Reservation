/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

import static group_7_online_amusement_park_reservation_system.Customer.generateUniqueRandomId;
import static java.lang.Math.random;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author dell
 */
public class Payment implements PaymentComponent {
    private int paymentID;
    private int amount;
    private String paymentMethod;
    private int cardNumber;
    private int cvv;
    private String expDate;
    private Customer customer;
    private int custID ;
    private int balance;

    public Payment( int amount, String paymentMethod, int cardNumber, int cvv, String expDate, int balance, int custID) {
        
        this.paymentID = generateUniqueRandomId(1, 999_999_999);
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
        this.balance = 999999;
        this.custID=custID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getcvv() {
        return cvv;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setcvv(int cvv) {
        this.cvv = cvv;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void process() {
        System.out.println("Processing payment of " + amount + " for customer " + customer.getCustomerName());
    }

    @Override
    public String getPaymentMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public static int generateUniqueRandomId(int minId, int maxId) {
        int newId;
        do {
            newId = random.nextInt(maxId - minId + 1) + minId;
        } while (generatedIds.contains(newId));
        generatedIds.add(newId);
        return newId;
    }
      private static final Set<Integer> generatedIds = new HashSet<>();
    private static final Random random = new Random();

//DB invoking 
 public void saveToDatabase(PaymentComponent decorated) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DB.getInstance().getConnection();
            stmt = conn.createStatement();
            String sql = "INSERT INTO Payment "
                       + "(paymentID, amount, paymentMethod, cardNumber, cvv, expDate, balance, customerID) "
                       + "VALUES ("
                       + "'" + getPaymentID() + "',"
                       + "'" + decorated.getAmount() + "',"
                       + "'VISA',"
                       + "'" + getCardNumber() + "',"
                       + "'" + cvv + "',"
                       + "'" + expDate + "',"
                       + "'" + decorated.getBalance() + "',"
                       + "'" + custID + "'"
                       + ")";
            stmt.executeUpdate(sql);
        } finally {
            
        }
    }
  
}
