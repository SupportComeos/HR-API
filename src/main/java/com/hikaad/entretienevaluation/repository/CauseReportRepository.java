package com.hikaad.entretienevaluation.repository;

import com.hikaad.entretienevaluation.model.CauseReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CauseReportRepository extends JpaRepository<CauseReport, Long> {

    @Query("select c from CauseReport c order by c.name asc")
    List<CauseReport> findAll();
}