package Cloud.demo.repository;

import Cloud.demo.model.OrderName;
import Cloud.demo.model.Order;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class OrderRepository {
    private final Map<Integer, Order> orders = Map.of(1, new Order(1, 1, 556, "RUB", new OrderName("Chocolate", 1, 556)));

    public Optional<Cloud.demo.model.Order> getById(int userId) {
        return Optional.ofNullable(orders.get(userId));
    }

}
