package com.hikaad.referentielgpec.controller;

import com.hikaad.referentielgpec.model.Emploi;
import com.hikaad.referentielgpec.repository.EmploiRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class EmploiController {

    private EmploiRepository emploiRepository;

    @Autowired
    public EmploiController(EmploiRepository emploiRepository) {
        this.emploiRepository = emploiRepository;
    }

    @GetMapping("/ReferentielGpec/Emploi")
    public List<Emploi> getAll() {
        try {
            return emploiRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

}
