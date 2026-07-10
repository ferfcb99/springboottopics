package com.advanced.advanced.repository;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(b.id, b.title, b.author.id) FROM Book b WHERE b.id = :id")
    BookDTO findBookByIdPersonalizedQuery(@Param("id") Long id);

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(o.id, o.title, o.author.id, o.pages, o.editorial, o.size, o.isBestSeller, o.isMultilanguage) FROM Book o WHERE o.isBestSeller = true")
    List<BookDTO> getAllBocksBesseller();

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(c.id, c.title, c.author.id, c.pages, c.editorial, c.size, c.isBestSeller, c.isMultilanguage) FROM Book c WHERE c.isMultilanguage = true")
    List<BookDTO> getAllBocksMultilenguaje();

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(k.id, k.title, k.author.id, k.pages, k.editorial, k.size, k.isBestSeller, k.isMultilanguage) FROM Book k")
    List<BookDTO> letterAO();

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(p.id, p.title, p.author.id, p.pages, p.editorial, p.size, p.isBestSeller, p.isMultilanguage) FROM Book p")
    List<BookDTO> getSizeBook();




}
