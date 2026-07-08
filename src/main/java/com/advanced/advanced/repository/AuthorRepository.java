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

    @Query("SELECT new com.advanced.advanced.dto.AuthorDTO(t.id, t.name) FROM Author t WHERE t.name = :name")
    List<AuthorDTO> getByName(@Param("name") String name);



}



