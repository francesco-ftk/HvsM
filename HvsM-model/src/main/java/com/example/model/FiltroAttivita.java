package com.example.model;

import java.time.LocalDateTime;

public class FiltroAttivita {
    private String nome;
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
