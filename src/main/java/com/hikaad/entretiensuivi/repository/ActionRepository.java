package com.hikaad.entretiensuivi.repository;

import com.hikaad.entretiensuivi.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActionRepository extends JpaRepository<Action, Long> {

    @Query("select a from Action a where a.avancementid = 0 and (a.raisonnonretenue is null or a.raisonnonretenue = '') order by a.creationdate desc")
    List<Action> getAllProposition();

    @Query("select a from Action a where a.avancementid = 0 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateur.enterpriseid = :enterpriseid order by a.creationdate desc")
    List<Action> getAllPropositionEnterprise(@Param("enterpriseid") Long enterpriseid);

    @Query("select a from Action a where a.avancementid = 0 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateurid = :collaborateurid order by a.creationdate desc")
    List<Action> getAllProposition(@Param("collaborateurid") Long collaborateurid);





    @Query("select a from Action a where a.avancementid = 2 and (a.raisonnonretenue is null or a.raisonnonretenue = '') order by a.creationdate desc")
    List<Action> getAllPlanifie();

    @Query("select a from Action a where a.avancementid = 2 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateur.enterpriseid = :enterpriseid order by a.creationdate desc")
    List<Action> getAllPlanifieEnterprise(@Param("enterpriseid") Long enterpriseid);

    @Query("select a from Action a where a.avancementid = 2 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateurid = :collaborateurid order by a.creationdate desc")
    List<Action> getAllPlanifie(@Param("collaborateurid") Long collaborateurid);





    @Query("select a from Action a where a.avancementid = 3 and (a.raisonnonretenue is null or a.raisonnonretenue = '') order by a.creationdate desc")
    List<Action> getAllFini();

    @Query("select a from Action a where a.avancementid = 3 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateur.enterpriseid = :enterpriseid order by a.creationdate desc")
    List<Action> getAllFiniEnterprise(@Param("enterpriseid") Long enterpriseid);

    @Query("select a from Action a where a.avancementid = 3 and (a.raisonnonretenue is null or a.raisonnonretenue = '') and a.collaborateurid = :collaborateurid order by a.creationdate desc")
    List<Action> getAllFini(@Param("collaborateurid") Long collaborateurid);





    @Query("select a from Action a where (a.raisonnonretenue is not null or a.raisonnonretenue <> '') and a.collaborateurid = :collaborateurid order by a.creationdate desc")
    List<Action> getAllNonRetenue(@Param("collaborateurid") Long collaborateurid);
}