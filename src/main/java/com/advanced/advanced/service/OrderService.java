package com.advanced.advanced.service;

import com.advanced.advanced.dto.OrderCreatedRequestDto;
import com.advanced.advanced.dto.OrderCreatedResponseDto;
import com.advanced.advanced.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderCreatedResponseDto createOrder(OrderCreatedRequestDto orderCreatedRequestDto) {
        return null;
    }





}
