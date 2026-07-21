package com.advanced.advanced.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String orderId;
    private Long idProduct;
    private Integer quantity;
    private BigDecimal total;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
