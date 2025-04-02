package Cloud.demo.controller;

import Cloud.demo.model.Order;
import Cloud.demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class OrderController {
    public OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/onUser/{userId}")
    public Optional<Order>getById(@PathVariable int userId){
        return orderService.getById(userId);
    }
}
