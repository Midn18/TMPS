package lab1.singletoneBuilderFactoryBridge.paymentMethod;

public class ConcretePaymentGateway implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Payment finished");
    }
}
