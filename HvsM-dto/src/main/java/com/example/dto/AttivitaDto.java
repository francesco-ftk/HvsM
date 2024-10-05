package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class AttivitaDto {

    private Integer id;
    private String nome;
    private String luogo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inizio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fine;
    private Integer numeroPostiDisponibili;
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
}
