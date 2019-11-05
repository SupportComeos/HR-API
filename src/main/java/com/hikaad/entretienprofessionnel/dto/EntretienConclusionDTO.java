package com.hikaad.entretienprofessionnel.dto;

public class EntretienConclusionDTO {

    private long id;
    private long collaborateurid;
    private long annee;
    private String collaborateurevolution;
    private String collaborateurderoulement;
    private String responsableevolution;
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
