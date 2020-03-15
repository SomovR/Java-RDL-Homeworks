package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    private static List<Order> listOfOrders;
    private static OrderFactory orderFactory;

    public static void main(String[] args) {
        orderFactory = new OrderFactory() {};
        listOfOrders = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOfOrders.add(orderFactory.notStartedOrder());
            listOfOrders.add(orderFactory.processingOrder());
            listOfOrders.add(orderFactory.completedOrder());
        }
        //System.out.println(listOfOrders.toString());
        System.out.println("Option 1");
        listOfOrders.stream()
                .filter(Order::isPaybackOrder)
                .forEach(System.out::println);
        System.out.println("Option 2");
        listOfOrders.stream()
                .filter(order -> order.isPaybackOrder())
                .forEach(order -> System.out.println(order));

    }
}

enum OrderStatus {
    NOT_STARTED, PROCESSING, COMPLETED
}

class Order {
    private static final int averageOrderItemsAmount = 3;
    private OrderStatus status;
    private int amount;
    private Random random;

    Order(OrderStatus status) {
        this.status = status;
        random = new Random();
        amount = random.nextInt(11);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", amount=" + amount +
                '}';
    }

    boolean isPaybackOrder() {
        return amount > averageOrderItemsAmount;
    }
}