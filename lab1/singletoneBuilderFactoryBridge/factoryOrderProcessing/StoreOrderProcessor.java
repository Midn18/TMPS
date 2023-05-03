package lab1.singletoneBuilderFactoryBridge.factoryOrderProcessing;

import lab1.singletoneBuilderFactoryBridge.orderBuilder.Order;

public class StoreOrderProcessor implements OrderProcessor {

    private Order order;

    public StoreOrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void processOrder() {
        System.out.println("Processing store order: " + order);
    }
}
