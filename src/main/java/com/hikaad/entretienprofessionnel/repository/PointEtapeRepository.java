package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.PointEtape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PointEtapeRepository extends JpaRepository<PointEtape, Long> {

    @Query("select p from PointEtape p order by id asc")
    List<PointEtape> findAll();
}
