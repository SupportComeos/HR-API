package com.hikaad.entretienprofessionnel.repository;

import com.hikaad.entretienprofessionnel.model.ProjetProfessionnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjetProfessionnelRepository extends JpaRepository<ProjetProfessionnel, Long> {

    @Query("select p from ProjetProfessionnel p order by id asc")
    List<ProjetProfessionnel> findAll();
}
