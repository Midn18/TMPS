package lab1.singletoneBuilderFactoryBridge.paymentMethod.payments;

import lab1.singletoneBuilderFactoryBridge.paymentMethod.Payment;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.PaymentGateway;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void processPayment() {
        System.out.println("Credit card payment processed");
        paymentGateway.processPayment();
    }
}
