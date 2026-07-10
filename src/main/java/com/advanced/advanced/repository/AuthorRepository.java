package com.advanced.advanced.repository;

import com.advanced.advanced.dto.AuthorDTO;
import com.advanced.advanced.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    // JQPL
    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(a.id, a.name) FROM Author a WHERE a.id = :id")
    AuthorDTO getByIdPersonalizedQuery(@Param("id") Long id);

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(u.id, u.name) FROM Author u WHERE u.name = :name")
    List<AuthorDTO> getByName(@Param("name") String name);

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(t.id, t.name) FROM Author t WHERE t.name LIKE CONCAT('%', :word, '%')")
    List<AuthorDTO> getByWord(@Param("word") String word);

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(h.id, h.name) FROM Author h ORDER BY h.id ASC")
    List<AuthorDTO> getFirstAuthor();

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(o.id, o.name, o.lastName, o.age, o.street) FROM Author o WHERE o.age BETWEEN 30 AND 40")
    List<AuthorDTO> getAgeAuthor();

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(r.id, r.name, r.lastName, r.age, r.street) FROM Author r ORDER BY r.lastName ASC")
    List<AuthorDTO> getLastNameAuthor();

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(s.id, s.name, s.lastName, s.age, s.street) FROM Author s WHERE s.id BETWEEN :minId AND :maxId")
    List<AuthorDTO> getRangeIdAuthor(@Param("minId") Integer minId, @Param("maxId") Integer maxId);


}



