package com.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HVSM_UTENTE")
public class Utente {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "COGNOME", nullable = false)
    private String cognome;

    @ElementCollection
    @Column(name = "ISCRIZIONI")
    private List<Integer> iscrizioni = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Integer> getIscrizioni() {
        return iscrizioni;
    }

    public void setIscrizioni(List<Integer> iscrizioni) {
        this.iscrizioni = iscrizioni;
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
}
