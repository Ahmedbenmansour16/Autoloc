package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierClient(Agence agence);
    Agence afficherClientById(Long id);
    List<Agence> afficherAllAgences();
    void supprimerAgence(long id);
}
