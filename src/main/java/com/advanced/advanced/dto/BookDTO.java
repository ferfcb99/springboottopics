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

    private Integer pages;

    private String editorial;

    private String size;

    private Boolean isBestSeller;

    private Boolean isMultilanguage;

    public BookDTO(Long id, String title, Long authorId){

        this.id = id;
        this.title = title;
        this.authorId = authorId;

    }

}
