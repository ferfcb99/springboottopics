package com.advanced.advanced.repository;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT new com.advanced.advanced.dto.BookDTO(b.id, b.title, b.author.id) FROM Book b WHERE b.id = :id")
    BookDTO findBookByIdPersonalizedQuery(@Param("id") Long id);

}
