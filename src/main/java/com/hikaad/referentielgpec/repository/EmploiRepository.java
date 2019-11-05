package com.hikaad.referentielgpec.repository;

import com.hikaad.referentielgpec.model.Emploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmploiRepository extends JpaRepository<Emploi, Long> {

    @Query("select e from Emploi e order by e.name asc")
    List<Emploi> findAll();

}