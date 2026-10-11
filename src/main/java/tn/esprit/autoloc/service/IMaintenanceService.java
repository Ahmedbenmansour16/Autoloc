package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService{
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance afficherMaintenanceById(Long id);
    List<Maintenance> afficherAllMaintenances();
    void supprimerMaintenance(long id);
    
}
