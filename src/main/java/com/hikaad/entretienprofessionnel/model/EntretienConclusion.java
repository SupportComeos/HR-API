package com.hikaad.entretienprofessionnel.model;

import javax.persistence.*;

@Entity
@Table(name = "EntretienProfessionnel_Evaluation_Conclusion")
public class EntretienConclusion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Salarieid")
    private long collaborateurid;

    @Column(name = "Annee")
    private long annee;

    @Column(name = "Collab1")
    private String collaborateurevolution;

    @Column(name = "Collab2")
    private String collaborateurderoulement;

    @Column(name = "Responsable1")
    private String responsableevolution;

    @Column(name = "Responsable2")
    private String responsablederoulement;

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

    public String getCollaborateurevolution() {
        return collaborateurevolution;
    }

    public void setCollaborateurevolution(String collaborateurevolution) {
        this.collaborateurevolution = collaborateurevolution;
    }

    public String getCollaborateurderoulement() {
        return collaborateurderoulement;
    }

    public void setCollaborateurderoulement(String collaborateurderoulement) {
        this.collaborateurderoulement = collaborateurderoulement;
    }

    public String getResponsableevolution() {
        return responsableevolution;
    }

    public void setResponsableevolution(String responsableevolution) {
        this.responsableevolution = responsableevolution;
    }

    public String getResponsablederoulement() {
        return responsablederoulement;
    }

    public void setResponsablederoulement(String responsablederoulement) {
        this.responsablederoulement = responsablederoulement;
    }
}
