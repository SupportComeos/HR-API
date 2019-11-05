package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienPlanAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntretienPlanActionRepository extends JpaRepository<EntretienPlanAction, Long> {

    @Query("select e from EntretienPlanAction e where e.collaborateurid = :collaborateurid and e.annee = :year")
    List<EntretienPlanAction> getAll(@Param("collaborateurid") Long collaborateurid,
                                     @Param("year") Long year);
}