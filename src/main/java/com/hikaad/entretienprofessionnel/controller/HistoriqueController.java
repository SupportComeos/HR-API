package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.repository.HistoriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoriqueController {

    private HistoriqueRepository historiqueRepository;

    @Autowired
    public HistoriqueController(HistoriqueRepository historiqueRepository) {
        this.historiqueRepository = historiqueRepository;
    }
}
