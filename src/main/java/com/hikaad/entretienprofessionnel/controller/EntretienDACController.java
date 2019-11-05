package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.EntretienDAC;
import com.hikaad.entretienprofessionnel.repository.EntretienDACRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class EntretienDACController {

    private EntretienDACRepository entretienDACRepository;

    @Autowired
    public EntretienDACController(EntretienDACRepository entretienDACRepository) {
        this.entretienDACRepository = entretienDACRepository;
    }

    @GetMapping("/EntretienProfessionnel/Fiche/DAC/{id}/{year}")
    public EntretienDAC getConclusion(@PathVariable Long id,
                                      @PathVariable Long year) {
        try {
            return entretienDACRepository.getAll(id, year);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new EntretienDAC();
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/DAC/{collaborateurid}/{itemid}/{content}")
    public boolean addItem(@PathVariable Long collaborateurid,
                           @PathVariable Long itemid,
                           @PathVariable String content) {
        try {
            EntretienDAC entretienDAC = new EntretienDAC();
            entretienDAC.setCollaborateurid(collaborateurid);
            entretienDAC.setAnnee(Calendar.getInstance().get(Calendar.YEAR));

            if (itemid == 1)
                entretienDAC.setCpa(Long.parseLong(content));
            else
                if (itemid == 2)
                    entretienDAC.setCpf(Long.parseLong(content));
                else
                    if (itemid == 3)
                        entretienDAC.setCep(Long.parseLong(content));
                    else
                        entretienDAC.setBilan(Long.parseLong(content));

            entretienDACRepository.saveAndFlush(entretienDAC);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("POST /EntretienProfessionnel/Fiche/DAC/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/DAC/{collaborateurid}/{itemid}/{content}")
    public boolean updateItem(@PathVariable Long collaborateurid,
                              @PathVariable Long itemid,
                              @PathVariable String content) {
        try {
            EntretienDAC entretienDAC = entretienDACRepository.getEvaluation(collaborateurid, (long ) Calendar.getInstance().get(Calendar.YEAR));

            if (itemid == 1)
                entretienDAC.setCpa(Long.parseLong(content));
            else
            if (itemid == 2)
                entretienDAC.setCpf(Long.parseLong(content));
            else
            if (itemid == 3)
                entretienDAC.setCep(Long.parseLong(content));
            else
                entretienDAC.setBilan(Long.parseLong(content));

            entretienDACRepository.saveAndFlush(entretienDAC);
            return true;
        } catch (Exception e) {
            HikaadLogger.error("PUT /EntretienProfessionnel/Fiche/PointEtape/{collaborateurid}/{itemid}/{content} - " + e.toString());
            return false;
        }
    }
}
