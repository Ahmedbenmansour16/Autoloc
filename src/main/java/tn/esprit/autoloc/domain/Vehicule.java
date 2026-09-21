package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    BigDecimal tarifJounalier;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

}
