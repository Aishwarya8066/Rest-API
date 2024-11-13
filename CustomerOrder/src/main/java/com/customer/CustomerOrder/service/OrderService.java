package com.customer.CustomerOrder.service;

import com.customer.CustomerOrder.entity.Order;
import com.customer.CustomerOrder.repository.OrderRepository;
//import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Create or update order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders for a specific customer
    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    // Get order by ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Delete order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
