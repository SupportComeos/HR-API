package com.hikaad.global.dto;

import com.hikaad.global.model.Salaries;

public class UsersDTO {

    private long id;
    private String username;
    private String password;
    private long vip;
    private String authorization;
    private long isAdmin;
    private long actif;
    private long salarieid;
    private Salaries salaries;

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

    public long getSalarieid() {
        return salarieid;
    }

    public void setSalarieid(long salarieid) {
        this.salarieid = salarieid;
    }

    public Salaries getSalaries() {
        return salaries;
    }

    public void setSalaries(Salaries salaries) {
        this.salaries = salaries;
    }
}
