package com.hikaad.global.repository;

import com.hikaad.global.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Services, Long> {

    @Query("select s from Services s order by s.name asc")
    List<Services> findAll();
}
