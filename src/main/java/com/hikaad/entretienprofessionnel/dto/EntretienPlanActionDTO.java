package com.hikaad.entretienprofessionnel.dto;

import com.hikaad.entretienprofessionnel.model.Moyens;

import java.util.Date;

public class EntretienPlanActionDTO {

    private long id;
    private long collaborateurid;
    private long annee;
    private long moyenid;
    private Moyens moyen;
    private Date delai;
    private String resultat;
    private String precision;

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

    public long getAnnee() {
        return annee;
    }

    public void setAnnee(long annee) {
        this.annee = annee;
    }

    public long getMoyenid() {
        return moyenid;
    }

    public void setMoyenid(long moyenid) {
        this.moyenid = moyenid;
    }

    public Moyens getMoyen() {
        return moyen;
    }

    public void setMoyen(Moyens moyen) {
        this.moyen = moyen;
    }

    public Date getDelai() {
        return delai;
    }

    public void setDelai(Date delai) {
        this.delai = delai;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }
}
