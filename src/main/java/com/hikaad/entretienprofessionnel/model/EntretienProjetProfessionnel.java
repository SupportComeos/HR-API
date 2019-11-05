package com.hikaad.entretienprofessionnel.model;

import javax.persistence.*;

@Entity
@Table(name = "EntretienProfessionnel_Evaluation_ProjetProfessionnel")
public class EntretienProjetProfessionnel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Salarieid")
    private long collaborateurid;

    @Column(name = "Annee")
    private long annee;

    @Column(name = "Commentaire")
    private String commentaire;

    @Column(name = "ProjetProfessionnelID")
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
