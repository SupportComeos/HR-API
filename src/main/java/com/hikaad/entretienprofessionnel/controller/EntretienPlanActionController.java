package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.EntretienPlanAction;
import com.hikaad.entretienprofessionnel.repository.EntretienPlanActionRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@RestController
public class EntretienPlanActionController {

    private EntretienPlanActionRepository entretienPlanActionRepository;

    @Autowired
    public EntretienPlanActionController(EntretienPlanActionRepository entretienPlanActionRepository) {
        this.entretienPlanActionRepository = entretienPlanActionRepository;
    }

    @GetMapping("/EntretienProfessionnel/Fiche/PlanAction/{id}/{year}")
    public List<EntretienPlanAction> getConclusion(@PathVariable Long id,
                                                   @PathVariable Long year) {
        try {
            return entretienPlanActionRepository.getAll(id, year);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/PlanAction/{collaborateurid}/{moyenid}/{delai}/{resultat}/{precision}")
    public EntretienPlanAction addItem(@PathVariable Long collaborateurid,
                                       @PathVariable String moyenid,
                                       @PathVariable String delai,
                                       @PathVariable String resultat,
                                       @PathVariable String precision) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            EntretienPlanAction entretienPlanAction = new EntretienPlanAction();
            entretienPlanAction.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            entretienPlanAction.setCollaborateurid(collaborateurid);
            entretienPlanAction.setMoyenid(Long.parseLong(moyenid));
            entretienPlanAction.setDelai(simpleDateFormat.parse(delai));
            entretienPlanAction.setResultat(resultat);
            entretienPlanAction.setPrecision(precision);
            return entretienPlanActionRepository.saveAndFlush(entretienPlanAction);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new EntretienPlanAction();
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/PlanAction/{id}/{moyenid}/{delai}/{resultat}/{precision}")
    public EntretienPlanAction updateItem(@PathVariable Long id,
                                          @PathVariable String moyenid,
                                          @PathVariable String delai,
                                          @PathVariable String resultat,
                                          @PathVariable String precision) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            EntretienPlanAction entretienPlanAction = entretienPlanActionRepository.getOne(id);
            entretienPlanAction.setMoyenid(Long.parseLong(moyenid));
            entretienPlanAction.setDelai(simpleDateFormat.parse(delai));
            entretienPlanAction.setResultat(resultat);
            entretienPlanAction.setPrecision(precision);
            return entretienPlanActionRepository.saveAndFlush(entretienPlanAction);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new EntretienPlanAction();
        }
    }

    @DeleteMapping("/EntretienProfessionnel/Fiche/PlanAction/{id}")
    public boolean deleteItem(@PathVariable Long id) {
        try {
            entretienPlanActionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }
}
