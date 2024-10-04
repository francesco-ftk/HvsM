package groupId;

import groupId.jpa.AttivitaService;
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
        Attivita attivita = AttivitaMapper.INSTANCE.map(payload);
        attivitaService.addAttivita(attivita);
    }

    @PutMapping("/updateAttivita")
    public void updateAttivita(@RequestBody AttivitaDto payload) {
        Attivita attivita = AttivitaMapper.INSTANCE.map(payload);
        attivitaService.updateAttivita(attivita);
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
        List<AttivitaDto> result = list.stream().map(AttivitaMapper.INSTANCE::mapReverse).collect(Collectors.toList());
        return result;
    }
}
