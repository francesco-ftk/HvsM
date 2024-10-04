package groupId;

import groupId.entity.Attivita;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
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
        List<Attivita> attivita = attivitaJpa.findByNomeAndGiorno(filtroAttivita.getNome(), filtroAttivita.getGiorno());
        if(filtroAttivita.isDisponibilita()){
            return attivita.stream().filter(a -> a.getNumeroPostiDisponibili() > a.getNumeroPostiOccupati()).collect(Collectors.toList());
        }
        return attivita;
    }
}
