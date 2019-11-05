package com.hikaad.entretiensuivi.dto;

import com.hikaad.entretiensuivi.model.TypeEntretien;
import com.hikaad.global.model.Salaries;

import java.util.Date;

public class EntretienDTO {

    private long id;
    private TypeEntretien typeentretien;
    private Long typeentretienid;
    private String realiserpar;
    private Date dateentretien;
    private String heuredebut;
    private String heurefin;
    private String detail;
    private String conclusion;
    private Salaries salarie;
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
