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
public class OrderCreatedResponseDto {

    private String orderId;

    private Long idProduct;

    private BigDecimal total;

    private Integer quantity;

    private LocalDateTime createdAt;

    private String status;

}
