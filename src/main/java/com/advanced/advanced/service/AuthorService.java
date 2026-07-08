package com.advanced.advanced.service;

import com.advanced.advanced.dto.AuthorDTO;
import com.advanced.advanced.entity.Author;
import com.advanced.advanced.mapper.AuthorMapper;
import com.advanced.advanced.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository repository;
    private final AuthorMapper mapper;

    public List<AuthorDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public AuthorDTO findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    public AuthorDTO create(AuthorDTO dto) {
        Author entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    public AuthorDTO update(Long id, AuthorDTO dto) {
        if (!repository.existsById(id)) return null;
        Author entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public AuthorDTO getByIdPersonalizedQuery(Long id){
        AuthorDTO authorDTO = this.repository.getByIdPersonalizedQuery(id);
        return authorDTO;
    }
    public List<AuthorDTO> getByName(String name){

        List<AuthorDTO> authorDTOS = this.repository.getByName(name);
        return authorDTOS;

    }
    public List<AuthorDTO> getByWord(String word){
        List<AuthorDTO> authorDTO = this.repository.getByWord(word);
        return authorDTO;
    }
    public AuthorDTO getFirstAuthor(){
        List<AuthorDTO> authorDTOS = this.repository.getFirstAuthor();

        return authorDTOS.get(0);


    }

}
