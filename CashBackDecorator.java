/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class CashBackDecorator extends PaymentDecorator {
    private int cashbackAmount;

    public CashBackDecorator(PaymentComponent component, int cashbackAmount) {
        super(component);
        this.cashbackAmount = cashbackAmount;
    }

    @Override
    public int getBalance() {
        return component.getBalance() + cashbackAmount;
    }
    @Override
    public String getPaymentMessage() {
        if (getBalance() >= getAmount()) {
            return "Payment successful with cashback bonus!";
        } else {
            return "Insufficient balance even after cashback.";
        }
    }
}

