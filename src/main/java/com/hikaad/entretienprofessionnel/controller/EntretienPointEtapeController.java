package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.EntretienPointEtape;
import com.hikaad.entretienprofessionnel.repository.EntretienPointEtapeRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@RestController
public class EntretienPointEtapeController {

    private EntretienPointEtapeRepository entretienPointEtapeRepository;

    @Autowired
    public EntretienPointEtapeController(EntretienPointEtapeRepository entretienPointEtapeRepository) {
        this.entretienPointEtapeRepository = entretienPointEtapeRepository;
    }

    @GetMapping("/EntretienProfessionnel/Fiche/PointEtape/{id}/{year}")
    public List<EntretienPointEtape> getConclusion(@PathVariable Long id,
                                                   @PathVariable Long year) {
        try {
            return entretienPointEtapeRepository.getAll(id, year);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/PointEtape/{collaborateurid}/{itemid}/{content}")
    public boolean addItem(@PathVariable Long collaborateurid,
                           @PathVariable Long itemid,
                           @PathVariable String content) {
        try {
            EntretienPointEtape entretienConclusion = new EntretienPointEtape();
            entretienConclusion.setCollaborateurid(collaborateurid);
            entretienConclusion.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            entretienConclusion.setPointetapeid(itemid);
            if ("null".equals(content))
                entretienConclusion.setCommentaire("");
            else
                entretienConclusion.setCommentaire(content);
            entretienPointEtapeRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("POST /EntretienProfessionnel/Fiche/PointEtape/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/PointEtape/{collaborateurid}/{itemid}/{content}")
    public boolean updateItem(@PathVariable Long collaborateurid,
                              @PathVariable Long itemid,
                              @PathVariable String content) {
        try {
            EntretienPointEtape entretienPointEtape = entretienPointEtapeRepository.getEvaluation(collaborateurid, itemid, (long ) Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienPointEtape.setCommentaire("");
            else
                entretienPointEtape.setCommentaire(content);
            entretienPointEtapeRepository.saveAndFlush(entretienPointEtape);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("PUT /EntretienProfessionnel/Fiche/PointEtape/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }
}
