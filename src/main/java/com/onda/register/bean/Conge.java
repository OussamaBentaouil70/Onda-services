package com.onda.register.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Conge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String congeRegulier;
    private String congeMaladie;
    private String congeExp;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateDeDepart;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateDeRentree;
    private int numeroDivision;
    private String reliquat;
    private String cumul;

    @ManyToOne
    private Register register;

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getCongeRegulier() {
        return congeRegulier;
    }

    public void setCongeRegulier(final String congeRegulier) {
        this.congeRegulier = congeRegulier;
    }

    public String getCongeMaladie() {
        return congeMaladie;
    }

    public void setCongeMaladie(final String congeMaladie) {
        this.congeMaladie = congeMaladie;
    }

    public String getCongeExp() {
        return congeExp;
    }

    public void setCongeExp(final String congeExp) {
        this.congeExp = congeExp;
    }

    public Date getDateDeDepart() {
        return dateDeDepart;
    }

    public void setDateDeDepart(final Date dateDeDepart) {
        this.dateDeDepart = dateDeDepart;
    }

    public Date getDateDeRentree() {
        return dateDeRentree;
    }

    public void setDateDeRentree(final Date dateDeRentree) {
        this.dateDeRentree = dateDeRentree;
    }

    public int getNumeroDivision() {
        return numeroDivision;
    }

    public void setNumeroDivision(final int numeroDivision) {
        this.numeroDivision = numeroDivision;
    }

    public String getReliquat() {
        return reliquat;
    }

    public void setReliquat(final String reliquat) {
        this.reliquat = reliquat;
    }

    public String getCumul() {
        return cumul;
    }

    public void setCumul(final String cumul) {
        this.cumul = cumul;
    }

}
