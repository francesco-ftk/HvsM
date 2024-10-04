package groupId;

import groupId.entity.Attivita;
import groupId.entity.Utente;
import groupId.entitymapper.UtenteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/addUtente")
    public void addUtente(@RequestBody UtenteDto utente) {
        utenteService.saveUtente(UtenteMapper.INSTANCE.map(utente));
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDto login){
        return utenteService.login(login.getUsername(), login.getPassword());
    }

    @GetMapping("/getIscrizioni")
    public List<Attivita> getIscrizioni(@RequestBody IscrizioniDto payload){
        return utenteService.getIscrizioni(payload.getBearerToken(), payload.getUsername(), payload.getId());
    }
}
