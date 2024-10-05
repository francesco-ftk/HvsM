package com.example.controller.dto;

public class IscrizioneDto {
    private String bearerToken;
    private String username;
    private int id;
    private int idAttivita;

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAttivita() {
        return idAttivita;
    }

    public void setIdAttivita(int idAttivita) {
        this.idAttivita = idAttivita;
    }
}
