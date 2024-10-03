package groupId.jpa;

import groupId.Attivita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttivitaJpa extends JpaRepository<Attivita, Integer> {

    List<Attivita> findByNome(String nome);

}
