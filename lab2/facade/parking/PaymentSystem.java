package lab2.facade.parking;

import java.math.BigDecimal;

public class PaymentSystem {
    public void makePayment(BigDecimal amount) {
        System.out.println("Payment of " + amount + "$ made successfully!");
    }
}
