package lab1.singletoneBuilderFactoryBridge.factoryOrderProcessing;

import lab1.singletoneBuilderFactoryBridge.orderBuilder.Order;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.ConcretePaymentGateway;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.Payment;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.PaymentGateway;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.payments.CreditCardPayment;
import lab1.singletoneBuilderFactoryBridge.paymentMethod.payments.WebMoneyPayment;

import java.util.Scanner;

public class OnlineOrderProcessor implements OrderProcessor {

    private Order order;

    public OnlineOrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void processOrder() {
        PaymentGateway concretePaymentGateway = new ConcretePaymentGateway();
        System.out.println("Processing online order: " + order);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment method: ");
        System.out.println("1. Credit card");
        System.out.println("2. WebMoney");
        System.out.println("3. Exit");
        String paymentMethod = scanner.nextLine();

        label:
        while (true) {
            switch (paymentMethod) {
                case "1":
                    Payment creditCardPayment = new CreditCardPayment(concretePaymentGateway);
                    creditCardPayment.processPayment();
                    break label;
                case "2":
                    Payment webMoneyPayment = new WebMoneyPayment(concretePaymentGateway);
                    webMoneyPayment.processPayment();
                    break label;
                case "3":
                    break label;
                default:
                    System.out.println("Wrong input. Try again");
                    paymentMethod = scanner.nextLine();
                    break;
            }
        }
    }
}

