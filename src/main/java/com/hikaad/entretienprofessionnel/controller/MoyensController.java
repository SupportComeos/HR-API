package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.Moyens;
import com.hikaad.entretienprofessionnel.repository.MoyensRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class MoyensController {

    private MoyensRepository moyensRepository;

    @Autowired
    public MoyensController(MoyensRepository moyensRepository) {
        this.moyensRepository = moyensRepository;
    }

    @GetMapping("/EntretienProfessionnel/Moyens")
    public List<Moyens> getAll() {
        try {
            return moyensRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

}
