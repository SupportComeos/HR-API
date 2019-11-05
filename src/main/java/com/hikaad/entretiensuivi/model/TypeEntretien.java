package com.hikaad.entretiensuivi.model;

import javax.persistence.*;

@Entity
@Table(name = "EntretienSuivi_Types")
public class TypeEntretien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    private String name;

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
}
