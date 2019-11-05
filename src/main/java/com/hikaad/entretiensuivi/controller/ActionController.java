package com.hikaad.entretiensuivi.controller;

import com.hikaad.entretiensuivi.dto.ActionDTO;
import com.hikaad.entretiensuivi.model.Action;
import com.hikaad.entretiensuivi.repository.ActionRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ActionController {

    private ActionRepository actionRepository;

    @Autowired
    public ActionController(ActionRepository actionRepository) {
        this.actionRepository = actionRepository;
    }

    @GetMapping("/EntretienSuivi/Action/Proposition/Entreprise/{enterpriseid}")
    public List<Action> getActionProposeByCollaborateurAdmin(@PathVariable Long enterpriseid) {
        try {
            if (1000 == enterpriseid)
                return actionRepository.getAllProposition();
            else
                return actionRepository.getAllPropositionEnterprise(enterpriseid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/Proposition/{collaborateurid}")
    public List<Action> getActionProposeByCollaborateur(@PathVariable Long collaborateurid) {
        try {
            return actionRepository.getAllProposition(collaborateurid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/Planifie/Entreprise/{enterpriseid}")
    public List<Action> getActionPlanifieByCollaborateurAdmin(@PathVariable Long enterpriseid) {
        try {
            if (1000 == enterpriseid)
                return actionRepository.getAllPlanifie();
            else
                return actionRepository.getAllPlanifieEnterprise(enterpriseid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/Planifie/{collaborateurid}")
    public List<Action> getActionPlanifieByCollaborateur(@PathVariable Long collaborateurid) {
        try {
            return actionRepository.getAllPlanifie(collaborateurid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/Fini/{collaborateurid}")
    public List<Action> getActionFiniByCollaborateur(@PathVariable Long collaborateurid) {
        try {
            return actionRepository.getAllFini(collaborateurid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/Fini/Entreprise/{enterpriseid}")
    public List<Action> getActionFiniByCollaborateurEnterprise(@PathVariable Long enterpriseid) {
        try {
            if (1000 == enterpriseid)
                return actionRepository.getAllFini();
            else
                return actionRepository.getAllFiniEnterprise(enterpriseid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/Action/NonRetenu/{collaborateurid}")
    public List<Action> getActionNonRetenueByCollaborateur(@PathVariable Long collaborateurid) {
        try {
            return actionRepository.getAllFini(collaborateurid);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienSuivi/Action")
    public Action addElement(@RequestBody ActionDTO actionDTO) {
        try {
            Action action = new Action();
            action.setCollaborateurid(actionDTO.getCollaborateurid());
            action.setTypeactionid(actionDTO.getTypeactionid());
            action.setCreationdate(actionDTO.getCreationdate());
            action.setCreationbyid(actionDTO.getCreationbyid());
            action.setDescription(actionDTO.getDescription());
            action.setAvancementid(actionDTO.getAvancementid());
            action.setActeur(actionDTO.getActeur());
            action.setPiloteid(actionDTO.getPiloteid());
            return actionRepository.saveAndFlush(action);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Action();
        }
    }

    @PutMapping("/EntretienSuivi/Action")
    public Action updateElement(@RequestBody ActionDTO actionDTO) {
        try {
            Action action = actionRepository.getOne(actionDTO.getId());
            action.setTypeactionid(actionDTO.getTypeactionid());
            action.setDescription(actionDTO.getDescription());
            action.setAvancementid(actionDTO.getAvancementid());
            action.setActeur(actionDTO.getActeur());
            action.setPiloteid(actionDTO.getPiloteid());
            action.setDateavancement(actionDTO.getDateavancement());
            action.setRaisonnonretenue(actionDTO.getRaisonnonretenue());
            return actionRepository.saveAndFlush(action);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Action();
        }
    }

    @DeleteMapping("/EntretienSuivi/Action/{id}")
    public boolean deleteElement(@PathVariable Long id) {
        try {
            actionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }

}
