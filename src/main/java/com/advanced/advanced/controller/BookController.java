package com.advanced.advanced.controller;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService service;



    @GetMapping("/get-by-id-personalized-query/{id}")
    public ResponseEntity<ResponseAPI<BookDTO>> getByIdPersonalizedQuery(@PathVariable("id") Long id){

        BookDTO bookDTO = this.service.getByIdPersonalizedQuery(id);
        return ResponseEntity.status(200)
                .body(new ResponseAPI<>("200", "Success", bookDTO));

    }
}
