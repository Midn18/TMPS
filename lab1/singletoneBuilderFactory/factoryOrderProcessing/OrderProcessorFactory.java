package lab1.singletoneBuilderFactory.factoryOrderProcessing;

import lab1.singletoneBuilderFactory.orderBuilder.Order;

public class OrderProcessorFactory {

    public OrderProcessor orderProcessor(Order order) {
        if (order.getPrice() >= 300) {
            return new OnlineOrderProcessor(order);
        } else {
            return new StoreOrderProcessor(order);
        }
    }
}
