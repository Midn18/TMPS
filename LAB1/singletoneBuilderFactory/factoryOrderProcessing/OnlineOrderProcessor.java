package LAB1.singletoneBuilderFactory.factoryOrderProcessing;

import LAB1.singletoneBuilderFactory.orderBuilder.Order;

public class OnlineOrderProcessor implements OrderProcessor {

    private Order order;

    public OnlineOrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void processOrder() {
        System.out.println("Processing online order: " + order);
    }
}

