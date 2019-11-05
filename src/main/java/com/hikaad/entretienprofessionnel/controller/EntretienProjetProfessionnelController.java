package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.EntretienProjetProfessionnel;
import com.hikaad.entretienprofessionnel.repository.EntretienProjetProfessionnelRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@RestController
public class EntretienProjetProfessionnelController {

    private EntretienProjetProfessionnelRepository entretienProjetProfessionnelRepository;

    @Autowired
    public EntretienProjetProfessionnelController(EntretienProjetProfessionnelRepository entretienProjetProfessionnelRepository) {
        this.entretienProjetProfessionnelRepository = entretienProjetProfessionnelRepository;
    }

    @GetMapping("/EntretienProfessionnel/Fiche/ProjetProfessionnel/{id}/{year}")
    public List<EntretienProjetProfessionnel> getConclusion(@PathVariable Long id,
                                                            @PathVariable Long year) {
        try {
            return entretienProjetProfessionnelRepository.getAll(id, year);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/ProjetProfessionnel/{collaborateurid}/{itemid}/{content}")
    public boolean addItem(@PathVariable Long collaborateurid,
                           @PathVariable Long itemid,
                           @PathVariable String content) {
        try {
            EntretienProjetProfessionnel entretienProjetProfessionnel = new EntretienProjetProfessionnel();
            entretienProjetProfessionnel.setCollaborateurid(collaborateurid);
            entretienProjetProfessionnel.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            entretienProjetProfessionnel.setProjetprofessionnelid(itemid);
            if ("null".equals(content))
                entretienProjetProfessionnel.setCommentaire("");
            else
                entretienProjetProfessionnel.setCommentaire(content);
            entretienProjetProfessionnelRepository.saveAndFlush(entretienProjetProfessionnel);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("POST /EntretienProfessionnel/Fiche/ProjetProfessionnel/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/ProjetProfessionnel/{collaborateurid}/{itemid}/{content}")
    public boolean updateItem(@PathVariable Long collaborateurid,
                              @PathVariable Long itemid,
                              @PathVariable String content) {
        try {
            EntretienProjetProfessionnel entretienProjetProfessionnel = entretienProjetProfessionnelRepository.getEvaluation(collaborateurid, itemid, (long ) Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienProjetProfessionnel.setCommentaire("");
            else
                entretienProjetProfessionnel.setCommentaire(content);
            entretienProjetProfessionnelRepository.saveAndFlush(entretienProjetProfessionnel);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("PUT /EntretienProfessionnel/Fiche/ProjetProfessionnel/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }
}
