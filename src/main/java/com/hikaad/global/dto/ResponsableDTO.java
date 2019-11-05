package com.hikaad.global.dto;

import com.hikaad.global.model.Entreprises;
import com.hikaad.global.model.Services;
import com.hikaad.referentielgpec.model.Emploi;

import java.util.Date;

public class ResponsableDTO {

    private long id;
    private String firstname;
    private String lastname;
    private Date dateout;
    private long neutraliser;
    private String matricule;
    private long age;
    private long sexe;
    private long anciennete;
    private String codelocalisation;
    private String namelocalisation;
    private String qualification;
    private Emploi emploi;
    private long emploiid;
    private Services service;
    private long serviceid;
    private Entreprises enterprise;
    private long enterpriseid;
    private String echelon;
    private String departement;
    private String contrat;
    private String statut;
    private String responsablebis;
    private long responsableid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public long getNeutraliser() {
        return neutraliser;
    }

    public void setNeutraliser(long neutraliser) {
        this.neutraliser = neutraliser;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(long anciennete) {
        this.anciennete = anciennete;
    }

    public String getCodelocalisation() {
        return codelocalisation;
    }

    public void setCodelocalisation(String codelocalisation) {
        this.codelocalisation = codelocalisation;
    }

    public String getNamelocalisation() {
        return namelocalisation;
    }

    public void setNamelocalisation(String namelocalisation) {
        this.namelocalisation = namelocalisation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }

    public long getEmploiid() {
        return emploiid;
    }

    public void setEmploiid(long emploiid) {
        this.emploiid = emploiid;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public long getServiceid() {
        return serviceid;
    }

    public void setServiceid(long serviceid) {
        this.serviceid = serviceid;
    }

    public Entreprises getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Entreprises enterprise) {
        this.enterprise = enterprise;
    }

    public long getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(long enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public long getSexe() {
        return sexe;
    }

    public void setSexe(long sexe) {
        this.sexe = sexe;
    }

    public String getEchelon() {
        return echelon;
    }

    public void setEchelon(String echelon) {
        this.echelon = echelon;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public long getResponsableid() {
        return responsableid;
    }

    public void setResponsableid(long responsableid) {
        this.responsableid = responsableid;
    }

    public String getResponsablebis() {
        return responsablebis;
    }

    public void setResponsablebis(String responsablebis) {
        this.responsablebis = responsablebis;
    }

}
