package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookDTO toDto(Book entity) {
        if (entity == null) return null;
        BookDTO dto = new BookDTO();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        if (entity.getAuthor() != null) {
            dto.setAuthorId(entity.getAuthor().getId());
        }
        return dto;
    }

    public Book toEntity(BookDTO dto) {
        if (dto == null) return null;
        Book entity = new Book();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        return entity;
    }
}
