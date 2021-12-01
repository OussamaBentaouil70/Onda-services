package com.onda.register.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

//import javax.persistence.OneToMany;

@Entity
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String matricule;
    private String fonction;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateDeRecrutement;

    @JsonProperty(access = Access.WRITE_ONLY)
    @OneToMany(mappedBy = "register")
    private List<Conge> conges;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Conge> getConges() {
        return conges;
    }

    public void setConges(List<Conge> conges) {
        this.conges = conges;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateDeRecrutement() {
        return dateDeRecrutement;
    }

    public void setDateDeRecrutement(Date dateDeRecrutement) {
        this.dateDeRecrutement = dateDeRecrutement;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}
