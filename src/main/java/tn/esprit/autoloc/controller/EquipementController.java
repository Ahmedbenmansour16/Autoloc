package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipements")
public class EquipementController {
    private final IEquipementService equipementService;

    // http://localhost:8080/equipements/afficherTousEquipements
    @GetMapping("/afficherTousEquipements")
    public List<Equipement> listEquipements() {
        return equipementService.getAllEquipement();
    }

    // http://localhost:8080/equipements/ajouterEquipement
    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    // http://localhost:8080/equipements/modifierEquipement
    @PutMapping({"", "/modifierEquipement"})
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    // http://localhost:8080/equipements/afficherEquipement/{id}
    @GetMapping("/afficherEquipement/{id}")
    public Equipement afficherEquipement(@PathVariable Long id) {
        return equipementService.getEquipement(id);
    }

    // http://localhost:8080/equipements/supprimerEquipement/{id}
    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}
