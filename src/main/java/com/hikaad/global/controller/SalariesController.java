package com.hikaad.global.controller;

import com.hikaad.entretienprofessionnel.model.Historique;
import com.hikaad.entretienprofessionnel.repository.HistoriqueRepository;
import com.hikaad.global.model.Salaries;
import com.hikaad.global.repository.SalariesRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class SalariesController {

    private SalariesRepository salariesRepository;
    private HistoriqueRepository historiqueRepository;

    @Autowired
    public SalariesController(SalariesRepository salariesRepository, HistoriqueRepository historiqueRepository) {
        this.salariesRepository = salariesRepository;
        this.historiqueRepository = historiqueRepository;
    }

    @GetMapping("/Salaries")
    public List<Salaries> getAll() {
        try {
            return salariesRepository.findAllSimple(new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/{id}")
    public Salaries getAll(@PathVariable Long id) {
        try {
            return salariesRepository.findOneSalarie(id);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Salaries();
        }
    }

    @GetMapping("/Salaries/All/Entreprise/{entrepriseid}/Search/{text}")
    public List<Salaries> getAllSearchAll(@PathVariable Long entrepriseid,
                                          @PathVariable String text) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAll(text, new Date());
            else
                return salariesRepository.findAll(entrepriseid, text, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/All/Entreprise/{entrepriseid}")
    public List<Salaries> getAllSearchAll(@PathVariable Long entrepriseid) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAll(new Date());
            else
                return salariesRepository.findAll(entrepriseid, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/N1/{id}/Entreprise/{entrepriseid}/Search/{text}")
    public List<Salaries> getAllSearchN1(@PathVariable Long id,
                                         @PathVariable Long entrepriseid,
                                         @PathVariable String text) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAllN1(id, text, new Date());
            else
                return salariesRepository.findAllN1(id, entrepriseid, text, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/N1/{id}/Entreprise/{entrepriseid}")
    public List<Salaries> getAllSearchN1(@PathVariable Long id,
                                         @PathVariable Long entrepriseid) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAllN1(id, new Date());
            else
                return salariesRepository.findAllN1(id, entrepriseid, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/N1All/{id}/Entreprise/{entrepriseid}/Search/{text}")
    public List<Salaries> getAllSearchN1All(@PathVariable Long id,
                                            @PathVariable Long entrepriseid,
                                            @PathVariable String text) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAllN1All(id, text, new Date());
            else
                return salariesRepository.findAllN1All(id, entrepriseid, text, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/N1All/{id}/Entreprise/{entrepriseid}")
    public List<Salaries> getAllSearchN1All(@PathVariable Long id,
                                            @PathVariable Long entrepriseid) {
        try {
            if (1000 == entrepriseid)
                return salariesRepository.findAllN1All(id, new Date());
            else
                return salariesRepository.findAllN1All(id, entrepriseid, new Date());
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Salaries/Responsables")
    public List<Salaries> gerResponsable() {
        try {
            return salariesRepository.findResponsable();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienProfessionnel/Report/{collaborateurid}/{caudereportid}")
    public Salaries updateEP(@PathVariable Long collaborateurid,
                            @PathVariable Long caudereportid) {
        try {
            Historique historique = new Historique();
            historique.setCollaborateurid(collaborateurid);
            historique.setDateentretien(new Date());
            historique.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            historique.setCauseid(caudereportid);
            historiqueRepository.saveAndFlush(historique);

            Salaries salarie = salariesRepository.findOneSalarie(collaborateurid);
            salarie.setStepentretienprofessionnel(4L);
            salarie.setCausereportid(caudereportid);
            return salariesRepository.saveAndFlush(salarie);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Salaries();
        }
    }

    @GetMapping("/EntretienProfessionnel/Reopen/{collaborateurid}")
    public Salaries updateEPReopen(@PathVariable Long collaborateurid) {
        try {
            Historique historique = historiqueRepository.findHistorique(collaborateurid, Calendar.getInstance().get(Calendar.YEAR));
            historiqueRepository.deleteById(historique.getId());

            Salaries salarie = salariesRepository.findOneSalarie(collaborateurid);
            salarie.setStepentretienprofessionnel(0L);
            return salariesRepository.saveAndFlush(salarie);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Salaries();
        }
    }

    @GetMapping("/EntretienProfessionnel/Validation/{collaborateurid}/{heure}/{minute}/{dateentretien}")
    public Salaries updateEPValid(@PathVariable Long collaborateurid,
                                  @PathVariable String heure,
                                  @PathVariable String minute,
                                  @PathVariable String dateentretien) {
        try {
            Historique historique = new Historique();
            historique.setCollaborateurid(collaborateurid);
            if ("null".equals(dateentretien))
                historique.setDateentretien(new Date());
            else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                historique.setDateentretien(simpleDateFormat.parse(dateentretien));
            }
            historique.setAnnee(Calendar.getInstance().get(Calendar.YEAR));
            historique.setCauseid(1L);
            historiqueRepository.saveAndFlush(historique);

            Salaries salarie = salariesRepository.findOneSalarie(collaborateurid);
            salarie.setStepentretienprofessionnel(3L);
            salarie.setMinuteep(minute);
            salarie.setHeureep(heure);
            if ("null".equals(dateentretien))
                salarie.setDateentretienprofessionnel(new Date());
            else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                salarie.setDateentretienprofessionnel(simpleDateFormat.parse(dateentretien));
            }
            return salariesRepository.saveAndFlush(salarie);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Salaries();
        }
    }

    @GetMapping("/EntretienProfessionnel/Plan/{collaborateurid}/{dateEntretien}/{heureentretien}")
    public boolean planEp(@PathVariable Long collaborateurid,
                          @PathVariable String dateEntretien,
                          @PathVariable String heureentretien) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Calendar c = Calendar.getInstance();
            c.setTime(simpleDateFormat.parse(dateEntretien));
            c.add(Calendar.HOUR, 24);
            salariesRepository.updateEPDate(collaborateurid, c.getTime(), heureentretien.split(":")[0], heureentretien.split(":")[1]);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }
}
