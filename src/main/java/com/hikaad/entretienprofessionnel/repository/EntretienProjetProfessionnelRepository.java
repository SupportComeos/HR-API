package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienProjetProfessionnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntretienProjetProfessionnelRepository extends JpaRepository<EntretienProjetProfessionnel, Long> {

    @Query("select e from EntretienProjetProfessionnel e where e.collaborateurid = :collaborateurid and e.annee = :year")
    List<EntretienProjetProfessionnel> getAll(@Param("collaborateurid") Long collaborateurid,
                                              @Param("year") Long year);

    @Query("select e from EntretienProjetProfessionnel e where e.annee = :year and e.collaborateurid = :collaborateurid and e.projetprofessionnelid = :itemid")
    EntretienProjetProfessionnel getEvaluation(@Param("collaborateurid") Long collaborateurid,
                                               @Param("itemid") Long itemid,
                                               @Param("year") Long year);
}