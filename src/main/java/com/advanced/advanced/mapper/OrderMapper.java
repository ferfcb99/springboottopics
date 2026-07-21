package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.OrderCreatedResponseDto;
import com.advanced.advanced.dto.OrderDto;
import com.advanced.advanced.entity.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {

    public static Order toEntity(OrderDto orderDto) {

        Order order = new Order();

        order.setId(orderDto.getOrderId());
        order.setIdProduct(orderDto.getIdProduct());
        order.setQuantity(orderDto.getQuantity());
        order.setTotal(orderDto.getTotal());
        order.setCreatedAt(orderDto.getCreatedAt());
        order.setUpdatedAt(orderDto.getUpdatedAt());

        return order;
    }

    public static OrderDto toDto(Order order) {

        OrderDto orderDto = new OrderDto();

        orderDto.setOrderId(null);
        orderDto.setIdProduct(order.getIdProduct());
        orderDto.setQuantity(order.getQuantity());
        orderDto.setTotal(order.getTotal());
        orderDto.setCreatedAt(order.getCreatedAt());
        orderDto.setUpdatedAt(order.getUpdatedAt());

        return orderDto;
    }

    public static List<OrderDto> toListDto(List<Order> orders) {

        List<OrderDto> orderDtoList = new ArrayList<>();

        for (Order order : orders) {
            orderDtoList.add(toDto(order));
        }

        return orderDtoList;
    }

    public static List<Order> toListEntity(List<OrderDto> orderDtoList) {

        List<Order> orders = new ArrayList<>();

        for (OrderDto orderDto : orderDtoList) {
            orders.add(toEntity(orderDto));
        }

        return orders;
    }

}
