/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class DiscountDecorator extends PaymentDecorator {
    private int discountAmount;

    public DiscountDecorator(PaymentComponent component, int discountAmount) {
        super(component);
        this.discountAmount = discountAmount;
    }

    @Override
    public int getAmount() {
        return component.getAmount() - discountAmount;
    }
    
    @Override
    public String getPaymentMessage() {
        if (getBalance() >= getAmount()) {
            return "Payment successful with discount!";
        } else {
            return "Insufficient balance after discount applied.";
        }
    }
}

