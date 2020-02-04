package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.EntretienPlanAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface EntretienPlanActionRepository extends JpaRepository<EntretienPlanAction, Long> {

    @Query("select e from EntretienPlanAction e where e.collaborateurid = :collaborateurid and e.annee = :year")
    List<EntretienPlanAction> getAll(@Param("collaborateurid") Long collaborateurid,
                                     @Param("year") Long year);

    @Query( value = "select E.* from EntretienProfessionnel_Evaluation_PDI E inner join Salaries S on S.ID = E.SalarieID where S.stepentretienprofessionnel = 3 and S.ResponsableID = :collaborateurid and  E.Delai <= DATE_ADD(:today, INTERVAL 30 DAY) AND E.Delai > DATE_ADD(:today, INTERVAL -1 DAY) order by E.Delai ASC",
            nativeQuery = true)
    List<EntretienPlanAction> getAll(@Param("collaborateurid") Long collaborateurid,
                                     @Param("today") Date today);

    @Query("select e from EntretienPlanAction e where e.collaborateurid = :collaborateurid order by e.delai asc")
    List<EntretienPlanAction> getAll(@Param("collaborateurid") Long collaborateurid);

    @Modifying
    @Transactional
    @Query("update EntretienPlanAction e set e.done = 1, e.delai = :today where e.id = :id")
    void updateDone(@Param("id") long id,
                    @Param("today") Date today);

    @Modifying
    @Transactional
    @Query("update EntretienPlanAction e set e.done = 0 where e.id = :id")
    void updateReopen(@Param("id") long id);
}