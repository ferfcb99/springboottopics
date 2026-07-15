package com.advanced.advanced.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "quantity")
    @Min(value = 0)
    @Max(value = 100)
    private Integer quantity;

    @Column(name = "total")
    @Digits(integer = 10, fraction = 2)
    private BigDecimal total;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Order(String id, Long idProduct, Integer quantity, BigDecimal total) {
        this.id = id;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.total = total;
    }

    @PrePersist
    public void setCreatedAt(){
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void setUpdatedAt(){
        this.updatedAt = LocalDateTime.now();
    }

}
