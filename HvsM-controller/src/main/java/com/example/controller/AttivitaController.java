package com.example.controller;

import com.example.dto.AttivitaDto;
import com.example.mapper.FiltroAttivitaMapper;
import com.example.service.AttivitaService;
import com.example.dto.FiltroAttivitaDto;
import com.example.entity.Attivita;
import com.example.entitymapper.AttivitaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class AttivitaController {

    @Autowired
    private AttivitaService attivitaService;

    @PostMapping("/addAttivita")
    public void addAttivita(@RequestBody AttivitaDto payload) {
        attivitaService.addAttivita(AttivitaMapper.INSTANCE.map(payload));
    }

    @PutMapping("/updateAttivita")
    public void updateAttivita(@RequestBody AttivitaDto payload) {
        attivitaService.updateAttivita(AttivitaMapper.INSTANCE.map(payload));
    }

    @DeleteMapping("/deleteAttivita")
    public void deleteAttivita(@RequestParam Integer id) {
        attivitaService.deleteAttivita(id);
    }

    @GetMapping("/getAttivitaById")
    public AttivitaDto getAttivitaById(@RequestParam Integer id) {
        Optional<Attivita> attivita = attivitaService.getAttivitaById(id);
        return AttivitaMapper.INSTANCE.mapReverse(attivita.isPresent() ? attivita.get() : null);
    }

    @GetMapping("/getAttivita")
    public List<AttivitaDto> getAttivita() {
        List<Attivita> list = attivitaService.getAttivita();
        return list.stream().map(AttivitaMapper.INSTANCE::mapReverse).collect(Collectors.toList());
    }

    @GetMapping("/filtraAttivita")
    public List<AttivitaDto> getAttivitaByFilter(@RequestBody FiltroAttivitaDto filtroAttivita) {
        List<Attivita> list = attivitaService.getAttivitaByFilter(FiltroAttivitaMapper.INSTANCE.map(filtroAttivita));
        return list.stream().map(AttivitaMapper.INSTANCE::mapReverse).collect(Collectors.toList());
    }
}
