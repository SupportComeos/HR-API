package com.hikaad.global.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Login")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "SalarieID")
    private long collaborateurid;

    @Column(name = "VIP")
    private long vip;

    @Column(name = "Authorization")
    private String authorization;

    @Column(name = "isAdmin")
    private long isAdmin;

    @Column(name = "Actif")
    private long actif;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCollaborateurid() {
        return collaborateurid;
    }

    public void setCollaborateurid(long collaborateurid) {
        this.collaborateurid = collaborateurid;
    }

    public long getVip() {
        return vip;
    }

    public void setVip(long vip) {
        this.vip = vip;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public long getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(long isAdmin) {
        this.isAdmin = isAdmin;
    }

    public long getActif() {
        return actif;
    }

    public void setActif(long actif) {
        this.actif = actif;
    }
}
