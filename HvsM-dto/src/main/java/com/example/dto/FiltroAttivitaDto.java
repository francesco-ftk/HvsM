package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class FiltroAttivitaDto {
    private String nome;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inizio;
    private boolean disponibilita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getInizio() {
        return inizio;
    }

    public void setInizio(LocalDateTime inizio) {
        this.inizio = inizio;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }
}
