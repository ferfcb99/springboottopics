package com.advanced.advanced.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthorDTO {
    private Long id;
    private String name;
    private String lastName;

    private Integer age;

    private String street;


    public AuthorDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

}

