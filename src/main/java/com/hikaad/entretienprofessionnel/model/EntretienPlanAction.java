package com.hikaad.entretienprofessionnel.model;

import com.hikaad.global.model.Salaries;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EntretienProfessionnel_Evaluation_PDI")
public class EntretienPlanAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Salarieid")
    private long collaborateurid;

    @ManyToOne
    @JoinColumn(name="Salarieid", nullable = false, updatable = false, insertable = false)
    private Salaries collaborateur;

    @Column(name = "Annee")
    private long annee;

    @Column(name = "MoyenID")
    private long moyenid;

    @ManyToOne
    @JoinColumn(name="MoyenID", nullable = false, updatable = false, insertable = false)
    private Moyens moyen;

    @Column(name = "Delai")
    private Date delai;

    @Column(name = "Resultat")
    private String resultat;

    @Column(name = "Action")
    private String precision;

    @Column(name = "Done")
    private long done;

    @Column(name = "Avancement")
    private long avancement;

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

    public Salaries getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Salaries collaborateur) {
        this.collaborateur = collaborateur;
    }

    public long getDone() {
        return done;
    }

    public void setDone(long done) {
        this.done = done;
    }

    public long getAvancement() {
        return avancement;
    }

    public void setAvancement(long avancement) {
        this.avancement = avancement;
    }
}
