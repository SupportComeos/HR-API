package com.hikaad.entretienevaluation.controller;

import com.hikaad.entretienevaluation.model.CauseReport;
import com.hikaad.entretienevaluation.repository.CauseReportRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CauseReportController {

    private CauseReportRepository causeReportRepository;

    @Autowired
    public CauseReportController(CauseReportRepository causeReportRepository) {
        this.causeReportRepository = causeReportRepository;
    }

    @GetMapping("/EntretienProfessionnel/CausesReport")
    public List<CauseReport> getAll() {
        try {
            return causeReportRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

}
