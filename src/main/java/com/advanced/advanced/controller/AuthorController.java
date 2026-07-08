package com.advanced.advanced.controller;

import com.advanced.advanced.dto.AuthorDTO;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService service;

    @GetMapping
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> getAll() {
        return ResponseEntity.ok(new ResponseAPI<>("200", "Success", service.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseAPI<AuthorDTO>> getById(@PathVariable Long id) {
        AuthorDTO dto = service.findById(id);
        if (dto == null) {
            return ResponseEntity.status(404).body(new ResponseAPI<>("404", "Not Found", null));
        }
        return ResponseEntity.ok(new ResponseAPI<>("200", "Success", dto));
    }

    @PostMapping
    public ResponseEntity<ResponseAPI<AuthorDTO>> create(@RequestBody AuthorDTO dto) {
        return ResponseEntity.status(201).body(new ResponseAPI<>("201", "Created", service.create(dto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseAPI<AuthorDTO>> update(@PathVariable Long id, @RequestBody AuthorDTO dto) {
        AuthorDTO updated = service.update(id, dto);
        if (updated == null) {
            return ResponseEntity.status(404).body(new ResponseAPI<>("404", "Not Found", null));
        }
        return ResponseEntity.ok(new ResponseAPI<>("200", "Updated", updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseAPI<Void>> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(new ResponseAPI<>("200", "Deleted", null));
    }

    @GetMapping(path = "/get-by-id-personalized-query/{id}")
    public ResponseEntity<ResponseAPI<AuthorDTO>> getByIdPersonalizedQuery(@PathVariable("id") Long id){
        AuthorDTO authorDTO = service.getByIdPersonalizedQuery(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTO));
    }
    // crear un endpoint que devuelva una lista de elementos de tipo AuthorDto que se calculen en base a un nombre
    @GetMapping(path = "/get-by-name/{name}")
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> geyByName(@PathVariable("name") String name){
        List<AuthorDTO> authorDTO = service.getByName(name);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTO));
    }
    // crear un endpoint que devuelva una lista de elementos de todos los autores que contengan una letra que es
    // enviada por parametro en el endpoint, like
    @GetMapping(path = "/get-by-word/{word}")
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> getByWord(@PathVariable("word") String word){
        List<AuthorDTO> authorDTO = service.getByWord(word);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTO));
    }

    // crear un endpoint que devuelva el primer autor de la consulta de todos los autores
    @GetMapping(path = "/get-first-author")
    public ResponseEntity<ResponseAPI<AuthorDTO>> getFirstAuthor(){
        AuthorDTO authorDTO1 = this.service.getFirstAuthor();

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTO1));

    }

}
