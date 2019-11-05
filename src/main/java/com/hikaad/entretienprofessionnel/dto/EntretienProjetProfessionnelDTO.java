package com.hikaad.entretienprofessionnel.dto;

public class EntretienProjetProfessionnelDTO {

    private long id;
    private long collaborateurid;
    private long annee;
    private String commentaire;
    private long projetprofessionnelid;

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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public long getProjetprofessionnelid() {
        return projetprofessionnelid;
    }

    public void setProjetprofessionnelid(long projetprofessionnelid) {
        this.projetprofessionnelid = projetprofessionnelid;
    }
}
