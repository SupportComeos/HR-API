package com.hikaad.entretienprofessionnel.model;

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
