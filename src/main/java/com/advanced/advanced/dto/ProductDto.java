package com.advanced.advanced.dto;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {


    private Long id;

    private String name;

    private String brand;

    private Double price;

    private Integer discount;

    private Integer quantityAvailable;

    private CategoryDto categoryDto;

    private ProductSizeDto productSizeDto;



}
