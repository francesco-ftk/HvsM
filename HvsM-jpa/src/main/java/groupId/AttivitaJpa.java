package groupId;

import groupId.entity.Attivita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AttivitaJpa extends JpaRepository<Attivita, Integer> {

    @Query("SELECT a FROM Attivita a WHERE (:nome IS NULL OR :nome = '' OR a.nome = :nome) AND (:giorno IS NULL OR :giorno = '' OR a.giorno = :giorno)")
    List<Attivita> findByNomeAndGiorno(@Param("nome") String nome, @Param("giorno") LocalDate giorno);

}
