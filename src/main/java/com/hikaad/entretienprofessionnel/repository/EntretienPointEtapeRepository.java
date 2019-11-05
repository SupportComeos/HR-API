package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienPointEtape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntretienPointEtapeRepository extends JpaRepository<EntretienPointEtape, Long> {

    @Query("select e from EntretienPointEtape e where e.collaborateurid = :collaborateurid and e.annee = :year")
    List<EntretienPointEtape> getAll(@Param("collaborateurid") Long collaborateurid,
                                     @Param("year") Long year);

    @Query("select e from EntretienPointEtape e where e.annee = :year and e.collaborateurid = :collaborateurid and e.pointetapeid = :itemid")
    EntretienPointEtape getEvaluation(@Param("collaborateurid") Long collaborateurid,
                                      @Param("itemid") Long itemid,
                                      @Param("year") Long year);
}