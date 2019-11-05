package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.PointEtape;
import com.hikaad.entretienprofessionnel.repository.PointEtapeRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PointEtapeController {

    private PointEtapeRepository pointEtapeRepository;

    @Autowired
    public PointEtapeController(PointEtapeRepository pointEtapeRepository) {
        this.pointEtapeRepository = pointEtapeRepository;
    }

    @GetMapping("/EntretienProfessionnel/PointEtape")
    public List<PointEtape> getAll() {
        try {
            return pointEtapeRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

}
