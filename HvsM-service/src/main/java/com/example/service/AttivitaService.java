package com.example.service;

import com.example.entity.Attivita;
import com.example.jpa.AttivitaJpa;
import com.example.model.FiltroAttivita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AttivitaService {

    @Autowired
    private AttivitaJpa attivitaJpa;

    public void addAttivita(Attivita attivita) {
        attivitaJpa.save(attivita);
    }
    public void updateAttivita(Attivita attivita) {
        attivitaJpa.save(attivita);
    }

    public void deleteAttivita(Integer id) {
        attivitaJpa.deleteById(id);
    }

    public Optional<Attivita> getAttivitaById(Integer id) {
        return attivitaJpa.findById(id);
    }

    public List<Attivita> getAttivita() {
        return attivitaJpa.findAll();
    }

    public List<Attivita> getAttivitaByFilter(FiltroAttivita filtroAttivita) {
        List<Attivita> attivita = attivitaJpa.findByNomeAndGiorno(filtroAttivita.getNome(), filtroAttivita.getInizio());
        if(filtroAttivita.isDisponibilita()){
            return attivita.stream().filter(a -> (a.getNumeroPostiDisponibili() > a.getNumeroPostiOccupati() && a.getFine().isAfter(LocalDateTime.now()))).collect(Collectors.toList());
        }
        return attivita;
    }
}
