package com.hikaad.global.repository;

import com.hikaad.global.model.Departements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartementsRepository extends JpaRepository<Departements, Long> {

    @Query("select d from Departements d order by d.name asc")
    List<Departements> findAll();

}
