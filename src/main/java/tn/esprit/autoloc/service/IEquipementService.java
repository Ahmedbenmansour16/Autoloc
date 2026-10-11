package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    Equipement afficherEquipementById(Long id);
    List<Equipement> afficherAllEquipement();
    void supprimerEquipement(long id);
}
