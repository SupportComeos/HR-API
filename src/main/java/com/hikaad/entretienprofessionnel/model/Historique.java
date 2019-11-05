package com.hikaad.entretienprofessionnel.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HistoriqueEntretienProfessionnel")
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "SalarieID")
    private long collaborateurid;

    @Column(name = "dateEntretien")
    private Date dateentretien;

    @Column(name = "Annee")
    private long annee;

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

    public Date getDateentretien() {
        return dateentretien;
    }

    public void setDateentretien(Date dateentretien) {
        this.dateentretien = dateentretien;
    }

    public long getAnnee() {
        return annee;
    }

    public void setAnnee(long annee) {
        this.annee = annee;
    }
}
