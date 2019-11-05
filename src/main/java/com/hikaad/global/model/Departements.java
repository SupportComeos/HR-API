package com.hikaad.global.model;

import javax.persistence.*;

@Entity
@Table(name = "Departements")
public class Departements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name="EnterpriseID", nullable = false, updatable = false, insertable = false)
    private Entreprises enterprise;

    @Column(name = "EnterpriseID")
    private long enterpriseid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
