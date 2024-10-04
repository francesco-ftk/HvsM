package groupId;

import groupId.entity.Attivita;
import groupId.entity.Utente;
import groupId.security.BearerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UtenteService {

    @Autowired
    private UtenteJpa utenteJpa;

    @Autowired
    private BearerService bearerService;

    @Autowired
    private AttivitaJpa attivitaJpa;

    public String login(String username, String password) {
        Utente utente = utenteJpa.findByUsernameAndPassword(username, password);
        if (utente != null) {
            return bearerService.generateToken(username);
        }
        return "AUTHENTICATION FAILED";
    }

    public void saveUtente(Utente utente) {
        utenteJpa.save(utente);
    }

    public List<Attivita> getIscrizioni(String bearerToken, String username, int id) {
        if(bearerService.validateToken(bearerToken, username)){
            Optional<Utente> utente = utenteJpa.findById(id);
            if(utente.isPresent()){
                List<Attivita> response = new ArrayList<>();
                for (Integer idAttivita : utente.get().getIscrizioni()) {
                    Optional<Attivita> attivita = attivitaJpa.findById(idAttivita);
                    if(attivita.isPresent()){
                        response.add(attivita.get());
                    }
                }
                return response;
            } else {
                throw new RuntimeException("UTENTE NON TROVATO");
            }
        } else {
            throw new RuntimeException("AUTHENTICATION FAILED");
        }
    }
}
