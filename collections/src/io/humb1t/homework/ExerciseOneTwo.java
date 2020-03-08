package io.humb1t.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseOneTwo {
    public static void main(String[] args) {
        Collection<String> c = Collections.EMPTY_LIST;
        List<String> list = new ArrayList<>(c);
        /*At for now, for me, for-each cycle seems the easier in terms of syntax.
        Moreover, for specified example this structure has fewer code lines.
        But on other hand if we have to perform a lot of operations with collections
        it would me more convenient to use methods: stream(), filter(), sorted() and so on
        to make it more readable and avoid excessive code
        */
        List<Order> orders = Collections.singletonList(new Order(OrderStatus.COMPLETED, 100));
        orders.stream()
                .filter(order -> order.status == OrderStatus.COMPLETED)
                .forEach(order -> System.out.println(order.toString()));

        for (Order order : orders) {
            System.out.println(order.toString());
        }

        for (Iterator<Order> iterator = orders.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next().toString());
        }

        Map<OrderStatus, List<Order>> ordersByStatus = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus));

        orders.stream()
                .filter(order -> order.amount >= 50)
                .forEach(order -> System.out.println(order.toString()));

    }

    public enum OrderStatus {
        NOT_STARTED, PROCESSING, COMPLETED
    }

    public static class Order {
        public final OrderStatus status;
        public final int amount;

        public Order(OrderStatus status, int amount) {
            this.status = status;
            this.amount = amount;
        }

        public OrderStatus getStatus() {
            return status;
        }

        public int getAmount() {
            return amount;
        }
    }
}

