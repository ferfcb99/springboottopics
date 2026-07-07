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

    public List<BookDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public BookDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    public BookDTO create(BookDTO dto) {
        Book entity = mapper.toEntity(dto);
        if (dto.getAuthorId() != null) {
            Author author = authorRepository.findById(dto.getAuthorId()).orElse(null);
            entity.setAuthor(author);
        }
        return mapper.toDto(repository.save(entity));
    }

    public BookDTO update(Long id, BookDTO dto) {
        if (!repository.existsById(id)) return null;
        Book entity = mapper.toEntity(dto);
        entity.setId(id);
        if (dto.getAuthorId() != null) {
            Author author = authorRepository.findById(dto.getAuthorId()).orElse(null);
            entity.setAuthor(author);
        }
        return mapper.toDto(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public BookDTO getByIdPersonalizedQuery(Long id){
        return this.repository.findBookByIdPersonalizedQuery(id);
    }
}
