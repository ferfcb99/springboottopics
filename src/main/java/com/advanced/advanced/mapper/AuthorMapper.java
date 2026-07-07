package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.AuthorDTO;
import com.advanced.advanced.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {
    public AuthorDTO toDto(Author entity) {
        if (entity == null) return null;
        AuthorDTO dto = new AuthorDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public Author toEntity(AuthorDTO dto) {
        if (dto == null) return null;
        Author entity = new Author();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
