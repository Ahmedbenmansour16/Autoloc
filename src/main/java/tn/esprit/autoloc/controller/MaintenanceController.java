package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenances")
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;

    // http://localhost:8080/maintenances/afficherToutesMaintenances
    @GetMapping("/afficherToutesMaintenances")
    public List<Maintenance> listMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    // http://localhost:8080/maintenances/ajouterMaintenance
    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    // http://localhost:8080/maintenances/modifierMaintenance
    @PutMapping({"", "/modifierMaintenance"})
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    // http://localhost:8080/maintenances/afficherMaintenance/{id}
    @GetMapping("/afficherMaintenance/{id}")
    public Maintenance afficherMaintenance(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    // http://localhost:8080/maintenances/supprimerMaintenance/{id}
    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}
