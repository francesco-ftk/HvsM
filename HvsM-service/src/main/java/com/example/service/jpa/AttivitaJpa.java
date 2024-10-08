package com.example.service.jpa;

import com.example.service.entity.Attivita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AttivitaJpa extends JpaRepository<Attivita, Integer> {

    @Query("SELECT a FROM Attivita a WHERE (:nome IS NULL OR :nome = '' OR a.nome = :nome) AND (:inizio IS NULL OR :inizio = '' OR a.inizio = :inizio)")
    List<Attivita> findByNomeAndGiorno(@Param("nome") String nome, @Param("inizio") LocalDateTime inizio);

}
