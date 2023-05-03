package lab1.singletoneBuilderFactoryBridge.paymentMethod.payments;

import lab1.singletoneBuilderFactoryBridge.paymentMethod.Payment;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.PaymentGateway;

public class WebMoneyPayment extends Payment {

    public WebMoneyPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void processPayment() {
        System.out.println("WebMoney payment processed");
        paymentGateway.processPayment();
    }
}
