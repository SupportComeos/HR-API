package com.hikaad.entretiensuivi.dto;

import com.hikaad.global.model.Salaries;
import com.hikaad.global.model.TypeAction;

import java.util.Date;

public class ActionDTO {

    private long id;
    private long collaborateurid;
    private TypeAction typeaction;
    private Long typeactionid;
    private Date creationdate;
    private long creationbyid;
    private Salaries creationby;
    private String description;
    private long avancementid;
    private Date dateavancement;
    private String acteur;
    private long piloteid;
    private Salaries pilote;
    private long jourrestant;
    private String raisonnonretenue;
    private Salaries collaborateur;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCollaborateurid() {
        return collaborateurid;
    }

    public void setCollaborateurid(long collaborateurid) {
        this.collaborateurid = collaborateurid;
    }

    public TypeAction getTypeaction() {
        return typeaction;
    }

    public void setTypeaction(TypeAction typeaction) {
        this.typeaction = typeaction;
    }

    public Long getTypeactionid() {
        return typeactionid;
    }

    public void setTypeactionid(Long typeactionid) {
        this.typeactionid = typeactionid;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public long getCreationbyid() {
        return creationbyid;
    }

    public void setCreationbyid(long creationbyid) {
        this.creationbyid = creationbyid;
    }

    public Salaries getCreationby() {
        return creationby;
    }

    public void setCreationby(Salaries creationby) {
        this.creationby = creationby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAvancementid() {
        return avancementid;
    }

    public void setAvancementid(long avancementid) {
        this.avancementid = avancementid;
    }

    public Date getDateavancement() {
        return dateavancement;
    }

    public void setDateavancement(Date dateavancement) {
        this.dateavancement = dateavancement;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    public long getPiloteid() {
        return piloteid;
    }

    public void setPiloteid(long piloteid) {
        this.piloteid = piloteid;
    }

    public Salaries getPilote() {
        return pilote;
    }

    public void setPilote(Salaries pilote) {
        this.pilote = pilote;
    }

    public long getJourrestant() {
        return jourrestant;
    }

    public void setJourrestant(long jourrestant) {
        this.jourrestant = jourrestant;
    }

    public String getRaisonnonretenue() {
        return raisonnonretenue;
    }

    public void setRaisonnonretenue(String raisonnonretenue) {
        this.raisonnonretenue = raisonnonretenue;
    }

    public Salaries getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Salaries collaborateur) {
        this.collaborateur = collaborateur;
    }
}
