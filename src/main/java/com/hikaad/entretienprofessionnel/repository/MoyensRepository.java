package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.Moyens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MoyensRepository extends JpaRepository<Moyens, Long> {

    @Query("select m from Moyens m order by m.name asc")
    List<Moyens> findAll();
}
