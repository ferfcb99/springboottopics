package com.advanced.advanced.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_size")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
