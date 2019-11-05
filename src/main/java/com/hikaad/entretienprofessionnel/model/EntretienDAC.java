package com.hikaad.entretienprofessionnel.model;

import javax.persistence.*;

@Entity
@Table(name = "EntretienProfessionnel_Evaluation_DAC")
public class EntretienDAC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Salarieid")
    private long collaborateurid;

    @Column(name = "Annee")
    private long annee;

    @Column(name = "CEP")
    private long cep;

    @Column(name = "BilanProfessionnel")
    private long cpa;

    @Column(name = "BilanCompetence")
    private long bilan;

    @Column(name = "CPF")
    private long cpf;

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

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public long getCpa() {
        return cpa;
    }

    public void setCpa(long cpa) {
        this.cpa = cpa;
    }

    public long getBilan() {
        return bilan;
    }

    public void setBilan(long bilan) {
        this.bilan = bilan;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
