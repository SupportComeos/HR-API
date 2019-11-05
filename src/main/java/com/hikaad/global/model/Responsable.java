package com.hikaad.global.model;

import com.hikaad.referentielgpec.model.Emploi;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Salaries")
public class Responsable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;

    @Column(name = "DateOut")
    private Date dateout;

    @Column(name = "Neutraliser")
    private long neutraliser;

    @Column(name = "Matricule")
    private String matricule;

    @Column(name = "Age")
    private long age;

    @Column(name = "Sexe")
    private long sexe;

    @Column(name = "Anciennete")
    private long anciennete;

    @Column(name = "CodeLocalisation")
    private String codelocalisation;

    @Column(name = "NameLocalisation")
    private String namelocalisation;

    @Column(name = "Qualification")
    private String qualification;

    @ManyToOne
    @JoinColumn(name="EmploiID", nullable = false, updatable = false, insertable = false)
    private Emploi emploi;

    @Column(name = "EmploiID")
    private long emploiid;

    @ManyToOne
    @JoinColumn(name="ServiceID", nullable = false, updatable = false, insertable = false)
    private Services service;

    @Column(name = "ServiceID")
    private long serviceid;

    @ManyToOne
    @JoinColumn(name="EnterpriseID", nullable = false, updatable = false, insertable = false)
    private Entreprises enterprise;

    @Column(name = "EnterpriseID")
    private long enterpriseid;

    @Column(name = "Echelon")
    private String echelon;

    @Column(name = "Departement")
    private String departement;

    @Column(name = "Contrat")
    private String contrat;

    @Column(name = "Statut")
    private String statut;

    @Column(name = "ResponsableBis")
    private String responsablebis;

    @Column(name = "ResponsableID")
    private long responsableid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public long getNeutraliser() {
        return neutraliser;
    }

    public void setNeutraliser(long neutraliser) {
        this.neutraliser = neutraliser;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(long anciennete) {
        this.anciennete = anciennete;
    }

    public String getCodelocalisation() {
        return codelocalisation;
    }

    public void setCodelocalisation(String codelocalisation) {
        this.codelocalisation = codelocalisation;
    }

    public String getNamelocalisation() {
        return namelocalisation;
    }

    public void setNamelocalisation(String namelocalisation) {
        this.namelocalisation = namelocalisation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }

    public long getEmploiid() {
        return emploiid;
    }

    public void setEmploiid(long emploiid) {
        this.emploiid = emploiid;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public long getServiceid() {
        return serviceid;
    }

    public void setServiceid(long serviceid) {
        this.serviceid = serviceid;
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

    public long getSexe() {
        return sexe;
    }

    public void setSexe(long sexe) {
        this.sexe = sexe;
    }

    public String getEchelon() {
        return echelon;
    }

    public void setEchelon(String echelon) {
        this.echelon = echelon;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public long getResponsableid() {
        return responsableid;
    }

    public void setResponsableid(long responsableid) {
        this.responsableid = responsableid;
    }

    public String getResponsablebis() {
        return responsablebis;
    }

    public void setResponsablebis(String responsablebis) {
        this.responsablebis = responsablebis;
    }

}
