package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienConclusion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntretienConclusionRepository extends JpaRepository<EntretienConclusion, Long> {

    @Query("select ec from EntretienConclusion ec where ec.annee = :year and ec.collaborateurid = :collaborateurid")
    EntretienConclusion getCurrentConclusions(@Param("collaborateurid") Long collaborateurid,
                                              @Param("year") Long year);
}
