        /*
         * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
         * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
         */
        package group_7_online_amusement_park_reservation_system;

        /**
         *
         * @author dell
         */
        public abstract class PaymentDecorator implements PaymentComponent {
            protected PaymentComponent component;

            public PaymentDecorator(PaymentComponent component) {
                this.component = component;
            }

            @Override
            public int getAmount() {
                return component.getAmount();
            }

            @Override
            public int getBalance() {
                return component.getBalance();
            }

            @Override
        public String getPaymentMessage() {
            return component.getPaymentMessage();}
        }


