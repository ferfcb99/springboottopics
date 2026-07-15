package com.advanced.advanced.service;

import com.advanced.advanced.dto.OrderCreatedRequestDto;
import com.advanced.advanced.dto.OrderCreatedResponseDto;
import com.advanced.advanced.entity.Order;
import com.advanced.advanced.entity.Product;
import com.advanced.advanced.repository.OrderRepository;
import com.advanced.advanced.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private Logger log = LoggerFactory.getLogger(OrderService.class);

    private final OrderRepository orderRepository;

    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public OrderCreatedResponseDto createOrder(OrderCreatedRequestDto orderCreatedRequestDto) {
        log.info("The create order function started");
        Optional<Product> product = this.productRepository.findById(orderCreatedRequestDto.getIdProduct());

        if(product.isEmpty()){
            log.info("The create order function failed, product not found");
            return null;
        }

        if(orderCreatedRequestDto.getQuantity() > product.get().getQuantityAvailable()){
            log.info("The create order function failed, quantity is greater than product.getQuantityAvailable");
            return null;
        }


        Order orderToSave = new Order(
                String.valueOf(UUID.randomUUID()),
                orderCreatedRequestDto.getIdProduct(),
                orderCreatedRequestDto.getQuantity(),
                BigDecimal.valueOf(orderCreatedRequestDto.getQuantity() * product.get().getPrice())
        );

        if(true){
            orderToSave = this.orderRepository.save(orderToSave);
            throw new RuntimeException("Error");
        }

        product.get().setQuantityAvailable(product.get().getQuantityAvailable() - orderCreatedRequestDto.getQuantity());
        return new OrderCreatedResponseDto(
                orderToSave.getId(),
                orderToSave.getIdProduct(),
                orderToSave.getTotal(),
                orderToSave.getQuantity(),
                orderToSave.getCreatedAt(),
                "CREATED");
    }





}
