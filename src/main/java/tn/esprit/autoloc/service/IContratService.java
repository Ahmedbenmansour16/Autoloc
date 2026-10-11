package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;


public interface IContratService{
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContratContrat(Contrat contrat);
    Contrat afficherContratById(Long id);
    List<Contrat> afficherAllContrat();
    void supprimerContrat(long id);
}
