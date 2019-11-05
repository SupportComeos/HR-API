package com.hikaad.global.repository;

import com.hikaad.global.model.Entreprises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntreprisesRepository extends JpaRepository<Entreprises, Long> {

    @Query("select e from Entreprises e where e.id in (:search)")
    List<Entreprises> findByFilter(@Param("search") Long[] search);
}