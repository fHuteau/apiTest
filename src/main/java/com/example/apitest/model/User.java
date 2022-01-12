package com.example.apitest.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nomUser")
    private String nom;


    public User(){

    }
    public User(String nom){
        this.nom = nom;
    }

    public long getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String toString(){
        return "User [id=" + id + ", nom=" + nom + "]";
    }



}
