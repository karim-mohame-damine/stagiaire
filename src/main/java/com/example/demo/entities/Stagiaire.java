package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Stagiaire implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private long tel;
    private long telurgence;
    private String photo;
    private String ecole;
    private String filiere;
    private String niveau;
    private String typedestage;
    private LocalDate datedebut;
    private LocalDate datefin;
    private String adresse;
    private String mobilite;
    private boolean etatdemande;
    private String motifdesistement;
    private String justifabsence;


    public Stagiaire(String nom, String prenom, LocalDate dateNaissance, String email, long tel, long telurgence, String photo, String ecole, String filiere, String niveau, String typedestage, LocalDate datedebut, LocalDate datefin, String adresse, String mobilite, boolean etatdemande, String motifdesistement, String justifabsence) {

        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.tel = tel;
        this.telurgence = telurgence;
        this.photo = photo;
        this.ecole = ecole;
        this.filiere = filiere;
        this.niveau = niveau;
        this.typedestage = typedestage;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.adresse = adresse;
        this.mobilite = mobilite;
        this.etatdemande = etatdemande;
        this.motifdesistement = motifdesistement;
        this.justifabsence = justifabsence;
    }

    public Stagiaire() {
        super();
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getTelurgence() {
        return telurgence;
    }

    public void setTelurgence(long telurgence) {
        this.telurgence = telurgence;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getTypedestage() {
        return typedestage;
    }

    public void setTypedestage(String typedestage) {
        this.typedestage = typedestage;
    }

    public LocalDate getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public LocalDate getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDate datefin) {
        this.datefin = datefin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMobilite() {
        return mobilite;
    }

    public void setMobilite(String mobilite) {
        this.mobilite = mobilite;
    }

    public boolean isEtatdemande() {
        return etatdemande;
    }

    public void setEtatdemande(boolean etatdemande) {
        this.etatdemande = etatdemande;
    }

    public String getMotifdesistement() {
        return motifdesistement;
    }

    public void setMotifdesistement(String motifdesistement) {
        this.motifdesistement = motifdesistement;
    }

    public String getJustifabsence() {
        return justifabsence;
    }

    public void setJustifabsence(String justifabsence) {
        this.justifabsence = justifabsence;
    }
}
