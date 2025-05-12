/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class PaymentController {
    public void CheckPaymentDetails(int cardNumber, int cvv, String expDate) {
        if (String.valueOf(cardNumber).length() == 8 && String.valueOf(cvv).length() == 3 && expDate.matches("\\d{2}/\\d{2}")) {
            System.out.println("Payment details are valid.");
        } else {
            System.out.println("Invalid payment details.");
        }
    }

    public void CheckBalance(int amount, int balance) {
        if (balance >= amount) {
            System.out.println("Sufficient balance.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

