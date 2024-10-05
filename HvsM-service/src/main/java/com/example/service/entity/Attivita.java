package com.example.service.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "HVSM_ATTIVITA")
public class Attivita {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "LUOGO", nullable = false)
    private String luogo;

    @Column(name = "INIZIO", nullable = false)
    private LocalDateTime inizio;

    @Column(name = "FINE", nullable = false)
    private LocalDateTime fine;

    @Column(name = "NUM_POSTI_DISP", nullable = false)
    private Integer numeroPostiDisponibili;

    @Column(name = "NUM_POST_OCC", nullable = false)
    private Integer numeroPostiOccupati;

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

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public LocalDateTime getInizio() {
        return inizio;
    }

    public void setInizio(LocalDateTime inizio) {
        this.inizio = inizio;
    }

    public LocalDateTime getFine() {
        return fine;
    }

    public void setFine(LocalDateTime fine) {
        this.fine = fine;
    }

    public Integer getNumeroPostiDisponibili() {
        return numeroPostiDisponibili;
    }

    public void setNumeroPostiDisponibili(Integer numeroPostiDisponibili) {
        this.numeroPostiDisponibili = numeroPostiDisponibili;
    }

    public Integer getNumeroPostiOccupati() {
        return numeroPostiOccupati;
    }

    public void setNumeroPostiOccupati(Integer numeroPostiOccupati) {
        this.numeroPostiOccupati = numeroPostiOccupati;
    }
}
