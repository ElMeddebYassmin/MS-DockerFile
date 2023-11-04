package com.example.jobmser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Job implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String service;
    private Boolean etat;

    public Job() {
    }

    public Job(String service, Boolean etat) {
        service = service;
        etat = etat;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        service = service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        etat = etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
