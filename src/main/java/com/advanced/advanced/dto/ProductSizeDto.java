package com.advanced.advanced.dto;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductSizeDto {

    private Long id;

    private String name;

}
