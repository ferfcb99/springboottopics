package com.advanced.advanced.controller;

import com.advanced.advanced.dto.AuthorDTO;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.AuthorService;
import lombok.RequiredArgsConstructor;
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
}
