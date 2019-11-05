package com.hikaad.entretiensuivi.model;

import com.hikaad.global.model.Salaries;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EntretienSuivi_Entretiens")
public class Entretien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="TypeID", nullable = false, updatable = false, insertable = false)
    private TypeEntretien typeentretien;

    @Column(name = "TypeID")
    private Long typeentretienid;

    @Column(name = "RealiserPar")
    private String realiserpar;

    @Column(name = "DateEntretien")
    private Date dateentretien;

    @Column(name = "HeureDebut")
    private String heuredebut;

    @Column(name = "HeureFin")
    private String heurefin;

    @Column(name = "Detail")
    private String detail;

    @Column(name = "Conclusion")
    private String conclusion;

    @ManyToOne
    @JoinColumn(name="SalarieID", nullable = false, updatable = false, insertable = false)
    private Salaries salarie;

    @Column(name = "SalarieID")
    private Long salarieid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeEntretien getTypeentretien() {
        return typeentretien;
    }

    public void setTypeentretien(TypeEntretien typeentretien) {
        this.typeentretien = typeentretien;
    }

    public Long getTypeentretienid() {
        return typeentretienid;
    }

    public void setTypeentretienid(Long typeentretienid) {
        this.typeentretienid = typeentretienid;
    }

    public String getRealiserpar() {
        return realiserpar;
    }

    public void setRealiserpar(String realiserpar) {
        this.realiserpar = realiserpar;
    }

    public Date getDateentretien() {
        return dateentretien;
    }

    public void setDateentretien(Date dateentretien) {
        this.dateentretien = dateentretien;
    }

    public String getHeuredebut() {
        return heuredebut;
    }

    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }

    public String getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Salaries getSalarie() {
        return salarie;
    }

    public void setSalarie(Salaries salarie) {
        this.salarie = salarie;
    }

    public Long getSalarieid() {
        return salarieid;
    }

    public void setSalarieid(Long salarieid) {
        this.salarieid = salarieid;
    }
}
