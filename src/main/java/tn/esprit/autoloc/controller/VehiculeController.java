package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicules")
public class VehiculeController {
    private final IVehiculeService vehiculeService;

    // http://localhost:8080/vehicules/afficherToutesVehicules
    @GetMapping("/afficherToutesVehicules")
    public List<Vehicule> listVehicules() {
        return vehiculeService.getAllVehicule();
    }
    // http://localhost:8080/vehicules/ajouterVehicule
    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }
    // http://localhost:8080/vehicules/modifierVehicule
    @PutMapping({"", "/modifierVehicule"})
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }
    // http://localhost:8080/vehicules/afficherVehicule/{id}
    @GetMapping("/afficherVehicule/{id}")
    public Vehicule afficherVehicule(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    // http://localhost:8080/vehicules/supprimerVehicule/{id}
    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}
