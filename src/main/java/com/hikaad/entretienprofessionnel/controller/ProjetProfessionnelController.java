package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.ProjetProfessionnel;
import com.hikaad.entretienprofessionnel.repository.ProjetProfessionnelRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProjetProfessionnelController {

    private ProjetProfessionnelRepository projetProfessionnelRepository;

    @Autowired
    public ProjetProfessionnelController(ProjetProfessionnelRepository projetProfessionnelRepository) {
        this.projetProfessionnelRepository = projetProfessionnelRepository;
    }

    @GetMapping("/EntretienProfessionnel/ProjetProfessionnel")
    public List<ProjetProfessionnel> getAll() {
        try {
            return projetProfessionnelRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

}
