package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HistoriqueRepository extends JpaRepository<Historique, Long> {

    @Query("select h from Historique h where h.collaborateurid = :collaborateurid and h.annee = :year")
    Historique findHistorique(@Param("collaborateurid") long collaborateurid,
                              @Param("year") long year);
}