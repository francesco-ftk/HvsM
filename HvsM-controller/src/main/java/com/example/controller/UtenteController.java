package com.example.controller;

import com.example.dto.IscrizioneDto;
import com.example.dto.IscrizioniDto;
import com.example.dto.LoginDto;
import com.example.dto.UtenteDto;
import com.example.entity.Attivita;
import com.example.entity.Utente;
import com.example.entitymapper.UtenteMapper;
import com.example.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/addUtente")
    public void addUtente(@RequestBody UtenteDto utente) {
        utenteService.saveUtente(UtenteMapper.INSTANCE.map(utente));
    }

    @PutMapping("/updateUtente")
    public void updateUtente(@RequestBody UtenteDto utente) {
        utenteService.updateUtente(UtenteMapper.INSTANCE.map(utente));
    }

    @DeleteMapping("/deleteUtente")
    public void deleteUtente(@RequestParam Integer id) {
        utenteService.deleteUtente(id);
    }

    @GetMapping("/getUtenteById")
    public UtenteDto getUtenteById(@RequestParam Integer id) {
        Optional<Utente> utente = utenteService.getUtenteById(id);
        return UtenteMapper.INSTANCE.mapReverse(utente.isPresent() ? utente.get() : null);
    }

    @GetMapping("/getUtenti")
    public List<UtenteDto> getUtenti() {
        List<Utente> list = utenteService.getUtenti();
        return list.stream().map(UtenteMapper.INSTANCE::mapReverse).collect(Collectors.toList());
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDto login){
        return utenteService.login(login.getUsername(), login.getPassword());
    }

    @GetMapping("/getIscrizioni")
    public List<Attivita> getIscrizioni(@RequestBody IscrizioniDto payload){
        return utenteService.getIscrizioni(payload.getBearerToken(), payload.getUsername(), payload.getId());
    }

    @PostMapping("/iscrizioneAdAttivita")
    public String iscrizioneAdAttivita(@RequestBody IscrizioneDto payload){
        return utenteService.iscrizioneAdAttivita(payload.getBearerToken(), payload.getUsername(), payload.getId(), payload.getIdAttivita());
    }

    @PostMapping("/cancellazioneDaAttivita")
    public String cancellazioneDaAttivita(@RequestBody IscrizioneDto payload) {
        return utenteService.cancellazioneDaAttivita(payload.getBearerToken(), payload.getUsername(), payload.getId(), payload.getIdAttivita());
    }
}
