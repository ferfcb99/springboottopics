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

    @GetMapping
    public ResponseEntity<ResponseAPI<List<BookDTO>>> getAll() {
        return ResponseEntity.ok(new ResponseAPI<>("200", "Success", service.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseAPI<BookDTO>> getById(@PathVariable Long id) {
        BookDTO dto = service.findById(id);
        if (dto == null) {
            return ResponseEntity.status(404).body(new ResponseAPI<>("404", "Not Found", null));
        }
        return ResponseEntity.ok(new ResponseAPI<>("200", "Success", dto));
    }

    @PostMapping
    public ResponseEntity<ResponseAPI<BookDTO>> create(@RequestBody BookDTO dto) {
        return ResponseEntity.status(201).body(new ResponseAPI<>("201", "Created", service.create(dto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseAPI<BookDTO>> update(@PathVariable Long id, @RequestBody BookDTO dto) {
        BookDTO updated = service.update(id, dto);
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
}
