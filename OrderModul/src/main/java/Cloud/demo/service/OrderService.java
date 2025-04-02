package Cloud.demo.service;

import Cloud.demo.model.Order;
import Cloud.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository OrderRepository;

    public OrderService(OrderRepository orderReposirory) {
        this.OrderRepository = orderReposirory;
    }

    public Optional<Order> getById(int userId) {
        return OrderRepository.getById(userId);
    }
}
