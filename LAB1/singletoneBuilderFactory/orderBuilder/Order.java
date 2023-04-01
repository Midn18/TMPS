package LAB1.singletoneBuilderFactory.orderBuilder;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    int id;
    String customerName;
    List<String> products;
    double price;

    @Override
    public String toString() {
        return "Order -> id: " + id + ", name: " + customerName + ", products: " + products + ", price: " + price + "$";
    }
}
