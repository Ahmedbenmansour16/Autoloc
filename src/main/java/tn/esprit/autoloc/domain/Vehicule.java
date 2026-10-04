package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

    //les relation
    @ManyToMany(fetch = FetchType.EAGER)
    List<Equipement> equipements = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER)
    List<Maintenance> maintenances = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER)
    List<Reservation> reservations = new ArrayList<>();

    @ManyToOne
    Agence agence;
}
