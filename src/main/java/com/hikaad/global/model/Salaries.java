package com.hikaad.global.model;

import com.hikaad.entretienevaluation.model.CauseReport;
import com.hikaad.referentielgpec.model.Emploi;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Salaries")
public class Salaries {

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

    @Column(name = "Coefficient")
    private String coefficient;

    @Column(name = "Statut")
    private String statut;

    @Column(name = "ResponsableBis")
    private String responsablebis;

    @ManyToOne
    @JoinColumn(name="ResponsableID", nullable = false, updatable = false, insertable = false)
    private Responsable responsable;

    @Column(name = "ResponsableID")
    private long responsableid;

    @Column(name = "Adresse")
    private String adresse;

    @Column(name = "ComplementAdresse")
    private String complementadresse;

    @Column(name = "CodePostal")
    private String codepostal;

    @Column(name = "City")
    private String city;

    @Column(name = "Country")
    private String country;

    @Column(name = "Email1")
    private String email1;

    @Column(name = "Fixe1")
    private String fixe1;

    @Column(name = "Portable1")
    private String portable1;

    @Column(name = "Email2")
    private String email2;

    @Column(name = "Fixe2")
    private String fixe2;

    @Column(name = "Portable2")
    private String portable2;

    @Column(name = "StepEntretienProfessionnel")
    private long stepentretienprofessionnel;

    @Column(name = "EntretienProfessionnel")
    private Date dateentretienprofessionnel;

    @Column(name = "StepEntretienEvaluation")
    private long stepentretienevaluation;

    @Column(name = "EntretienEvaluation")
    private Date dateentretienevaluation;

    @Column(name = "stepRV")
    private long steprevuedupersonnel;

    @Column(name = "dateRV")
    private Date daterevuedupersonnel;

    @Column(name = "DateEmbauche")
    private Date dateembauche;

    @Column(name = "DateStartEnterprise")
    private Date datestartenterprise;

    @Column(name = "Nationality")
    private String nationality;

    @Column(name = "Birthday")
    private Date birthday;

    @Column(name = "NameChild")
    private String namechild;

    @Column(name = "NumberSS")
    private String numberss;

    @Column(name = "KeySS")
    private String keyss;

    @Column(name = "ReasonOut")
    private String reasonout;

    @Column(name = "TpsMensuel")
    private String tpsmensuel;

    @Column(name = "TpsHebdo")
    private String tpshebdo;

    @Column(name = "DureeTravail")
    private String dureetravail;

    @ManyToOne
    @JoinColumn(name="CauseReport", nullable = false, updatable = false, insertable = false)
    private CauseReport causereport;

    @Column(name = "CauseReport")
    private long causereportid;

    @Column(name = "HeureEP")
    private String heureep;

    @Column(name = "MinuteEP")
    private String minuteep;

    @Column(name = "HeureEV")
    private String heureev;

    @Column(name = "MinuteEV")
    private String minuteev;

    @Column(name = "BienEtreAnnee")
    private long bienetreannee;

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

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getFixe1() {
        return fixe1;
    }

    public void setFixe1(String fixe1) {
        this.fixe1 = fixe1;
    }

    public String getPortable1() {
        return portable1;
    }

    public void setPortable1(String portable1) {
        this.portable1 = portable1;
    }

    public long getStepentretienprofessionnel() {
        return stepentretienprofessionnel;
    }

    public void setStepentretienprofessionnel(long stepentretienprofessionnel) {
        this.stepentretienprofessionnel = stepentretienprofessionnel;
    }

    public Date getDateentretienprofessionnel() {
        return dateentretienprofessionnel;
    }

    public void setDateentretienprofessionnel(Date dateentretienprofessionnel) {
        this.dateentretienprofessionnel = dateentretienprofessionnel;
    }

    public long getStepentretienevaluation() {
        return stepentretienevaluation;
    }

    public void setStepentretienevaluation(long stepentretienevaluation) {
        this.stepentretienevaluation = stepentretienevaluation;
    }

    public Date getDateentretienevaluation() {
        return dateentretienevaluation;
    }

    public void setDateentretienevaluation(Date dateentretienevaluation) {
        this.dateentretienevaluation = dateentretienevaluation;
    }

    public long getSteprevuedupersonnel() {
        return steprevuedupersonnel;
    }

    public void setSteprevuedupersonnel(long steprevuedupersonnel) {
        this.steprevuedupersonnel = steprevuedupersonnel;
    }

    public Date getDaterevuedupersonnel() {
        return daterevuedupersonnel;
    }

    public void setDaterevuedupersonnel(Date daterevuedupersonnel) {
        this.daterevuedupersonnel = daterevuedupersonnel;
    }

    public Date getDateembauche() {
        return dateembauche;
    }

    public void setDateembauche(Date dateembauche) {
        this.dateembauche = dateembauche;
    }

    public Date getDatestartenterprise() {
        return datestartenterprise;
    }

    public void setDatestartenterprise(Date datestartenterprise) {
        this.datestartenterprise = datestartenterprise;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNamechild() {
        return namechild;
    }

    public void setNamechild(String namechild) {
        this.namechild = namechild;
    }

    public String getNumberss() {
        return numberss;
    }

    public void setNumberss(String numberss) {
        this.numberss = numberss;
    }

    public String getKeyss() {
        return keyss;
    }

    public void setKeyss(String keyss) {
        this.keyss = keyss;
    }

    public String getReasonout() {
        return reasonout;
    }

    public void setReasonout(String reasonout) {
        this.reasonout = reasonout;
    }

    public String getComplementadresse() {
        return complementadresse;
    }

    public void setComplementadresse(String complementadresse) {
        this.complementadresse = complementadresse;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getFixe2() {
        return fixe2;
    }

    public void setFixe2(String fixe2) {
        this.fixe2 = fixe2;
    }

    public String getPortable2() {
        return portable2;
    }

    public void setPortable2(String portable2) {
        this.portable2 = portable2;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getTpsmensuel() {
        return tpsmensuel;
    }

    public void setTpsmensuel(String tpsmensuel) {
        this.tpsmensuel = tpsmensuel;
    }

    public String getTpshebdo() {
        return tpshebdo;
    }

    public void setTpshebdo(String tpshebdo) {
        this.tpshebdo = tpshebdo;
    }

    public String getDureetravail() {
        return dureetravail;
    }

    public void setDureetravail(String dureetravail) {
        this.dureetravail = dureetravail;
    }

    public CauseReport getCausereport() {
        return causereport;
    }

    public void setCausereport(CauseReport causereport) {
        this.causereport = causereport;
    }

    public long getCausereportid() {
        return causereportid;
    }

    public void setCausereportid(long causereportid) {
        this.causereportid = causereportid;
    }

    public String getHeureep() {
        return heureep;
    }

    public void setHeureep(String heureep) {
        this.heureep = heureep;
    }

    public String getMinuteep() {
        return minuteep;
    }

    public void setMinuteep(String minuteep) {
        this.minuteep = minuteep;
    }

    public long getBienetreannee() {
        return bienetreannee;
    }

    public void setBienetreannee(long bienetreannee) {
        this.bienetreannee = bienetreannee;
    }

    public String getHeureev() {
        return heureev;
    }

    public void setHeureev(String heureev) {
        this.heureev = heureev;
    }

    public String getMinuteev() {
        return minuteev;
    }

    public void setMinuteev(String minuteev) {
        this.minuteev = minuteev;
    }
}
