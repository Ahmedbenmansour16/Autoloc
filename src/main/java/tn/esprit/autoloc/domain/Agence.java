package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
// les relation
    @OneToMany(fetch = FetchType.EAGER)
    List<Employe> employes = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER)
    List<Vehicule> vehicules = new ArrayList<>();
}
