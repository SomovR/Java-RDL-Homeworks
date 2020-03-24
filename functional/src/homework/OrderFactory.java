package homework;

public interface OrderFactory {
    default Order notStartedOrder() {
        return new Order(OrderStatus.NOT_STARTED);
    }

    default Order processingOrder() {
        return new Order(OrderStatus.PROCESSING);
    }

    default Order completedOrder() {
        return new Order(OrderStatus.COMPLETED);
    }
}
