package LAB1.singletoneBuilderFactory;

import LAB1.singletoneBuilderFactory.orderBuilder.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private static OrderManager instance;
    private List<Order> orderList;

    private OrderManager() {
        orderList = new ArrayList<>();
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
