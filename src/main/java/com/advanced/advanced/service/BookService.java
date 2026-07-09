package com.advanced.advanced.service;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.entity.Author;
import com.advanced.advanced.entity.Book;
import com.advanced.advanced.mapper.BookMapper;
import com.advanced.advanced.repository.AuthorRepository;
import com.advanced.advanced.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;
    private final AuthorRepository authorRepository;
    private final BookMapper mapper;


    public BookDTO getByIdPersonalizedQuery(Long id){
        return this.repository.findBookByIdPersonalizedQuery(id);
    }
}
