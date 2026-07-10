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

    // crear un endpoint que obtenga todos los registros de los autores cuya edad este entre 30 y 40 anios
    @GetMapping(path = "/get-age-author")
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> getAgeAuthor(){
        List<AuthorDTO> authorDTOS = this.service.geyAgeAuthor();

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200","Success", authorDTOS));
    }

    // crear un endpoint que devuelva todos los autores ordenados por apellido
    @GetMapping(path = "/get-lastName-author")
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> getLastNameAuthor(){
        List<AuthorDTO> authorDTOS = this.service.getLastNameAuthor();

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTOS));
    }
    // crear un endpoint que devuelva todos los autores entre un rango de ids
    @GetMapping(path = "/get-range-id-author/{minId}/{maxId}")
    public ResponseEntity<ResponseAPI<List<AuthorDTO>>> getRangeIdAuthor(@PathVariable("minId") Integer minId, @PathVariable("maxId") Integer maxId){
        List<AuthorDTO> authorDTOS = this.service.getRangeIdAuthor(minId, maxId);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", authorDTOS));
    }
}
