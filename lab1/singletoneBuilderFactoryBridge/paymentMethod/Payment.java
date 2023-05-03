package lab1.singletoneBuilderFactoryBridge.paymentMethod;

public abstract class Payment {
    protected PaymentGateway paymentGateway;

    public Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void processPayment();
}
