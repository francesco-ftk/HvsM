package com.example.jpa;

import com.example.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteJpa extends JpaRepository<Utente, Integer> {

    Utente findByUsernameAndPassword(String username, String password);
}
