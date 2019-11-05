package com.hikaad.entretienprofessionnel.controller;

import com.hikaad.entretienprofessionnel.model.EntretienConclusion;
import com.hikaad.entretienprofessionnel.repository.EntretienConclusionRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class EntretienConclusionController {

    private EntretienConclusionRepository entretienConclusionRepository;

    @Autowired
    public EntretienConclusionController(EntretienConclusionRepository entretienConclusionRepository) {
        this.entretienConclusionRepository = entretienConclusionRepository;
    }

    @GetMapping("/EntretienProfessionnel/Fiche/Conclusion/{id}/{year}")
    public EntretienConclusion getConclusion(@PathVariable Long id,
                                             @PathVariable Long year) {
        try {
            return entretienConclusionRepository.getCurrentConclusions(id, year);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new EntretienConclusion();
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/Conclusion/Collaborateur/Evolution/{id}/{content}")
    public boolean updateConclusionCollaborateurEvolution(@PathVariable Long id,
                                                          @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = entretienConclusionRepository.getOne(id);
            if ("null".equals(content))
                entretienConclusion.setCollaborateurevolution("");
            else
                entretienConclusion.setCollaborateurevolution(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/Conclusion/Collaborateur/Deroulement/{id}/{content}")
    public boolean updateConclusionCollaborateurDeroulement(@PathVariable Long id,
                                                            @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = entretienConclusionRepository.getOne(id);
            if ("null".equals(content))
                entretienConclusion.setCollaborateurderoulement("");
            else
                entretienConclusion.setCollaborateurderoulement(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/Conclusion/Responsable/Evolution/{id}/{content}")
    public boolean updateConclusionResponsableEvolution(@PathVariable Long id,
                                                          @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = entretienConclusionRepository.getOne(id);
            if ("null".equals(content))
                entretienConclusion.setResponsableevolution("");
            else
                entretienConclusion.setResponsableevolution(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PutMapping("/EntretienProfessionnel/Fiche/Conclusion/Responsable/Deroulement/{id}/{content}")
    public boolean updateConclusionResponsableDeroulement(@PathVariable Long id,
                                                            @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = entretienConclusionRepository.getOne(id);
            if ("null".equals(content))
                entretienConclusion.setResponsablederoulement("");
            else
                entretienConclusion.setResponsablederoulement(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/Conclusion/Collaborateur/Evolution/{id}/{content}")
    public boolean addConclusionCollaborateurEvolution(@PathVariable Long id,
                                                          @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = new EntretienConclusion();
            entretienConclusion.setCollaborateurid(id);
            entretienConclusion.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienConclusion.setCollaborateurevolution("");
            else
                entretienConclusion.setCollaborateurevolution(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/Conclusion/Collaborateur/Deroulement/{id}/{content}")
    public boolean addConclusionCollaborateurDeroulement(@PathVariable Long id,
                                                            @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = new EntretienConclusion();
            entretienConclusion.setCollaborateurid(id);
            entretienConclusion.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienConclusion.setCollaborateurderoulement("");
            else
                entretienConclusion.setCollaborateurderoulement(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/Conclusion/Responsable/Evolution/{id}/{content}")
    public boolean addConclusionResponsableEvolution(@PathVariable Long id,
                                                        @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = new EntretienConclusion();
            entretienConclusion.setCollaborateurid(id);
            entretienConclusion.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienConclusion.setResponsableevolution("");
            else
                entretienConclusion.setResponsableevolution(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

    @PostMapping("/EntretienProfessionnel/Fiche/Conclusion/Responsable/Deroulement/{id}/{content}")
    public boolean addConclusionResponsableDeroulement(@PathVariable Long id,
                                                          @PathVariable String content) {
        try {
            EntretienConclusion entretienConclusion = new EntretienConclusion();
            entretienConclusion.setCollaborateurid(id);
            entretienConclusion.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            if ("null".equals(content))
                entretienConclusion.setResponsablederoulement("");
            else
                entretienConclusion.setResponsablederoulement(content);
            entretienConclusionRepository.saveAndFlush(entretienConclusion);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }
}