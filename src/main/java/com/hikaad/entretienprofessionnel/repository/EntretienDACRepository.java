package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienDAC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntretienDACRepository extends JpaRepository<EntretienDAC, Long> {

    @Query("select e from EntretienDAC e where e.collaborateurid = :collaborateurid and e.annee = :year")
    EntretienDAC getAll(@Param("collaborateurid") Long collaborateurid,
                        @Param("year") Long year);

    @Query("select e from EntretienDAC e where e.annee = :year and e.collaborateurid = :collaborateurid")
    EntretienDAC getEvaluation(@Param("collaborateurid") Long collaborateurid,
                               @Param("year") Long year);

}