package com.hikaad.entretiensuivi.repository;

import com.hikaad.entretiensuivi.model.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntretienRepository extends JpaRepository<Entretien, Long> {

    @Query("select e from Entretien e where e.salarieid = :id order by e.dateentretien desc")
    List<Entretien> findByCollaborateur(@Param("id") Long id);
}
