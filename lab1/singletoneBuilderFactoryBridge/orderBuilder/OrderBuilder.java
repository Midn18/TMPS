package lab1.singletoneBuilderFactoryBridge.orderBuilder;

import java.util.List;

public class OrderBuilder {

    int id;
    String customerName;
    List<String> products;
    double price;

    public OrderBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setProducts(List<String> products) {
        this.products = products;
        return this;
    }

    public OrderBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Order build() {
        Order order = new Order();
        order.setId(id);
        order.setCustomerName(customerName);
        order.setProducts(products);
        order.setPrice(price);
        return order;
    }
}
