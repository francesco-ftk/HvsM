package groupId;

import groupId.jpa.AttivitaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AttivitaController {

    @Autowired
    private AttivitaJpa attivitaJpa;

    @GetMapping("/attivita")
    public String getAttivita(@RequestParam String nome) {
        List<Attivita> list =  attivitaJpa.findByNome(nome);
        return String.valueOf(list.size()) + " attività trovate";
    }

    @PutMapping("/attivita")
    public void saveAttivita(@RequestParam String nome) {
        Attivita attivita = new Attivita();
        attivita.setNome(nome);
        attivita.setLuogo("FIRENZE");
        attivita.setDataInizio(LocalDate.now());
        attivita.setDataFine(LocalDate.now());
        attivita.setNumeroPostiDisponibili(20);
        attivita.setNumeroPostiOccupati(0);
        attivitaJpa.save(attivita);
    }

}
