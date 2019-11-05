package com.hikaad.entretiensuivi.repository;

import com.hikaad.entretiensuivi.model.TypeEntretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypeEntretienRepository extends JpaRepository<TypeEntretien, Long> {

    @Query("select t from TypeEntretien t order by t.name asc")
    List<TypeEntretien> findAll();

    @Query("select t from TypeEntretien t where t.name like %:text% order by t.name asc")
    List<TypeEntretien> searchAll(@Param("text") String text);
}
