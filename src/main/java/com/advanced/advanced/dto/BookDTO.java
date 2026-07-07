package com.advanced.advanced.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

    private Long id;
    private String title;
    private Long authorId;



}
