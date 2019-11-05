package com.hikaad.referentielgpec.model;

import com.hikaad.global.model.Entreprises;

import javax.persistence.*;

@Entity
@Table(name = "ReferentielGPEC_Emplois")
public class Emploi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="EnterpriseID", nullable = false, updatable = false, insertable = false)
    private Entreprises enterprise;

    @Column(name = "EnterpriseID")
    private long enterpriseid;

    @Column(name = "Name")
    private String name;

    @Column(name = "FamilleEmploiID")
    private long familleemploiid;

    @Column(name = "EvolutionPrevisionnelleID")
    private long evolutionqualitativeid;

    @Column(name = "NiveauClassificationID")
    private long niveauclassificationid;

    @Column(name = "EmploiCle")
    private long emploicle;

    @Column(name = "Effectif")
    private long effectif;

    @Column(name = "EffectifN1")
    private long effectifn1;

    @Column(name = "CodeEmploi")
    private String codeemploi;

    @Column(name = "Archiver")
    private long archiver;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Entreprises getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Entreprises enterprise) {
        this.enterprise = enterprise;
    }

    public long getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(long enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFamilleemploiid() {
        return familleemploiid;
    }

    public void setFamilleemploiid(long familleemploiid) {
        this.familleemploiid = familleemploiid;
    }

    public long getEvolutionqualitativeid() {
        return evolutionqualitativeid;
    }

    public void setEvolutionqualitativeid(long evolutionqualitativeid) {
        this.evolutionqualitativeid = evolutionqualitativeid;
    }

    public long getNiveauclassificationid() {
        return niveauclassificationid;
    }

    public void setNiveauclassificationid(long niveauclassificationid) {
        this.niveauclassificationid = niveauclassificationid;
    }

    public long getEmploicle() {
        return emploicle;
    }

    public void setEmploicle(long emploicle) {
        this.emploicle = emploicle;
    }

    public long getEffectif() {
        return effectif;
    }

    public void setEffectif(long effectif) {
        this.effectif = effectif;
    }

    public long getEffectifn1() {
        return effectifn1;
    }

    public void setEffectifn1(long effectifn1) {
        this.effectifn1 = effectifn1;
    }

    public String getCodeemploi() {
        return codeemploi;
    }

    public void setCodeemploi(String codeemploi) {
        this.codeemploi = codeemploi;
    }

    public long getArchiver() {
        return archiver;
    }

    public void setArchiver(long archiver) {
        this.archiver = archiver;
    }
}
