package com.advanced.advanced.controller;

import com.advanced.advanced.dto.OrderCreatedRequestDto;
import com.advanced.advanced.dto.OrderCreatedResponseDto;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseAPI<OrderCreatedResponseDto>> createOrder(
            @RequestBody OrderCreatedRequestDto orderCreatedRequestDto) {
        OrderCreatedResponseDto responseDto = this.orderService.createOrder(orderCreatedRequestDto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>(String.valueOf(HttpStatus.OK), "OK", responseDto));
    }

}
