package tn.esprit.autoloc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquioement;
    String linelle;
}
