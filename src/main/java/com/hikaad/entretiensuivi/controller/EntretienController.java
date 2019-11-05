package com.hikaad.entretiensuivi.controller;

import com.hikaad.entretiensuivi.dto.EntretienDTO;
import com.hikaad.entretiensuivi.model.Entretien;
import com.hikaad.entretiensuivi.repository.EntretienRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class EntretienController {

    private EntretienRepository entretienRepository;

    @Autowired
    public EntretienController(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    @GetMapping("/EntretienSuivi/Entretien/{id}")
    public List<Entretien> findElement(@PathVariable Long id) {
        try {
            return entretienRepository.findByCollaborateur(id);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienSuivi/Entretien")
    public Entretien addElement(@RequestBody EntretienDTO entretienDTO) {
        try {
            Entretien entretien = new Entretien();
            entretien.setSalarieid(entretienDTO.getSalarieid());
            entretien.setTypeentretienid(entretienDTO.getTypeentretienid());
            entretien.setRealiserpar(entretienDTO.getRealiserpar());
            entretien.setDateentretien(entretienDTO.getDateentretien());
            entretien.setHeuredebut(entretienDTO.getHeuredebut());
            entretien.setHeurefin(entretienDTO.getHeurefin());
            entretien.setDetail(entretienDTO.getDetail());
            entretien.setConclusion(entretienDTO.getConclusion());
            return entretienRepository.saveAndFlush(entretien);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Entretien();
        }
    }

    @DeleteMapping("/EntretienSuivi/Entretien/{id}")
    public boolean deleteElement(@PathVariable Long id) {
        try {
            entretienRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }
}
