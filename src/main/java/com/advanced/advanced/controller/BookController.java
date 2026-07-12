package com.advanced.advanced.controller;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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

    // CREAR UN ENDPOINT QUE DEUVELVA TODOS LOS LIBROS QUE SON BESSELLER
    @GetMapping(path = "/get-all-bocks-besseller")
    public ResponseEntity<ResponseAPI<List<BookDTO>>> gettAllBocksBesseller(){
        List<BookDTO> bocksBesseller = this.service.getAllBocksBesseler();

        return ResponseEntity.status((HttpStatus.OK))
                .body(new ResponseAPI<>("200", "Success", bocksBesseller));
    }

    // CREAR UN ENDPOINT QUE DEVUELVA TODOS LOS LIBROS QUE SON MULTILENGUAJE
    @GetMapping(path = "/get-all-bocks-multilenguaje")
    public ResponseEntity<ResponseAPI<List<BookDTO>>> getAllBocksMultilenguaje(){
        List<BookDTO> bocksMultilenguaje = this.service.getAllBocksMultilenguaje();

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", bocksMultilenguaje));
    }

    // CREAR UN ENDPOINT QUE DEVUELVA TODOS AQUELLOS LIBROS QUE NO TENGAN LA LETRA 'A' O 'a' EN SU NOMBRE
    // la condicion no puede formar parte de la consulta y debe ser calculada desde la logica del servicio
    @GetMapping(path = "/letter-a-o")
    public ResponseEntity<ResponseAPI<List<BookDTO>>> letterAO(){
        List<BookDTO> letter = this.service.letterAO();

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", letter));
    }



    // CREAR UN ENDPOINT QUE DEVUELVA TODOS AQUELLOS LIBROS QUE sean de tamanio X (x debe ser recibido por parametro)
    // y la logica de busqueda debe ser calculada desde el servicio (no en la consulta jpql)
    @GetMapping(path = "/get-size-book/{size}")
    public ResponseEntity<ResponseAPI<List<BookDTO>>> getSizeBook(@PathVariable("size") String size){
        List<BookDTO> sizeBook = this.service.getSizeBook(size);

            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseAPI<>("200", "Success", sizeBook));
        }
    // crear un endpoint que devuelva todos los libros que tengan menos o igual a X paginas y que sean de tamanio Y
    @GetMapping(path = "/get-pages-book/{maxPage}/{size}")
    public ResponseEntity<ResponseAPI<List<BookDTO>>> getPagesBook(@PathVariable("maxPage") Integer maxPage, @PathVariable("size") String size){ // corregir
        List<BookDTO> pagesBook = this.service.getPagesBook(maxPage,size);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Success", pagesBook));

    }

}

